import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.naming.event.ObjectChangeListener;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class JuicyBoysBaseVisitorCustom extends JuicyBoysBaseVisitor {


    private Stack<Scope> scopes;
    private SymbolTable symbolTable;
    private boolean hasError;
    private String errorCode = "";
    private ArrayList<Function> masterFuncList;

    private JTextArea outputArea;

    private ParseTree parseTree;

    public JuicyBoysBaseVisitorCustom(JTextArea outputArea) {

        this.outputArea = outputArea;
        hasError = false;
        //for global siguro



        masterFuncList = new ArrayList<Function>();

        //local or global, this will dictate
        scopes = new Stack<Scope>();

        symbolTable = new SymbolTable();
        scopes.push(new Scope(ScopeType.GLOBAL, "Global", null));
    }


    @Override
    public Object visitMemberDecl(JuicyBoysParser.MemberDeclContext ctx) {

        Object a = super.visit(ctx.memberDeclaration());

        if(a!=null){
            Function function = (Function) a;


            scopes.push(new Scope(ScopeType.GLOBAL, function.getSignature(), null));

            masterFuncList.add(function);
        }


        return null;
    }




    @Override
    public Object visitMemberDeclaration(JuicyBoysParser.MemberDeclarationContext ctx) {

        Object returnType = super.visit(ctx.type());
//        Object functionName = ctx.methodDeclaration().Identifier();
//
//        //save parameters here
//        Object getParameters = super.visit(ctx.methodDeclaration());

        //should be traversed when function is called
        JuicyBoysParser.MethodBodyContext getMethodBody = ctx.methodDeclaration().methodDeclaratorRest().methodBody();

        Object methodDec = (Object) super.visit(ctx.methodDeclaration());

        ArrayList<Variable> params = (ArrayList<Variable>) methodDec;

        Function newFunction = new Function(ctx.type().getText().toString(),
                ctx.methodDeclaration().Identifier().getText().toString(),
                params,
                getMethodBody);

        return newFunction;
    }

    @Override
    public Object visitMethodDeclaration(JuicyBoysParser.MethodDeclarationContext ctx) {

        //Object funcName = ctx.Identifier();
        ArrayList<Variable> params = (ArrayList<Variable>) super.visit(ctx.methodDeclaratorRest());

        //Function function = new Function(null, ctx.Identifier().getText(), params, null);
        //JOptionPane.showMessageDialog(null, "LAMAN NI FUNCTION - identifier: " + ctx.Identifier().getText());

        return params;
    }

    @Override
    public Object visitMethodDeclaratorRest(JuicyBoysParser.MethodDeclaratorRestContext ctx) {


        ArrayList<Variable> a = (ArrayList<Variable>) super.visit(ctx.formalParameters());


        //uncomment to visit the code
        //super.visit(ctx.methodBody());
        //we do not visit this kasi if we did, marurun yung code, which we do not want kasi dapaat sa second or third pass pa. anyway

        return a;
    }

    @Override
    public Object visitFormalParameters(JuicyBoysParser.FormalParametersContext ctx) {
        ArrayList<Variable> params = new ArrayList<Variable>();

        /*params = (ArrayList<Variable>) super.visit(ctx.formalParameterDecls());*/
/*
        return params;
*/


        //

        //store the non recurive one based CFG
        List<JuicyBoysParser.FormalParameterDeclsContext> formalParameters = ctx.formalParameterDecls();

        for (int j = 0; j < formalParameters.size(); j++) {

            Variable v = new Variable(formalParameters.get(j).type().primitiveType().getText(), formalParameters.get(j).variableDeclaratorId().Identifier().getText());
            params.add(v);
        }

        //JOptionPane.showMessageDialog(null,params.size());
        return params;
    }

    @Override
    public Object visitBlockStatement(JuicyBoysParser.BlockStatementContext ctx) {

        Object a = ctx.statement();
        Object b = ctx.localVariableDeclarationStatement();

        if ( a != null) {
            return super.visit(ctx.statement());
        }
        else if ( b != null) {
            return super.visit(ctx.localVariableDeclarationStatement());
        }

        return null;
    }

    @Override
    public Object visitBlock(JuicyBoysParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitMethodBody(JuicyBoysParser.MethodBodyContext ctx) {


/*
        Object a = super.visit(ctx.block());
*/

        Object a = super.visit(ctx.block());


        if(a!= null){
            return a;
        }

        return null;

    }


    @Override
    public Object visitHashtagReturnStatement(JuicyBoysParser.HashtagReturnStatementContext ctx) {

        Object toBeReturned = super.visit(ctx.expression());


        if(toBeReturned!=null){
            return toBeReturned;
        }
        return null;

    }

    @Override
    public Object visitFunctionCall(JuicyBoysParser.FunctionCallContext ctx) {
        //return super.visitFunctionCall(ctx);

        int i =0;
        while(true){
            if(masterFuncList.get(i).getSignature().equals(ctx.Identifier().getText().toString())) {
                //create its scope
                scopes.push(new Scope(ScopeType.LOCAL, ctx.Identifier().getText().toString(), null));


                super.visit(masterFuncList.get(i).getContext().block());

                //  List<JuicyBoysParser.BlockStatementContext> blockStmts =  masterFuncList.get(i).getContext().block().blockStatement();
                //  JOptionPane.showMessageDialog(null, "BLOCK STATEMENTS SIZE: " + blockStmts.size() + " Function: " + masterFuncList.get(i).getSignature().toString());




                Object returnedValue = super.visit(masterFuncList.get(i).getContext().block().blockStatement().get(masterFuncList.get(i).getContext().block().blockStatement().size()-1));

                if(masterFuncList.get(i).getReturn_type().equals("void")){

                    scopes.pop();
                    return null;
                }

                Object castChecker = null;

                try{
                    castChecker = Integer.parseInt(returnedValue.toString());
                    if(masterFuncList.get(i).getReturn_type().equals("int") && castChecker instanceof Integer) {
                        scopes.pop();
                        //pop its scope
                        return castChecker.toString();
                    }

                }catch (Exception e){
                    try{
                        castChecker = Double.parseDouble(returnedValue.toString());
                        if(masterFuncList.get(i).getReturn_type().equals("double") && castChecker instanceof Double) {
                            scopes.pop();
                            //pop its scope
                            return castChecker.toString();
                        }
                    }
                    catch (Exception e2){
                        try{
                            castChecker = returnedValue.toString();
                            scopes.pop();
                            //pop its scope
                            return castChecker.toString();


                        } catch (Exception e3){
                            scopes.pop();
                            hasError = true;
                            errorCode += "\n Returned input type for function cannot be read";
                            e3.printStackTrace();

                            return null;
                        }
                    }
                }

                break;



            }



            i++;
        }
        /*for(int i = 0; i < masterFuncList.size(); i++){*/



            /*if(masterFuncList.get(i).getSignature().equals(ctx.Identifier().getText().toString())) {
               //create its scope
                scopes.push(new Scope(ScopeType.LOCAL, ctx.Identifier().getText().toString(), null));


                super.visit(masterFuncList.get(i).getContext().block());

              //  List<JuicyBoysParser.BlockStatementContext> blockStmts =  masterFuncList.get(i).getContext().block().blockStatement();
              //  JOptionPane.showMessageDialog(null, "BLOCK STATEMENTS SIZE: " + blockStmts.size() + " Function: " + masterFuncList.get(i).getSignature().toString());



                Object returnedValue = super.visit(masterFuncList.get(i).getContext().block().blockStatement().get(masterFuncList.get(i).getContext().block().blockStatement().size()-1));

                if(masterFuncList.get(i).getReturn_type().equals("void")){

                    scopes.pop();
                    return null;
                }

                Object castChecker = null;

                try{
                    castChecker = Integer.parseInt(returnedValue.toString());
                    if(masterFuncList.get(i).getReturn_type().equals("int") && castChecker instanceof Integer) {
                        scopes.pop();
                        //pop its scope
                        return castChecker.toString();
                    }

                }catch (Exception e){
                    try{
                        castChecker = Double.parseDouble(returnedValue.toString());
                        if(masterFuncList.get(i).getReturn_type().equals("double") && castChecker instanceof Double) {
                            scopes.pop();
                            //pop its scope
                            return castChecker.toString();
                        }
                    }
                    catch (Exception e2){
                        try{
                            castChecker = returnedValue.toString();
                            scopes.pop();
                            //pop its scope
                            return castChecker.toString();


                        } catch (Exception e3){
                            scopes.pop();
                            hasError = true;
                            errorCode += "\n Returned input type for function cannot be read";
                            e3.printStackTrace();

                            return null;
                        }
                    }
                }

                break;



            }*/
        /*}*/
        return null;

    }



    public Set printStack() {


        ArrayList<Scope> list = new ArrayList(scopes);


        System.out.print("Size ni list: " + list.size());

//        for(int i = 0; i < list.size(); i++){
//            for(int j = 0; j < list.get(i)..getSymbolMap().size(); j++){
//
//
//                Variable var = (Variable) list.get(i).getSymbolMap().get(j);
//
//                System.out.println(var.getName());
//                System.out.println(var.getValue());
//
//            }
//        }

        Set set = scopes.peek().getSymbolMap().entrySet();
       /* Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("key" + mentry.getKey());
            System.out.println("values" + mentry.getValue());
        }
*/
        while(!scopes.empty())
            System.out.println(scopes.pop().getList());
        return set;
/*
        // method 2:
       while(!scopes.empty())
               System.out.println(scopes.pop().getList());*/
    }




    /*
    @Override
    public Object visitCompilationUnit(@NotNull JuicyBoysParser.CompilationUnitContext ctx) {
        System.out.println("hello");
        string1 = "elo";
        //create a new scope yata
//        symbolTable.enterScope();
//        super.visit(ctx.parent);
 //       System.out.println(ctx.parent.getText());

//        symbolTab visitChildren(ctx);le.exitScope();

        return null;
    }
*/


  /*  @Override
    public Object visitStatement(JuicyBoysParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }*/



    public void printNoPop(){

        /*Stack<Scope> scopesCopy = scopes;
        while(!scopesCopy.empty())
            System.out.println(scopesCopy.pop().getList());*/
    }

    @Override
    public Object visitHashtagIfStatement(JuicyBoysParser.HashtagIfStatementContext ctx) {

        if(super.visit(ctx.parExpression())!=null) {
            // JOptionPane.showMessageDialog(null, "Here: " + super.visit((ctx.parExpression())).toString());
            if(super.visit(ctx.parExpression()) instanceof Boolean)
            {
                if ((boolean) super.visit(ctx.parExpression()) == true) {
                    System.out.println("PUMASOK");
                    return super.visit(ctx.statement(0));

                } else if ((boolean) super.visit(ctx.parExpression()) == false) {
                    System.out.println("HINDI PUMASOK");
                    Object c = ctx.statement(1);
                    if(c!=null)
                        return super.visit(ctx.statement(1));
                    else
                        return null;
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }


        }
        System.out.println("PUMASOK SA HASHTAGIFSTATEMENt");
        return null;
    }

    @Override
    public Object visitParExpression(JuicyBoysParser.ParExpressionContext ctx) {
        Object a = super.visit(ctx.expression());

        if(a!=null)
            return a;
        return null;
    }

    @Override
    public Object visitEqualityExpression(JuicyBoysParser.EqualityExpressionContext ctx) {



        Object a = super.visit(ctx.instanceOfExpression(0));



        if(a != null){

            if(a instanceof Boolean){
                if((Boolean) a == true){
                    return true;
                }
                else if ((Boolean) a == false){
                    return false;
                }
            }


            Object temp = null;
            try{
                temp = Integer.parseInt(a.toString());
            }catch(Exception e){
                try{
                    temp = Double.parseDouble(a.toString());
                }catch (Exception e1){
                    try{
                        temp = a.toString();
                    }catch(Exception e2){
                        e2.printStackTrace();

                    }
                }
            }
            //store the non recurive one based CFG
            List<JuicyBoysParser.InstanceOfExpressionContext> instanceOfExpressionContexts =  ctx.instanceOfExpression();
            List<JuicyBoysParser.EqualORnotequalContext> equalORnotEqual =  ctx.equalORnotequal();

            for(int j = 1; j < instanceOfExpressionContexts.size(); j++){

                //^^ iterating through all multExps kasi *

                try
                {
                    Object b = null;
                    if(instanceOfExpressionContexts.get(j).relationalExpression()!=null){
                        b = super.visit(instanceOfExpressionContexts.get(j));
                    }

                    Object nextNumber = null;


                    try{
                        nextNumber = Integer.parseInt(b.toString());;
                    }catch(Exception e){
                        try{
                            nextNumber = Double.parseDouble(b.toString());
                        }catch (Exception e1){
                            try{
                                nextNumber = a.toString();
                            }catch(Exception e2){
                                e2.printStackTrace();

                            }                        }
                    }

                    if(temp instanceof Integer && nextNumber instanceof  Integer)
                    {
                        System.out.println("Instance is an Integer");
                        if(equalORnotEqual.get(j-1).EQUAL()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside EQUAL with Instance value: " + (int)nextNumber);
                            if((int)temp == (int)nextNumber) {
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                                return true;

                            }else
                            {
                                System.out.println("NOT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                                return false;
                            }
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        else if(equalORnotEqual.get(j-1).NOTEQUAL()!=null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside NotEqual with Instance value: " + (int) nextNumber);
                            if ((int) temp != (int) nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                    }
                    else if(temp instanceof Double && nextNumber instanceof  Double) {
                        System.out.println("Instance is Double");
                        if (equalORnotEqual.get(j - 1).EQUAL() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside Equal with Instance value: " + (double) nextNumber);
                            if ((double) temp == (double) nextNumber) {
                                return true;

                            } else {
                                return false;
                            }
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (equalORnotEqual.get(j - 1).NOTEQUAL() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside NotEqual with Instance value: " + (double) nextNumber);
                            if ((double) temp != (double) nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }

                    }


                    else if(temp instanceof String && nextNumber instanceof  String) {
                        System.out.println("Instance is String");
                        if (equalORnotEqual.get(j - 1).EQUAL() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside Equal with Instance value: " + (String) nextNumber);
                            System.out.println("Temp: " + temp);
                            System.out.println("Next: " + nextNumber);

                            if (temp.equals(nextNumber)) {
                                return true;

                            } else {
                                return false;
                            }
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (equalORnotEqual.get(j - 1).NOTEQUAL() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside NotEqual with Instance value: " + (String) nextNumber);
                            System.out.println("Temp: " + temp);
                            System.out.println("Next: " + nextNumber);
                            if (temp!=nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }

                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }


                //Object b = super.visitAdditiveExpression()
            }

            System.out.println("Answer in Additive Expression: " + temp);


            return (temp);

        }



        return super.visitEqualityExpression(ctx);
    }

    @Override
    public Object visitRelationalExpression(JuicyBoysParser.RelationalExpressionContext ctx) {

        Object a = super.visit(ctx.shiftExpression(0));

        if(a != null){


            Object temp = null;
            try{
                temp = Integer.parseInt(a.toString());
            }catch(Exception e){
                try{
                    temp = Double.parseDouble(a.toString());
                }catch (Exception e1){
                    try{
                        temp = a.toString();
                        System.out.print("You cannot perform relational (>, <, >=, <=) operation on strings: " +temp);
                        hasError = true;

                        String newErrorCode = "\n You cannot perform relational (>, <, >=, <=) operation on strings: ";

                        if (!errorCode.contains(newErrorCode)) {


                            errorCode += newErrorCode;
                        }
                        return a.toString();

                        //relop for string
                    }catch (Exception e2){
                        e2.printStackTrace();

                    }
                }
            }
            //store the non recurive one based CFG
            List<JuicyBoysParser.ShiftExpressionContext> shiftExps =  ctx.shiftExpression();
            List<JuicyBoysParser.RelationalOpContext> relops =  ctx.relationalOp();

            for(int j = 1; j < shiftExps.size(); j++){

                //^^ iterating through all multExps kasi *

                try
                {
                    Object b = null;
                    if(shiftExps.get(j).additiveExpression(1)==null)
                        b = super.visit(shiftExps.get(j).additiveExpression(0));

                    else {
                        b = super.visit(shiftExps.get(j));
                    }

                    Object nextNumber = null;


                    try{
                        nextNumber = Integer.parseInt(b.toString());;
                    }catch(Exception e){
                        try{
                            nextNumber = Double.parseDouble(b.toString());
                        }catch (Exception e1){
                            try{
                                return nextNumber.toString();

                                //relop for string
                            }catch (Exception e2){
                                e2.printStackTrace();

                            }
                        }
                    }

                    if(temp instanceof Integer && nextNumber instanceof  Integer)
                    {
                        System.out.println("Instance is an Integer");
                        if(relops.get(j-1).LT()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside LT with Instance value: " + (int)nextNumber);
                            if((int)temp < (int)nextNumber) {
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                                return true;

                            }else
                            {
                                System.out.println("NOT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                                return false;
                            }
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        else if(relops.get(j-1).GT()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside GT with Instance value: " + (int)nextNumber);
                            if((int)temp > (int)nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        if(relops.get(j-1).LE()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside LE with Instance value: " + (int)nextNumber);
                            if((int)temp <= (int)nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        if(relops.get(j-1).GE()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside GE with Instance value: " + (int)nextNumber);
                            if((int)temp >= (int)nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                    }
                    else if(temp instanceof Double && nextNumber instanceof  Double) {
                        System.out.println("Instance is Double");
                        if (relops.get(j - 1).LT() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside LT with Instance value: " + (double) nextNumber);
                            if ((double) temp < (double) nextNumber) {
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                                return true;

                            } else {
                                System.out.println("NOT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                                return false;
                            }
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (relops.get(j - 1).GT() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside GT with Instance value: " + (double) nextNumber);
                            if ((double) temp > (double) nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        if (relops.get(j - 1).LE() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside LE with Instance value: " + (double) nextNumber);
                            if ((double) temp <= (double) nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        if (relops.get(j - 1).GE() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside GE with Instance value: " + (double) nextNumber);
                            if ((double) temp >= (double) nextNumber)
                                return true;
                            else
                                return false;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }


                //Object b = super.visitAdditiveExpression()
            }

            System.out.println("Answer in Additive Expression: " + temp);


            return (temp);

        }


        //
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public Object visitLocalVariableDeclarationStatement(JuicyBoysParser.LocalVariableDeclarationStatementContext ctx) {
        return super.visitLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public Object visitVariableDeclaratorId(JuicyBoysParser.VariableDeclaratorIdContext ctx) {
        // JOptionPane.showMessageDialog(null, "Inside VariableDeclaratorIdContext: " + ctx.getText().toString());

        return super.visitVariableDeclaratorId(ctx);
    }


    @Override
    public Object visitIoStatement(JuicyBoysParser.IoStatementContext ctx) {


      /*  Object a = super.visit(ctx.input_statement());
        if(a!=null){



            Variable var = (Variable) scopes.peek().lookup(ctx.ide);
            var.setValue(new Value(newValue));
        }*/
        return super.visitIoStatement(ctx);
    }

   /* @Override
    public Object visitInputText(JuicyBoysParser.InputTextContext ctx) {
        return JOptionPane.showInputDialog("Input").toString();
    }*/

    @Override
    public Object visitInput_statement(JuicyBoysParser.Input_statementContext ctx) {

       /* Object a = super.visit(ctx.inputText());*/
        Object input = JOptionPane.showInputDialog("Input");
        System.out.println("String to contain: "+ ctx.Identifier() + " input text: " + input);


        Variable var = (Variable) scopes.peek().lookup(ctx.Identifier().toString());




        if(var!=null){

            Object castChecker = null;
            try{
                castChecker = Integer.parseInt(input.toString());
            }catch (Exception e){
                try{
                    castChecker = Double.parseDouble(input.toString());
                }
                catch (Exception e2){
                    try{
                        castChecker = input.toString();

                    } catch (Exception e3){
                        hasError = true;
                        errorCode += "\n Scanned input cannot be parsed";
                        e3.printStackTrace();
                    }
                }
            }

            if(castChecker instanceof Integer && var.getDataType().equals("int")){
                var.setValue(new Value(input));
            }
            else if(castChecker instanceof Double && var.getDataType().equals("double")){
                var.setValue(new Value(input));
            }
            else if(var.getDataType().equals("String")){
                var.setValue(new Value(input));
            }
            else{
                hasError =true;
                errorCode += "\n Variable to receive input is incompatible with the scanned input.";
            }
        }

        else if(var==null){
            hasError = true;
            errorCode += "\n Variable to contain input does not exist";
        }


        return null;
        //return super.visitInput_statement(ctx);

    }

    @Override
    public Object visitHashtagForStatement(JuicyBoysParser.HashtagForStatementContext ctx) {

        super.visit(ctx.forControl().forInit());
        Object condition = super.visit(ctx.forControl());

        if (condition instanceof Boolean) {
            System.out.println("inside condition instance of boolean");
            if ((Boolean) condition == true) {
                System.out.println("for condition is true");
                do {
                    super.visit(ctx.statement());
                    condition = super.visit(ctx.forControl());
                    // super.visit(ctx.forControl().forUpdate().expressionList().expression(0));
                    super.visit(ctx.forControl().localVariableDeclaration());
                    // super.visit(ctx.forControl().expression(1));

                    System.out.print("INSIDE LOOPPPPPPPPPPPPPPPPPPP pPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP true paren");



                    Variable var = (Variable) scopes.peek().lookup("i");
                    System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII: " + var.getValue());
                } while ((Boolean) condition == true);
            }
        }
        else
            System.out.println("not inside condition instance of boolean");
        return super.visitHashtagForStatement(ctx);
    }


    @Override
    public Object visitForUpdate(JuicyBoysParser.ForUpdateContext ctx) {

        return super.visit(ctx.expressionList().expression(0));
        //return super.visitForUpdate(ctx);
    }


    @Override
    public Object visitForControl(JuicyBoysParser.ForControlContext ctx) {
        //returns boolean
        Object secondParam = super.visit(ctx.expression());

        System.out.println("laman ni secondParam: " + secondParam.toString());
        Object castChecker = null;

        if(secondParam!=null)
            try{
                castChecker = (Boolean) secondParam;
                return castChecker;
            }catch(Exception e){
                hasError = true;
                errorCode += "\n Error in For loop 2nd parameter";
                e.printStackTrace();
            }
        return null;
    }

    @Override
    public Object visitHashtagDoStatement(JuicyBoysParser.HashtagDoStatementContext ctx) {
        super.visit(ctx.statement());


        Object condition = super.visit(ctx.parExpression());

        if(condition!=null){
            if (condition instanceof Boolean) {
                System.out.println("inside condition instance of boolean");
                if ((Boolean) condition == true) {
                    System.out.println("for condition is true");
                    do {
                        super.visit(ctx.statement());
                        condition = super.visit(ctx.parExpression());
                    } while ((Boolean) condition == true);
                }

                System.out.println("LOOOOOOOOOOOOOOOOOOPZ");
            }
            else
                System.out.println("not inside condition instance of boolean");
        }
        else{
            hasError = true;
            errorCode += "\n Something is wrong with your do while syntax";
        }

        return null;
    }

    @Override
    public Object visitHashtagWhileStatement(JuicyBoysParser.HashtagWhileStatementContext ctx) {

        Object condition = super.visit(ctx.parExpression());

        if(condition!=null){
            if (condition instanceof Boolean) {
                System.out.println("inside condition instance of boolean");
                if ((Boolean) condition == true) {
                    System.out.println("for condition is true");
                    do {
                        super.visit(ctx.statement());
                        condition = super.visit(ctx.parExpression());
                    } while ((Boolean) condition == true);
                }

                System.out.println("LOOOOOOOOOOOOOOOOOOPZ");
            }
            else
                System.out.println("not inside condition instance of boolean");
        }
        else{
            hasError = true;
            errorCode += "\n Something is wrong with your while syntax";
        }

        return null;

        // return super.visitHashtagWhileStatement(ctx);
    }

    @Override
    public Object visitHashtagOutputVariable(JuicyBoysParser.HashtagOutputVariableContext ctx) {

        Object a = ctx.Identifier();

        Variable var = (Variable) scopes.peek().lookup(a.toString());

        if(var!=null){
            outputArea.setText(outputArea.getText() + var.getValue());
        }
        else{
            hasError = true;
            errorCode += "\n Variable to be printed does not exist";
        }

        return "OutputLN executed";
    }

    @Override
    public Object visitHashtagOutputLNVariable(JuicyBoysParser.HashtagOutputLNVariableContext ctx) {
        Object a = ctx.Identifier();

        Variable var = (Variable) scopes.peek().lookup(a.toString());

        if(var!=null){
            outputArea.setText(outputArea.getText() + var.getValue() + "\n");
        }
        else{
            hasError = true;
            errorCode += "\n Variable to be printed does not exist";
        }


        return "OutputLN executed";
    }

    @Override
    public Object visitHashtagOutputString(JuicyBoysParser.HashtagOutputStringContext ctx) {
        Object a = ctx.StringLiteral();

        outputArea.setText(outputArea.getText() + a.toString());

        return "OutputLN executed";
    }

    @Override
    public Object visitHashtagOutputLNString(JuicyBoysParser.HashtagOutputLNStringContext ctx) {
        Object a = ctx.StringLiteral();

        outputArea.setText(outputArea.getText()  + a.toString() + "\n");

        return "OutputLN executed";
    }

   /* @Override
    public Object visitAssignmentOperator(JuicyBoysParser.AssignmentOperatorContext ctx) {
        if(ctx.ASSIGN()!=null)
            return ctx.ASSIGN().getText();
        return null;
    }
    @Override
    public Object visitExpression(JuicyBoysParser.ExpressionContext ctx) {

        Object a = super.visit(ctx.conditionalExpression());
        System.out.println("MAY LAMAN BA ETO A: " + a.toString());

        try{
            if(super.visit(ctx.assignmentOperator())!=null)
            {
                System.out.print("SUPer visit assignment operator");
                Object assign = super.visit(ctx.assignmentOperator());
                System.out.print("laman ni assign: " + assign.toString());

                if(assign.toString()!=null)
                {
                    System.out.println("FRWSTTTADNAWIUAIDNWIAUDNAWIUDNIAWUDJ");

                    Variable var = (Variable) scopes.peek().lookup(a.toString());

                    var.setValue(new Value(20));
                    System.out.println("TRY NATIN I PRINTTTTTTTTTTTTTTTTTTTTTTTTT: "+ var.getValue());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }*/

    @Override
    public Object visitForInit(JuicyBoysParser.ForInitContext ctx) {

        return super.visit(ctx.localVariableDeclaration());
    }


    @Override
    public Object visitConditionalAndExpression(JuicyBoysParser.ConditionalAndExpressionContext ctx) {



        Boolean trueCollector = true;
        Object a = super.visit(ctx.inclusiveOrExpression(0));

        //Object b = null;



        try{
            trueCollector = (Boolean) a;
            if(a instanceof Boolean) {

                if (a != null) {

                    Object temp = null;

                    //store the non recurive one based CFG
                    List<JuicyBoysParser.InclusiveOrExpressionContext> inclOrExps = ctx.inclusiveOrExpression();
                    //Para sa + or -


                    for (int j = 1; j < inclOrExps.size(); j++) {

                        //^^ iterating through all multExps kasi *

                        try {
                            Object b = null;
                            if (inclOrExps.get(j).exclusiveOrExpression(1) == null)
                                b = super.visit(inclOrExps.get(j).exclusiveOrExpression(0));

                            else {
                                b = super.visit(inclOrExps.get(j));
                            }


                            Object nextNumber = null;


                            try {
                                nextNumber = (Boolean) b;
                            } catch (Exception e) {

                                hasError = true;
                                errorCode += "\n Error in determining if boolean or not";
                                e.printStackTrace();

                            }
                            if (ctx.AND() != null)
                                  /*  if ((Boolean) nextNumber == true) {

                                        trueCollector = trueCollector && (Boolean) nextNumber;
                                        System.out.println("------------------------------------------NEXT NUMBER IS TRUE: " + trueCollector);


                                    } else if ((Boolean) nextNumber == false) {
                                        trueCollector = trueCollector && (Boolean) nextNumber;
                                        System.out.println("------------------------------------------NEXT NUMBER IS FALSE: " + trueCollector);
                                    }*/
                                if ((Boolean) nextNumber == false) {
                                    trueCollector = trueCollector && (Boolean) nextNumber;
                                }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        //Object b = super.visitAdditiveExpression()
                    }


                }

            }

            return trueCollector;

        }

        catch (Exception e){
            return super.visitConditionalAndExpression(ctx);
        }

        // return super.visitConditionalAndExpression(ctx);

    }

    @Override
    public Object visitConditionalOrExpression(JuicyBoysParser.ConditionalOrExpressionContext ctx) {


        Boolean trueCollector = false;
        Object a = super.visit(ctx.conditionalAndExpression(0));

        try{
            trueCollector = (Boolean) a;

            if(a instanceof Boolean) {

                if (a != null) {


                    Object temp = null;

                    //store the non recurive one based CFG
                    List<JuicyBoysParser.ConditionalAndExpressionContext> conAndExps = ctx.conditionalAndExpression();
                    //Para sa + or -

                    //        Object b = super.visit(ctx.multiplicativeExpression(1));
      /*  for(JuicyBoysParser.MultiplicativeExpressionContext multExp : multExps)*/

                    for (int j = 1; j < conAndExps.size(); j++) {

                        //^^ iterating through all multExps kasi *

                        try {
                            Object b = null;
                            if (conAndExps.get(j).inclusiveOrExpression(1) == null)
                                b = super.visit(conAndExps.get(j).inclusiveOrExpression(0));

                            else {
                                b = super.visit(conAndExps.get(j));
                            }

                            Object nextNumber = null;


                            try {
                                nextNumber = (Boolean) b;
                            } catch (Exception e) {

                                hasError = true;
                                errorCode += "\n Error in determining if boolean or not";
                                e.printStackTrace();

                            }
                            if (ctx.OR() != null)
                                if ((Boolean) nextNumber == true) {
                                    trueCollector = trueCollector || (Boolean) nextNumber;
                                }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        //Object b = super.visitAdditiveExpression()
                    }


                }


            }

            return trueCollector;

        } catch(Exception e){
            return super.visitConditionalOrExpression(ctx);
        }



        //    return super.visitConditionalOrExpression(ctx);
    }


    @Override
    public Object visitInclusiveOrExpression(JuicyBoysParser.InclusiveOrExpressionContext ctx) {
        return super.visitInclusiveOrExpression(ctx);
    }

    @Override
    public Object visitExclusiveOrExpression(JuicyBoysParser.ExclusiveOrExpressionContext ctx) {
        return super.visitExclusiveOrExpression(ctx);
    }

    @Override
    public Object visitAndExpression(JuicyBoysParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }



    @Override
    public Object visitLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx) {

        System.out.println("---------- Visit LocalVariableDeclaration ----------");

        System.out.println("VALUE NI CTX TYPE: " + ctx.type());

        if(super.visit(ctx.type())!=null)
        {
            Variable a = (Variable)super.visit(ctx.variableDeclarators());
            a.setDataType(ctx.type().getText().toString());
            System.out.println("Variable a: " + a.toString());

            Object castChecker = null;
            try{
                castChecker = Integer.parseInt(a.getValue().toString());
            }
            catch (Exception e){
                try{
                    castChecker = Double.parseDouble(a.getValue().toString());

                }catch (Exception e1){
                    try{
                        // JOptionPane.showMessageDialog(null, "cast: " + super.visit(ctx.variableDeclarators()));
                        castChecker = a.getValue().toString();
                    }catch (Exception e2) {
                        hasError = true;
                        errorCode += "\n Di sya int or di sya double";
                        e2.printStackTrace();
                    }
                }
            }

            Variable var = (Variable) scopes.peek().lookup(a.getName().toString());

            if(var==null){

                if(castChecker instanceof Integer && a.getDataType().equals("int")){
                    //JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                    printNoPop();
                    scopes.peek().bind(a);
                }
                else if (castChecker instanceof Double && a.getDataType().equals("double")) {
                    //JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                    printNoPop();

                    scopes.peek().bind(a);

                }

                else if(castChecker instanceof String && a.getDataType().equals("String")){
                    //JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                    printNoPop();
                    scopes.peek().bind(a);
                }
                else if(castChecker instanceof Integer && a.getDataType().equals("const int")){
                    //JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                    printNoPop();
                    scopes.peek().bind(a);
                }

                else if(castChecker instanceof Double && a.getDataType().equals("const double")){
                    //JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                    printNoPop();
                    scopes.peek().bind(a);
                }


                else{
                    hasError = true;
                    errorCode += "\nName: " + a.getName() + " (data type: "+ a.getDataType() +") Not compatible with value: " + a.getValue();
                }
            }
            else if(var!=null){
                hasError = true;
                errorCode += "\nName: " + a.getName() + " (data type: "+ a.getDataType() +") Exists already";
            }



            System.out.println(a.toString());


            //scopes.push(new Scope(, String scopeName, RuleContext caller);



        }
        else
        {
            Variable a = (Variable)super.visit(ctx.variableDeclarators());
            System.out.println("VALUE NI A: " + a.getValue());
            System.out.println("Existing Variable a: " + a.toString());
            Object castChecker = null;
            try{
                castChecker = Integer.parseInt(a.getValue().toString());
            }
            catch (Exception e){
                try{
                    castChecker = Double.parseDouble(a.getValue().toString());

                }catch (Exception e1){
                    try{
                        // JOptionPane.showMessageDialog(null, "cast: " + super.visit(ctx.variableDeclarators()));
                        castChecker = a.getValue().toString();
                    }catch (Exception e2) {
                        hasError = true;
                        errorCode += "\n Di sya int or di sya double";
                        e2.printStackTrace();
                    }
                }
            }

            Variable var = (Variable) scopes.peek().lookup(a.getName());


            if(var!=null){

                Object newValue = null;
                try{
                    newValue =  Integer.parseInt(a.getValue().toString());
                }catch(Exception e)
                {
                    try{
                        newValue = Double.parseDouble(a.getValue().toString());
                    }catch (Exception e1){
                        try{
                            newValue = a.getValue().toString();
                        }
                        catch (Exception e2){
                            hasError = true;
                            errorCode += "\n Cannot read data type of value to be assigned to an existing variable";
                            e2.printStackTrace();
                        }
                    }


                }

                if(var.getDataType().equals("int") && newValue instanceof Integer){
                    //    JOptionPane.showMessageDialog(null, " Type: " + var.getDataType().toString() + "Name: " + var.getName() + "Value: " + newValue);


                    //check if variable exist

                    //scopes.peek().getSymbolMap().get(var.getName()).getScope().getSymbolMap().;
                    var = (Variable) scopes.peek().lookup(a.getName()
                    );
                    var.setValue(new Value(newValue));

                }

                else if(var.getDataType().equals("const int") && newValue instanceof Integer){
                    //    JOptionPane.showMessageDialog(null, " Type: " + var.getDataType().toString() + "Name: " + var.getName() + "Value: " + newValue);


                    //check if variable exist

                    //scopes.peek().getSymbolMap().get(var.getName()).getScope().getSymbolMap().;
                 /*   var = (Variable) scopes.peek().lookup(a.getName()
                    );
                    var.setValue(new Value(newValue));*/
                    hasError = true;
                    errorCode += "\n [Exisiting variable] Name: " + a.getName() + " cannot be changed to: " + a.getValue() +  " since it is a constant.";


                }
                else if(var.getDataType().equals("const float") && newValue instanceof Double){
                    //    JOptionPane.showMessageDialog(null, " Type: " + var.getDataType().toString() + "Name: " + var.getName() + "Value: " + newValue);


                    //check if variable exist

                    //scopes.peek().getSymbolMap().get(var.getName()).getScope().getSymbolMap().;
                 /*   var = (Variable) scopes.peek().lookup(a.getName()
                    );
                    var.setValue(new Value(newValue));*/
                    hasError = true;
                    errorCode += "\n [Exisiting variable] Name: " + a.getName() + " cannot be changed to: " + a.getValue() +  " since it is a constant.";


                }
                else if(var.getDataType().equals("double") && newValue instanceof Double){
                    //    JOptionPane.showMessageDialog(null, " Type: " + var.getDataType().toString() + "Name: " + var.getName() + "Value: " + newValue);


                    //check if variable exist

                    //scopes.peek().getSymbolMap().get(var.getName()).getScope().getSymbolMap().;
                    var = (Variable) scopes.peek().lookup(a.getName());
                    var.setValue(new Value(newValue));
                }
                else if(var.getDataType().equals("String")){
                    //    JOptionPane.showMessageDialog(null, " Type: " + var.getDataType().toString() + "Name: " + var.getName() + "Value: " + newValue);


                    //check if variable exist

                    //scopes.peek().getSymbolMap().get(var.getName()).getScope().getSymbolMap().;
                    var = (Variable) scopes.peek().lookup(a.getName());
                    var.setValue(new Value(newValue));
                }
/*
            if(var.getDataType().equals(a.getDataType())){

                }*/
                else{
                    hasError = true;
                    errorCode += "\n [Exisiting variable] Error, Name: " + a.getName() + " with data type: "+ a.getDataType() +" Not compatible with value: " + a.getValue();
                }



            }


            System.out.println(a.toString());


            //scopes.push(new Scope(, String scopeName, RuleContext caller);



        }

        return null;

    }


    @Override
    public Object visitPrimitiveType(JuicyBoysParser.PrimitiveTypeContext ctx) {

        if(ctx.BOOLEAN()!=null)
            return ctx.BOOLEAN().getText();
        else if(ctx.CHAR()!=null)
            return ctx.CHAR().getText();
        else if(ctx.BYTE()!=null)
            return ctx.BYTE().getText();
        else if(ctx.SHORT()!=null)
            return ctx.SHORT().getText();
        else if(ctx.INT()!=null)
            return ctx.INT().getText();
        else if(ctx.LONG()!=null)
            return ctx.LONG().getText();
        else if(ctx.FLOAT()!=null)
            return ctx.FLOAT().getText();
        else if(ctx.DOUBLE()!=null)
            return ctx.DOUBLE().getText();
        else if(ctx.STRING()!=null)
            return ctx.STRING().getText();
        else if(ctx.CONSTINT()!=null){
            return ctx.CONSTINT().getText();
        }
        else if(ctx.FLOATINT()!=null){
            return ctx.FLOATINT().getText();
        }
        else
            return null;
    }

    @Override
    public Object visitVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx) {
        Object a = null;
        Object b = null;

        if(ctx.variableDeclaratorId() != null) {
            a = ctx.variableDeclaratorId().getText();
        }
    /*    if(ctx.variableInitializer().functionCall() != null){
            JOptionPane.showMessageDialog(null, "nentered functioncall");

            b = super.visit(ctx.variableInitializer().functionCall());


        }*/

        if(ctx.variableInitializer() != null){
            b = super.visit(ctx.variableInitializer());
        }


        Variable v = new Variable(null, a.toString(), new Value(b));
        return v;
    }

    @Override
    public Object visitVariableDeclarators(JuicyBoysParser.VariableDeclaratorsContext ctx) {
        Object a = super.visit(ctx.variableDeclarator(0));

        if(a != null){
            return a;
        }

        return null;
    }



    @Override
    public Object visitRelationalOp(JuicyBoysParser.RelationalOpContext ctx) {
        if(ctx.GE() != null)
        {
            return ctx.GE().getText();
        }
        else if(ctx.LE() != null)
        {
            return ctx.LE().getText();
        }
        else if(ctx.GT() != null){
            return ctx.GT().getText();
        }
        else if(ctx.LT() != null){
            return ctx.LT().getText();
        }
        else {
            return null;
        }

    }

    @Override
    public Object visitCompilationUnit(@NotNull JuicyBoysParser.CompilationUnitContext ctx) {
        System.out.println("---------- Visited Compilation Unit ----------");

        scopes.push(new Scope(ScopeType.LOCAL, "Main", null));

        //create a new scope yata
//        symbolTable.enterScope();
//        super.visit(ctx.parent);
        //       System.out.println(ctx.parent.getText());

//        symbolTab visitChildren(ctx);le.exitScope();
        return super.visitCompilationUnit(ctx);
    }









    @Override public Object visitAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx)
    {
        System.out.println("---------- Visit Additive Expression ----------");
        //


        Object a = super.visit(ctx.multiplicativeExpression(0));

        if(a != null){


            Object temp = null;
            try{
                temp = Integer.parseInt(a.toString());
            }catch(Exception e){
                try{
                    temp = Double.parseDouble(a.toString());
                }catch (Exception e1){
                    try{
                        //if using string ex "test"
                        temp = a.toString();
                        return temp;
                    }catch(Exception e2){
                        e2.printStackTrace();

                    }

                }
            }
            //store the non recurive one based CFG
            List<JuicyBoysParser.MultiplicativeExpressionContext> multExps =  ctx.multiplicativeExpression();
            //Para sa + or -
            List<JuicyBoysParser.AddORsubContext> addORsubs =  ctx.addORsub();

            //        Object b = super.visit(ctx.multiplicativeExpression(1));
      /*  for(JuicyBoysParser.MultiplicativeExpressionContext multExp : multExps)*/

            for(int j = 1; j < multExps.size(); j++){

                //^^ iterating through all multExps kasi *

                try
                {
                    Object b = null;
                    if(multExps.get(j).unaryExpression(1)==null)
                        b = super.visit(multExps.get(j).unaryExpression(0));

                    else {
                        b = super.visit(multExps.get(j));
                    }

                    Object nextNumber = null;


                    try{
                        nextNumber = Integer.parseInt(b.toString());;
                    }catch(Exception e){
                        try{
                            nextNumber = Double.parseDouble(b.toString());
                        }catch (Exception e1){
                            e.printStackTrace();
                        }
                    }

                    if(temp instanceof Integer && nextNumber instanceof  Integer)
                    {
                        System.out.println("Instance is an Integer");
                        if(addORsubs.get(j-1).ADD()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside ADD with Instance value: " + (int)nextNumber);
                            temp = (int)temp + (int)nextNumber;

                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        else if(addORsubs.get(j-1).SUB()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;
                            System.out.println("inside SUB with Instance value: " + nextNumber);
                            temp = (int)temp - (int)nextNumber;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                  /*  if(ctx.SUB()!=null)
                    {
                        System.out.println("Subtracted: " + ((int)int1 - (int)int2));
                        //return (int)int1 - (int)int2;
                    }*/
                    }
                    else  if(temp instanceof Double && nextNumber instanceof Double)
                    {
                        System.out.println("Instance is an Integer");
                        if(addORsubs.get(j-1).ADD()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside ADD with Instance value: " + (double)nextNumber);
                            temp = (double)temp + (double)nextNumber;

                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                        else if(addORsubs.get(j-1).SUB()!=null)
                        {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;
                            System.out.println("inside SUB with Instance value: " + nextNumber);
                            temp = (double)temp - (double)nextNumber;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        }
                  /*  if(ctx.SUB()!=null)
                    {
                        System.out.println("Subtracted: " + ((int)int1 - (int)int2));
                        //return (int)int1 - (int)int2;
                    }*/
                    }
                    else{
                        System.out.println("Instance unknown");
                        hasError = true;
                        errorCode += "\nYou cannot perform the arithmetic using different variable data types: " + temp;
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }


                //Object b = super.visitAdditiveExpression()
            }

            System.out.println("Answer in Additive Expression: " + temp);


            return (temp);

        }
        return null;
        /*
        if(ctx.ADD() != null && super.visit(ctx.multiplicativeExpression(0))!= null && super.visit(ctx.multiplicativeExpression(1))!= null){
            Object addend = super.visit(ctx.multiplicativeExpression(0));
            System.out.println("Not null Add and multiplicative inverse");

        }
        else{
            System.out.println("Null Add and multiplicative inverse");
        }
        return visitChildren(ctx);*/
    }

    @Override
    public Object visitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx) {

        System.out.println("---------- Multiplicative Expression ----------");
        //
        Object a = super.visit(ctx.unaryExpression(0));



        if(a!=null) {
            //temporary fix

            Object temp = null;

            try{
                temp = Integer.parseInt(a.toString());
            }catch(Exception e){
                try{
                    temp = Double.parseDouble(a.toString());

                }catch (Exception e1){

                    try{
                        temp = a.toString();
                        System.out.println("------------------------------ here " +temp);
                      /*  if(scopes.peek().getSymbolMap().containsKey(a.toString())){
                            JOptionPane.showMessageDialog(null, "meron pre");

                        }*/
                    }catch (Exception e2){
                        hasError = true;
                        errorCode += "\nUnable to determine data type [Not int, double, string]: " + temp.toString();
                        e2.printStackTrace();
                    }
                }
            }
            System.out.println("))))))))))))))))) Temp: " + temp);

            //store the non recurive one based CFG
            List<JuicyBoysParser.UnaryExpressionContext> unaryExps = ctx.unaryExpression();
            List<JuicyBoysParser.MulORdivORmodContext> mulORdivORmod = ctx.mulORdivORmod();

            //        Object b = super.visit(ctx.multiplicativeExpression(1));
            //for (JuicyBoysParser.UnaryExpressionContext unaryExp : unaryExps)


            for (int j = 1; j < unaryExps.size(); j++) {

                //^^ iterating through all multExps kasi *

                try {
                    Object b = super.visit(unaryExps.get(j).unaryExpressionNotPlusMinus());

                    //Integer int1 = Integer.parseInt(b.toString());

                    Object nextNumber = null;

                    try{
                        nextNumber = Integer.parseInt(b.toString());
                    }catch(Exception e){
                        try{
                            nextNumber = Double.parseDouble(b.toString());
                        }catch (Exception e1){
                            e.printStackTrace();
                        }
                    }


                    System.out.println(")))))))))))))))) int1: " + nextNumber);

                    if (temp instanceof Integer && nextNumber instanceof Integer) {
                        System.out.println("Instance is an Integer");
                        if (mulORdivORmod.get(j - 1).MUL() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside MUL");
                            temp = (int)temp * (int) nextNumber;
                            System.out.println("\t\t\t Temp: " + temp);

                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (mulORdivORmod.get(j - 1).DIV() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;
                            System.out.println("inside DIV");
                            temp = (int)temp / (int) nextNumber;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (mulORdivORmod.get(j - 1).MOD() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;
                            System.out.println("inside MOD");
                            temp = (int)temp % (int) nextNumber;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");
                        }
                    }

                    else if (temp instanceof Double && nextNumber instanceof Double) {
                        System.out.println("Instance is a Double");
                        if (mulORdivORmod.get(j - 1).MUL() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;

                            System.out.println("inside MUL");
                            temp = (double)temp * (double) nextNumber;
                            System.out.println("\t\t\t Temp: " + temp);

                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (mulORdivORmod.get(j - 1).DIV() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;
                            System.out.println("inside DIV");
                            temp = (double)temp / (double) nextNumber;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");

                        } else if (mulORdivORmod.get(j - 1).MOD() != null) {
                            // 3 (+ 1)
                            //return (int)int1 + (int)int2;
                            System.out.println("inside MOD");
                            temp = (double)temp % (double) nextNumber;
                            //System.out.println("Added: " + (temp + (int)int1) + " End");
                        }
                    }
                    else{
                        System.out.println("Error in casting");
                        hasError = true;
                        errorCode += "\nYou cannot perform the arithmetic using different variable data types: " + temp;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }


                //Object b = super.visitAdditiveExpression()
            }

            //MAY SIRA PA DIS cuz di siya + d nasa baba nito aapat
            System.out.println("Answer in multExp: " + temp);


            return temp;

        }


        return null;

    }



    {


    /*



        //        Object b = super.visit(ctx.multiplicativeExpression(1));
        for(int j = 1; j < JuicyBoysParser.UnaryExpressionContext) {

            System.out.println("Counter Unary: " + i);


 try
            {
                Object b = super.visit(visitUnaryExpression());
                Integer int1 = Integer.parseInt(a.toString());
                Integer int2 = Integer.parseInt(b.toString());

                if(int1 instanceof Integer && int2 instanceof  Integer)
                {
                    System.out.println("nakapasok si koya sa add shit na int instance");

                    if(ctx.MUL()!=null) {
                        System.out.println("int1: " + (int) int1 + " End");
                        System.out.println("int2: " + (int) int2 + " End");

                        System.out.println("Added: " + ((int) int1 + (int) int2) + "End");
                        return (int) int1 + (int) int2;
                    }
                }

                System.out.println(" DI nakapasok si koya sa add shit na int instance");
            }

            catch(Exception e)
           {
                e.printStackTrace();
            }


            //Object b = super.visitAdditiveExpression()
        }

  try
        {
            Integer int1 = Integer.parseInt(a.toString());
            Integer int2 = Integer.parseInt(b.toString());

            if(int1 instanceof Integer && int2 instanceof  Integer)
            {
                if(ctx.MUL()!=null)
                    return (int)int1 * (int)int2;
                if(ctx.DIV()!=null)
                    return (int)int1 / (int)int2;
                if(ctx.MOD()!=null)
                    return (int)int1 % (int)int2;

            }
        }
        catch(Exception e)
        {
        }

        //return super.visitMultiplicativeExpression(ctx);

        System.out.println("Di sya instance of an integer");
        return super.visitMultiplicativeExpression(ctx);
*/
        // Glenn's code

        /*if(super.visit(ctx.unaryExpression(0)) != null || ((ctx.MUL()!=null || ctx.DIV()!=null || ctx.MOD()!=null) && super.visit(ctx.unaryExpression(1)) != null)){
            //Object addend = super.visit(ctx.multiplicativeExpression(0));
            System.out.println("Not null multiplicativeexpresion");
        }
        else{
            System.out.println("Null multiplicativeexpresion");
        }
        return visitChildren(ctx);


        //return super.visitMultiplicativeExpression(ctx);
*/

    }



    @Override
    public Object visitUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx) {
        Object a = super.visit(ctx.unaryExpressionNotPlusMinus());


        if(a != null){
            return a;
        }
        return null;

        //return super.visitUnaryExpression(ctx);
    }

    @Override
    public Object visitUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx) {


        Object a = super.visit(ctx.primary());

        if(a != null){
            return a;
        }

        return null;
        //return super.visitUnaryExpressionNotPlusMinus(ctx);
    }





    @Override
    public Object visitPrimary(JuicyBoysParser.PrimaryContext ctx) {


        if(ctx.literal() != null)
        {
            System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCChecker kung pumasok: " + ctx.literal().getText());
            return ctx.literal().getText();
        }

        else if(ctx.functionCall()!=null){
            Object functionReturnValue = super.visit(ctx.functionCall());

            JOptionPane.showMessageDialog(null, "Primary daw function: " + ctx.getText().toString());
            // Object functionReturnValue = 1;

            if(functionReturnValue!=null) {
                return functionReturnValue.toString();
            }
            else {
                hasError = true;
                String newErrorCode = "\n Function not returning any value";

                if (!errorCode.contains(newErrorCode)) {
                    errorCode += newErrorCode;
                }
                return null;
            }
      }

        //for variables
        else{
            Variable var = null;
            try{
                var  = (Variable) scopes.peek().lookup(ctx.Identifier().toString());

            }catch (Exception e){

            }
            if(var !=null){
                return var.getValue();
            }
            else{
                hasError = true;
                String newErrorCode = "\n Variable: " + ctx.getText() + "is Null";

                if (!errorCode.contains(newErrorCode)) {
                    errorCode += newErrorCode;
                }
                return null;
            }
        }



        //return super.visitPrimary(ctx);
    }


    @Override
    public Object visitLiteral(JuicyBoysParser.LiteralContext ctx) {

        System.out.println("---------- Visit Literal ----------");
        if(ctx.IntegerLiteral()!=null) {
            System.out.println("Visit Literal: " + ctx.IntegerLiteral().getText().toString());
            return ctx.IntegerLiteral().getText();
        }
        else if(ctx.FloatingPointLiteral()!=null) {
            System.out.println("Visit Literal: " + ctx.FloatingPointLiteral().getText().toString());
            return ctx.FloatingPointLiteral().getText();
        }
        else if(ctx.StringLiteral() != null){
            System.out.println("Visit Literal: " + ctx.StringLiteral().getText().toString());
            return ctx.StringLiteral().getText();
        }


        return null;
    }




    public boolean getHasError(){
        return hasError;
    }

    public String getErrorCode(){
        return errorCode;
    }



    //since di natin vinisit yung code block, we visit it after saving the functions, so we name this function third pass



    public void thirdPass(){


        for(int i = 0; i < masterFuncList.size(); i++){
            JOptionPane.showMessageDialog(null, "MasterFunc entry: " + i + "\n Function Name: " + masterFuncList.get(i).getSignature().toString() +
                    " \n Return Type: " + masterFuncList.get(i).getReturn_type() + " \n Code: " + masterFuncList.get(i).getContext().block().getText().toString());

        }


        for(int i = 0; i < masterFuncList.size(); i++){
            if(masterFuncList.get(i).getSignature().toString().equals("main")){
                JOptionPane.showMessageDialog(null, "Found Main, entering context");
               super.visit(masterFuncList.get(i).getContext());
                break;
            }
        }






    }
}
