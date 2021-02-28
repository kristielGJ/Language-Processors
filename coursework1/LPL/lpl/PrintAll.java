package lpl;

import lpl.parser.LPLParser;
import java.io.File;
/**
 * A harness to test that the abstract syntax tree is being built correctly. The
 * main method calls the toString method of the AST and prints the result.
 */
public class PrintAll {

    public static void main(String[] args) {
        LPLParser parser;
        String dirpath = args[0];
        File[] files = new File(args[0]).listFiles();
        try {
            for(File file: files) {
                //System.out.println("--------------------------"+  file.getAbsoluteFile() + "--------------------------");
                try {
                    parser = new LPLParser(new java.io.FileInputStream(file.getAbsoluteFile()));
                } catch (java.io.FileNotFoundException e) {
                    System.err.println("Unable to read file " + args[0]);

                    return;
                }

                System.out.println(parser.nt_Program().toString());
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
