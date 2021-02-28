package lpl;
import lpl.parser.LPLParser;
import java.io.File;


/**
 * A harness to test the LPL parser.
 */
public class ParseAll {

    public static void main(String[] args) throws Throwable {
        LPLParser parser;
        String dirpath = args[0];
        File[] files = new File(args[0]).listFiles();
        try {
            for (File file : files){
                System.out.println("--------------------------"+  file.getAbsoluteFile() + "--------------------------");
                try {
                    parser = new LPLParser(new java.io.FileInputStream(file.getAbsoluteFile()));
                } catch (java.io.FileNotFoundException e) {
                    System.err.println("Unable to read file " + args[0]);
                    return;
                }
                System.out.println("parsing...");
                parser.nt_Program();
                System.out.println("...parse completed.");
            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
