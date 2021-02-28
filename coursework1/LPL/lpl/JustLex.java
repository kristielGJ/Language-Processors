package lpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lpl.parser.LPLParser;
import lpl.parser.LPLParserConstants;
import lpl.parser.Token;

/**
 * A harness to test your LPL token definitions.
 */
public class JustLex {

    private static List<Field> tokenFields;

    public static void main(String[] args) throws Throwable {
        LPLParser parser;
        try {
            try {
                parser = new LPLParser(new java.io.FileInputStream(args[0]));
            } catch (java.io.FileNotFoundException e) {
                System.err.println("Unable to read file " + args[0]);
                return;
            }
            System.out.println("lexing...");
            initTokenFields();
            Token t = parser.getNextToken();
            while (t.kind != LPLParserConstants.EOF) {
                System.out.println("<" + getTokenName(t) + ">(\"" + t.image + "\")");
                t = parser.getNextToken();
            }
            System.out.println("...lex completed.");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static String getTokenName(Token t) {
        try {
            for (Field f : tokenFields) {
                if (f.getInt(null) == t.kind) {
                    return f.getName();
                }
            }
        } catch (Exception ex) {
        }
        throw new Error("Could not get name for token " + t);
    }

    private static void initTokenFields() {
        Field[] declaredFields = LPLParserConstants.class.getDeclaredFields();
        tokenFields = new ArrayList<Field>();
        for (Field field : declaredFields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                if (field.canAccess(null) && "int".equals(field.getType().getName()) && !"DEFAULT".equals(field.getName())) {
                    tokenFields.add(field);
                }
            }
        }
    }
}
