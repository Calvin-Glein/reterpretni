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
        System.out.println("---------- Visited Compilation Unit ----------");
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

        Integer temp = 0;
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
                Object b = super.visit(multExps.get(j).unaryExpression(0));

                Integer int1 = Integer.parseInt(b.toString());

                //wait explain ko sayo problem

                //multiplicativeExpression ( (ADD | SUB) multiplicativeExpression)*
                //diba may for loop tayo for multExps
                //pero since yung loop na yan only accesses yung multiplicativeExpression, di kasama yung ADD | SUB ^^^
                //so we're trying to find a way na maaaccess yung ADD and SUB

                if(int1 instanceof  Integer)
                {
                    System.out.println("Instance is an Integer");
                    if(addORsubs.get(j-1).ADD()!=null)
                    {
                        // 3 (+ 1)
                        //return (int)int1 + (int)int2;

                        System.out.println("inside ADD with Instance value: " + (int)int1);
                        temp = temp + (int)int1;
                        //System.out.println("Added: " + (temp + (int)int1) + " End");

                    }
                    else if(addORsubs.get(j-1).SUB()!=null)
                    {
                        // 3 (+ 1)
                        //return (int)int1 + (int)int2;
                        System.out.println("inside SUB with Instance value: " + int1);
                        temp = temp - (int)int1;
                        //System.out.println("Added: " + (temp + (int)int1) + " End");

                    }
                  /*  if(ctx.SUB()!=null)
                    {
                        System.out.println("Subtracted: " + ((int)int1 - (int)int2));
                        //return (int)int1 - (int)int2;
                    }*/
                }
                else{
                    System.out.println("Instance not an integer");
                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }


            //Object b = super.visitAdditiveExpression()
        }

        System.out.println("Answer: " + (Integer.parseInt(a.toString()) + temp));


        return (Integer.parseInt(a.toString()) + temp);
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


//
//    public Object visitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx)
//    {
//
//        System.out.println("---------- Multiplicative Expression ----------");
//        //
//        Object a = super.visit(ctx.unaryExpression(0));
//
//        //temporary fix
//        Integer temp = 1;
//        //store the non recurive one based CFG
//        List<JuicyBoysParser.UnaryExpressionContext> unaryExps =  ctx.unaryExpression();
//        List<JuicyBoysParser.MulORdivORmodContext> mulORdivORmod =  ctx.mulORdivORmod();
//
//        //        Object b = super.visit(ctx.multiplicativeExpression(1));
//  for(JuicyBoysParser.MultiplicativeExpressionContext multExp : multExps)
//
//
//        for(int j = 1; j < unaryExps.size(); j++){
//
//            //^^ iterating through all multExps kasi *
//
//            try
//            {
//                Object b = super.visit(unaryExps.get(j).unaryExpressionNotPlusMinus());
//
//                Integer int1 = Integer.parseInt(b.toString());
//
//                //wait explain ko sayo problem
//
//                //multiplicativeExpression ( (ADD | SUB) multiplicativeExpression)*
//                //diba may for loop tayo for multExps
//                //pero since yung loop na yan only accesses yung multiplicativeExpression, di kasama yung ADD | SUB ^^^
//                //so we're trying to find a way na maaaccess yung ADD and SUB
//
//                if(int1 instanceof  Integer)
//                {
//                    System.out.println("nakapasok si koya sa add shit na int instance");
//                    if(mulORdivORmod.get(j-1).MUL()!=null)
//                    {
//                        // 3 (+ 1)
//                        //return (int)int1 + (int)int2;
//
//                        System.out.println("inside MUL");
//                        temp = temp * (int)int1;
//                        //System.out.println("Added: " + (temp + (int)int1) + " End");
//
//                    }
//                    else if(mulORdivORmod.get(j-1).DIV()!=null)
//                    {
//                        // 3 (+ 1)
//                        //return (int)int1 + (int)int2;
//                        System.out.println("inside DIV");
//                        temp = temp / (int)int1;
//                        //System.out.println("Added: " + (temp + (int)int1) + " End");
//
//                    }
//                    else if(mulORdivORmod.get(j-1).MOD()!=null)
//                    {
//                        // 3 (+ 1)
//                        //return (int)int1 + (int)int2;
//                        System.out.println("inside MOD");
//                        temp = temp % (int)int1;
//                        //System.out.println("Added: " + (temp + (int)int1) + " End");
//
//                    }
//  if(ctx.SUB()!=null)
//                    {
//                        System.out.println("Subtracted: " + ((int)int1 - (int)int2));
//                        //return (int)int1 - (int)int2;
//                    }
//
//                }
//
//                System.out.println("Instance not an integer");
//            }
//            catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//
//
//            //Object b = super.visitAdditiveExpression()
//        }
//
//        //MAY SIRA PA DIS cuz di siya + dapat
//        System.out.println("Answer: " + temp);
//
//
//        return temp;
//
//
//
//
//
//
//
//        //        Object b = super.visit(ctx.multiplicativeExpression(1));
//        for(int j = 1; j < JuicyBoysParser.UnaryExpressionContext) {
//
//            System.out.println("Counter Unary: " + i);
//
//
// try
//            {
//                Object b = super.visit(visitUnaryExpression());
//                Integer int1 = Integer.parseInt(a.toString());
//                Integer int2 = Integer.parseInt(b.toString());
//
//                if(int1 instanceof Integer && int2 instanceof  Integer)
//                {
//                    System.out.println("nakapasok si koya sa add shit na int instance");
//
//                    if(ctx.MUL()!=null) {
//                        System.out.println("int1: " + (int) int1 + " End");
//                        System.out.println("int2: " + (int) int2 + " End");
//
//                        System.out.println("Added: " + ((int) int1 + (int) int2) + "End");
//                        return (int) int1 + (int) int2;
//                    }
//                }
//
//                System.out.println(" DI nakapasok si koya sa add shit na int instance");
//            }
//
//            catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//
//
//            //Object b = super.visitAdditiveExpression()
//        }
//
//  try
//        {
//            Integer int1 = Integer.parseInt(a.toString());
//            Integer int2 = Integer.parseInt(b.toString());
//
//            if(int1 instanceof Integer && int2 instanceof  Integer)
//            {
//                if(ctx.MUL()!=null)
//                    return (int)int1 * (int)int2;
//                if(ctx.DIV()!=null)
//                    return (int)int1 / (int)int2;
//                if(ctx.MOD()!=null)
//                    return (int)int1 % (int)int2;
//
//            }
//        }
//        catch(Exception e)
//        {
//        }
//
//        //return super.visitMultiplicativeExpression(ctx);
//
//        System.out.println("Di sya instance of an integer");
//        return super.visitMultiplicativeExpression(ctx);
//
//        // Glenn's code
//
//        /*if(super.visit(ctx.unaryExpression(0)) != null || ((ctx.MUL()!=null || ctx.DIV()!=null || ctx.MOD()!=null) && super.visit(ctx.unaryExpression(1)) != null)){
//            //Object addend = super.visit(ctx.multiplicativeExpression(0));
//            System.out.println("Not null multiplicativeexpresion");
//        }
//        else{
//            System.out.println("Null multiplicativeexpresion");
//        }
//        return visitChildren(ctx);
//
//
//        //return super.visitMultiplicativeExpression(ctx);
//
//    }

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

        System.out.println("---------- Visit Literal ----------");
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
