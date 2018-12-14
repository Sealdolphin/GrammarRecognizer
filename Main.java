import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {
    public static void main(String[] args) throws Exception {

        ANTLRInputStream is = new ANTLRInputStream(readFile(new File("input.txt"),Charset.forName("UTF-8")));
        controlLexer lexer = new controlLexer(is);
        TokenStream tokens = new CommonTokenStream(lexer);
        controlParser parser = new controlParser(tokens);

        Analyzer a = new Analyzer(parser);
        parser.addParseListener(a);

        System.out.println(parser.getTokenTypeMap());

        controlBaseVisitor visitor = new controlBaseVisitor();
        visitor.visit(parser.line());


    }

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }
}