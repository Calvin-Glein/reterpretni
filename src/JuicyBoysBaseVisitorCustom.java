import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.naming.event.ObjectChangeListener;
import java.util.ArrayList;
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
        if(ctx.ADD() != null && super.visit(ctx.multiplicativeExpression(0))!= null && super.visit(ctx.multiplicativeExpression(1))!= null){
            Object addend = super.visit(ctx.multiplicativeExpression(0));
            System.out.println("Not null Add and multiplicative inverse");

        }
        else{
            System.out.println("Null Add and multiplicative inverse");
        }
        return visitChildren(ctx);
    }


    public Object visitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx) {

        Object a = super.visit(ctx.unaryExpression(0));
        Object b = super.visit(ctx.unaryExpression(1));


        // Glenn's code
        if(super.visit(ctx.unaryExpression(0)) != null || ((ctx.MUL()!=null || ctx.DIV()!=null || ctx.MOD()!=null) && super.visit(ctx.unaryExpression(1)) != null)){
            //Object addend = super.visit(ctx.multiplicativeExpression(0));
            System.out.println("Not null multiplicativeexpresion");
        }
        else{
            System.out.println("Null multiplicativeexpresion");
        }
        return visitChildren(ctx);

        //return super.visitMultiplicativeExpression(ctx);
    }

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

        return super.visitLiteral(ctx);
    }




    public boolean getHasError(){
        return hasError;
    }

}
