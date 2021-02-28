package lpl;

import lpl.parser.LPLParser;

/**
 * A harness to test that the abstract syntax tree is being built correctly. The
 * main method calls the toString method of the AST and prints the result.
 */
public class Print {

    public static void main(String[] args) {
        LPLParser parser;
        try {
            try {
                parser = new LPLParser(new java.io.FileInputStream(args[0]));
            } catch (java.io.FileNotFoundException e) {
                System.err.println("Unable to read file " + args[0]);
                return;
            }

            System.out.println(parser.nt_Program().toString());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
