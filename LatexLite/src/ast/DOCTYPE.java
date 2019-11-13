package ast;

import Libraries.Node;
import Libraries.Tokenizer;

public class DOCTYPE extends LATEXLITE{
    String doctype;
    public void parse(){
        tokenizer.getAndCheckNext("doctype");
        tokenizer.getAndCheckNext("=");
        doctype = tokenizer.getNext();
        tokenizer.getAndCheckNext(";");
    }

}
