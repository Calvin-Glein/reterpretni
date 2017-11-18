import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.naming.event.ObjectChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class JuicyBoysBaseVisitorCustom extends JuicyBoysBaseVisitor {


    private Stack<Scope> scopes;
    private SymbolTable symbolTable;
    private boolean hasError;
    private String string1;
    private ArrayList<Function> masterFuncList;

    private ParseTree parseTree;

 /*   public JuicyBoysBaseVisitorCustom(ParseTree parseTree) {
        this.parseTree = parseTree;

      *//*  hasError = false;
        //for global siguro
        scopes = new Stack<Scope>();
        scopes.push(new Scope());

        symbolTable = new SymbolTable();*//*
    }*/

  /*  @Override
    public Object visitCompilationUnit(@NotNull JuicyBoysParser.CompilationUnitContext ctx) {
        System.out.println("hello");
        string1 = "elo";
        //create a new scope yata
//        symbolTable.enterScope();
//        super.visit(ctx.parent);
 //       System.out.println(ctx.parent.getText());

//        symbolTab visitChildren(ctx);le.exitScope();

        return null;
    }*/

    @Override
    public Object visitCompilationUnit(@NotNull JuicyBoysParser.CompilationUnitContext ctx) {
        System.out.println("thesis");
        string1 = "elo";
        //create a new scope yata
//        symbolTable.enterScope();
//        super.visit(ctx.parent);
        //       System.out.println(ctx.parent.getText());

//        symbolTab visitChildren(ctx);le.exitScope();
        return super.visitCompilationUnit(ctx);
    }



    @Override public Object visitAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx)
    {
        System.out.println("additive EXP");


        //store the non recurive one based CFG
        Object a = super.visit(ctx.multiplicativeExpression(0));
        List<JuicyBoysParser.MultiplicativeExpressionContext> multExps =  ctx.multiplicativeExpression();


        System.out.println("Count of multExps: " + multExps.size() );
        int i = 0;
        //        Object b = super.visit(ctx.multiplicativeExpression(1));
      /*  for(JuicyBoysParser.MultiplicativeExpressionContext multExp : multExps)*/

        for(int j = 0; j < multExps.size(); j++){

            //^^ iterating through all multExps kasi *
            System.out.println("Counter: " + j);
            try
            {
                Object b = super.visit(multExps.get(j).unaryExpression(0));
                Integer int1 = Integer.parseInt(a.toString());
                Integer int2 = Integer.parseInt(b.toString());

                if(int1 instanceof Integer && int2 instanceof  Integer)
                {
                    System.out.println("nakapasok si koya sa add shit na int instance");

                    if(ctx.ADD()!=null)
                    {
                        System.out.println("int1: " + (int)int1  + " End");
                        System.out.println("int2: " + (int)int2  + " End");

                        System.out.println("Added: " + ((int)int1 + (int)int2) + "End");
                        //return (int)int1 + (int)int2;
                    }
                    if(ctx.SUB()!=null)
                    {
                        System.out.println("Subtracted: " + ((int)int1 - (int)int2));
                        //return (int)int1 - (int)int2;
                    }
                }

                System.out.println(" DI nakapasok si koya sa add shit na int instance");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            i++;

            //Object b = super.visitAdditiveExpression()
        }

        System.out.println("Di sya instance of an integer");

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


 /*   public Object visitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx) {

        Object a = super.visit(ctx.unaryExpression(0));
        //Object b = super.visit(ctx.unaryExpression(1));

        List<JuicyBoysParser.UnaryExpressionContext> unaryExps =  ctx.unaryExpression();

        int i = 1;
        //        Object b = super.visit(ctx.multiplicativeExpression(1));
        for(JuicyBoysParser.UnaryExpressionContext unaryExp : unaryExps) {

            System.out.println("Counter Unary: " + i);

           *//* try
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
            }*//*


            //Object b = super.visitAdditiveExpression()
        }
      *//*  try
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
*//*
        //return super.visitMultiplicativeExpression(ctx);

        System.out.println("Di sya instance of an integer");
        return super.visitMultiplicativeExpression(ctx);

        // Glenn's code
    *//*
        if(super.visit(ctx.unaryExpression(0)) != null || ((ctx.MUL()!=null || ctx.DIV()!=null || ctx.MOD()!=null) && super.visit(ctx.unaryExpression(1)) != null)){
            //Object addend = super.visit(ctx.multiplicativeExpression(0));
            System.out.println("Not null multiplicativeexpresion");
        }
        else{
            System.out.println("Null multiplicativeexpresion");
        }
        return visitChildren(ctx);
*//*
        //return super.visitMultiplicativeExpression(ctx);
    }*/

    @Override
    public Object visitUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx) {

        Object a = super.visit(ctx.unaryExpressionNotPlusMinus());
        return a;

        //return super.visitUnaryExpression(ctx);
    }

    @Override
    public Object visitUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx) {

        Object a = super.visit(ctx.primary());
        return a;
        //return super.visitUnaryExpressionNotPlusMinus(ctx);
    }

    @Override
    public Object visitPrimary(JuicyBoysParser.PrimaryContext ctx) {

        Object a = super.visit(ctx.literal());
        return a;

        //return super.visitPrimary(ctx);
    }

    @Override
    public Object visitLiteral(JuicyBoysParser.LiteralContext ctx) {

        System.out.println("visit Literal");
        if(ctx.IntegerLiteral()!=null) {
            System.out.println("Visit Literal: " + ctx.IntegerLiteral().getText().toString());
            return ctx.IntegerLiteral().getText();
        }

        return null;
    }




    public boolean getHasError(){
        return hasError;
    }

}
