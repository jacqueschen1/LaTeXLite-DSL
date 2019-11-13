package runMain;

import Libraries.Node;
import Libraries.Tokenizer;
import ast.LATEXLITE;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<String> literals = Arrays.asList("doctype", "=", ";", "[", "]", "{", "}", "var", "'", "\\", "size", "color"
        , "italics", "bold", "underline", "finished", "env", "content");
        Tokenizer.makeTokenizer("input.txt",literals);
        Node.setWriter("output.dot");
        Node program = new LATEXLITE();
        program.parse();
//        program.nameCheck();

        program.evaluate();
        Node.closeWriter();
    }

}

// unfinished nodes: ENV