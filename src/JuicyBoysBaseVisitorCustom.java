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

    private ParseTree parseTree;

    public JuicyBoysBaseVisitorCustom() {

        hasError = false;
        //for global siguro



        masterFuncList = new ArrayList<Function>();

        //local or global, this will dictate
        scopes = new Stack<Scope>();

        symbolTable = new SymbolTable();
        scopes.push(new Scope(ScopeType.GLOBAL, "Global", null));



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




    @Override
    public Object visitHashtagIfStatement(JuicyBoysParser.HashtagIfStatementContext ctx) {

            if(super.visit(ctx.parExpression())!=null) {
                    JOptionPane.showMessageDialog(null, super.visit((ctx.parExpression())).toString());
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

                            if (temp==nextNumber) {
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
                        System.out.print("You cannot perform relational (>, <, >=, <=) operation on strings.");
                        hasError = true;
                        errorCode += "\n You cannot perform relational (>, <, >=, <=) operation on strings.";
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
        JOptionPane.showMessageDialog(null, "Inside VariableDeclaratorIdContext: " + ctx.getText().toString());

        return super.visitVariableDeclaratorId(ctx);
    }





    @Override
    public Object visitLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx) {

        System.out.println("---------- Visit LocalVariableDeclaration ----------");
        if(ctx.type()!=null)
        {
            Variable a = (Variable)super.visit(ctx.variableDeclarators());
            System.out.println("Variable a: " + a.toString());
            a.setDataType(ctx.type().getText().toString());
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

            if(castChecker instanceof Integer && a.getDataType().equals("int")){
                JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                scopes.peek().bind(a);

            }
            else if (castChecker instanceof Double && a.getDataType().equals("double")) {
                JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                scopes.peek().bind(a);

            }

            else if(castChecker instanceof String && a.getDataType().equals("String")){
                JOptionPane.showMessageDialog(null, " Type: " + a.getDataType().toString() + "Name: " + a.getName() + "Value: " + a.getValue());
                scopes.peek().bind(a);
            }
            else{
                hasError = true;
                errorCode += "\n Error, Name: " + a.getName() + " with data type: "+ a.getDataType() +" Not compatible with value: " + a.getValue();
            }

            System.out.println(a.toString());


            //scopes.push(new Scope(, String scopeName, RuleContext caller);



        }

        return null;

    }


    @Override
    public Object visitVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx) {
        Object a = null;
        Object b = null;

        if(ctx.variableDeclaratorId() != null){
            a = ctx.variableDeclaratorId().getText();
        }
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
                    errorCode += "You cannot perform that operation";
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
                        if(scopes.peek().getSymbolMap().containsKey(a.toString())){
                            JOptionPane.showMessageDialog(null, "meron pre");

                        }
                    }catch (Exception e2){
                        hasError = true;
                        errorCode += "\n Di sya int or di sya double or di rin sya variable existing variable";
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
                        errorCode += "You cannot perform that operation";
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
        //for variables
        else{

           // JOptionPane.showMessageDialog(null, "Test: " + scopes.peek().getSymbolMap().get((Object) ctx.getText()));

            Variable var = (Variable) scopes.peek().lookup(ctx.getText());
            //JOptionPane.showMessageDialog(null, "Test Name: " + scopes.peek().lookup(ctx.getText()).getName());
           // JOptionPane.showMessageDialog(null, "Test Name: " + ctx.getText() + " Test Value: "+ var.getValue());

            if(var !=null){
                return var.getValue();
            }
            else{
                hasError = true;
                errorCode += "\n Variable: " + ctx.getText() + "is Null";
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
}
