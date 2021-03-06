import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;


public class UI {
    private JTextArea textAreaCodeInput;
    private JTextArea textArea2Output;
    private JButton button1;
    private JPanel panel;
    private JTextArea textAreaTokenTypes;
    private JTextArea textAreaTree;
    public JTextArea textAreaError;
    private JScrollPane scrollPaneCodeInput;
    private JScrollPane jtablescrollpane;
    public JTextArea outputArea;
    private TextLineNumber textLineNumber;

    private ArrayList<String> TokenTypes= new ArrayList<String>();

    private String code = "";
    private ArrayList<String> autocompleteWords = new ArrayList<String>();

    private Thread thread;


    private AutoComplete suggestion;

    protected void showSuggestionLater() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                showSuggestion();
            }

        });
    }

    protected void showSuggestion() {
        //hideSuggestion();
        final int position = textAreaCodeInput.getCaretPosition();
        Point location;
        try {
            location = textAreaCodeInput.modelToView(position).getLocation();
        } catch (BadLocationException e2) {
            e2.printStackTrace();
            return;
        }
        String text = textAreaCodeInput.getText();
        int start = Math.max(0, position - 1);
        while (start > 0) {
            if (!Character.isWhitespace(text.charAt(start))) {
                start--;
            } else {
                start++;
                break;
            }
        }
        if (start > position) {
            return;
        }
        final String subWord = text.substring(start, position);
        if (subWord.length() < 2) {
            return;
        }

        suggestion = new AutoComplete(textAreaCodeInput, position, subWord, location);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textAreaCodeInput.requestFocusInWindow();
            }
        });
    }

    private void hideSuggestion() {
        if (suggestion != null) {
            suggestion.hide();
        }
    }




    public UI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        });

        textAreaCodeInput.setText("class joanna{\n" +
                "    int func1(){\n" +
                "        int x = 2 + 2;\n" +
                "        int y = 4; \n" +
                "\n" +
                "        outputln(\"first\");\n" +
                "\n" +
                "        int z = x + y;\n" +
                "\n" +
                "        output(z);\n" +
                "\n" +
                "        int test  = function func2();\n" +
                "        \n" +
                "        return test + 4;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    int func2(){\n" +
                "\n" +
                "    int z = 4 + 4 + 4; \n" +
                "    return z;\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    void main(){\n" +
                "        int counter = 10;\n" +
                "        int counter2 = 20;\n" +
                "        int counter3 = counter + counter2;\n" +
                "        int test = 10 + 10;\n" +
                "\n" +
                "        if(counter  < counter2){\n" +
                "        test = test + 10;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        int sc = function func1();\n" +
                "        output(sc);\n" +
                "    }\n" +
                "}\t");


        textAreaCodeInput.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    if (suggestion != null) {
                        if (suggestion.insertSelection()) {
                            e.consume();
                            final int position = textAreaCodeInput.getCaretPosition();
                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        textAreaCodeInput.getDocument().remove(position - 1, 1);
                                    } catch (BadLocationException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN && suggestion != null) {
                    suggestion.moveDown();
                } else if (e.getKeyCode() == KeyEvent.VK_UP && suggestion != null) {
                    suggestion.moveUp();
                } else if (Character.isLetterOrDigit(e.getKeyChar())) {
                    showSuggestionLater();
                } else if (Character.isWhitespace(e.getKeyChar())) {
                    hideSuggestion();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }
        });



        textLineNumber = new TextLineNumber(textAreaCodeInput);
        scrollPaneCodeInput.setRowHeaderView(textLineNumber);
        scrollPaneCodeInput.setMinimumSize(new Dimension(300, 500));
        jtablescrollpane.setMaximumSize(new Dimension(250, 500));
    }

    public void initializeUI(){

        JFrame frame = new JFrame("IDE");
        frame.setContentPane(new UI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.pack();
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

  /*  public static class BailSimpleLexer extends JuicyBoysLexer  {
        public BailSimpleLexer(CharStream input) { super(input); }
        public void recover(LexerNoViableAltException e) {
            throw new RuntimeException(e); // Bail out
        }
    }*/

    public void run() {



                     
        textAreaError.setText("");

        outputArea.setText("");
        code = textAreaCodeInput.getText();



        ANTLRInputStream input = new ANTLRInputStream(code);

        JuicyBoysLexer lexer = new JuicyBoysLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuicyBoysParser parser = new JuicyBoysParser(tokens);
        JuicyBoysANTLRErrorListener errorListener = new JuicyBoysANTLRErrorListener();

        textLineNumber.setErrorListener(errorListener);

        //remove the ConsoleErrorListeners
        parser.removeErrorListeners();

        //add our custom errorListener
        parser.addErrorListener(errorListener);


        //remove lexer errorlistener
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);




       // parser.addErrorListener(new DiagnosticErrorListener());

        //make parser report all ambiguities
      //  parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);


        //add the bailerrorstrategy
       // parser.setErrorHandler(bailErrorStrategy);

        //add the defaultErrorStrategy
       // parser.setErrorHandler(defaultErrorStrategy);

        //add Exceptionerrorstrategy in the parser
        // parser.setErrorHandler(exceptionErrorStrategy);

        //add a custom handler
      //  parser.setErrorHandler(new JuicyBoysANTLRErrorStrategy());


        parser.setBuildParseTree(true);
        ParseTree tree = parser.compilationUnit();

        tokens.fill();
        //ParseTreeWalker walker = new ParseTreeWalker();

        JFrame frameTree = new JFrame("Antlr AST");
        JPanel panelTree = new JPanel();
        JScrollPane scrollPanePanelTree = new JScrollPane( panelTree );
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1);//scale a little
        panelTree.add(viewr);

        frameTree.add(scrollPanePanelTree);
        frameTree.setSize(500,500);
        frameTree.setVisible(true);



        JuicyBoysBaseVisitorCustom visitor = new JuicyBoysBaseVisitorCustom(outputArea);
        visitor.visit(tree);
        visitor.thirdPass();


/*
        if(thread != null)
            thread.stop();
        else
        {
            thread = new Thread(visitor);
            thread.start();
        }*/


    /*    for (Token tok : tokens.getTokens()) {
            textArea2Output.setText(textArea2Output.getText() + tok.getText() + " -> " + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
           // textAreaTokenTypes.setText(textAreaTokenTypes.getText() + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
        }*/




        //textAreaTree.setText(tree.toStringTree(parser));
        textAreaError.setText(errorListener.getOutput());
        //textAreaExceptions.setTzxxext("Exceptions: "  + exceptionErrorStrategy.getErrors().toString());

        System.out.println("Parser: " + parser.getNumberOfSyntaxErrors());

        if(errorListener.getLineErrors().size()>0){
            textAreaCodeInput.setCaretPosition(errorListener.getLineErrors().get(0));
        }





        if(!visitor.getHasError()){
            System.out.print("\n\n\n\n No nnnerror sabi ni visitor");

        }else{
            //do something
            System.out.print("may error sabi ni visitor");
            System.out.println();
            System.out.println();
            System.out.println("Error: " + visitor.getErrorCode());

            textAreaError.setText(textAreaError.getText() + visitor.getErrorCode());
        }



        String[] columnNames = {"Variable Key", "Variable Value"};
        DefaultTableModel model = new DefaultTableModel();
        Set set = visitor.printStack();

        Iterator iterator = set.iterator();

        model.addColumn("Col1");
        model.addColumn("Col2");
       while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("key" + mentry.getKey());
            System.out.println("values" + ((Symbol)mentry.getValue()).getScope());


            Object[] row = {mentry.getKey(), mentry.getValue()};
            model.addRow(row);


        }

        System.out.println(model.getRowCount());

        JTable variablesTable = new JTable(model);

        model.fireTableDataChanged();

        jtablescrollpane.getViewport ().add (variablesTable);
        variablesTable.setVisible(true);
        jtablescrollpane.setVisible(true);


    }
}

/*

String code = "boyd simula () { numero baryabol counter ;istop }";
        ANTLRInputStream input = new ANTLRInputStream(code);

        JuicyBoysLexer lexer = new JuicyBoysLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuicyBoysParser parser = new JuicyBoysParser(tokens);

        //print tokens
            tokens.fill();
            for (Object tok : tokens.getTokens()) {
            System.out.println(tok);
        }

 */
