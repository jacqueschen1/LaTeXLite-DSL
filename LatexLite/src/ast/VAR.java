package ast;

public class VAR extends LATEXLITE {
    String id;
    String name;

    public void parse(){
        tokenizer.getAndCheckNext("var");
        id = tokenizer.getNext();
        tokenizer.getAndCheckNext("=");
        tokenizer.getAndCheckNext("'");
        name = tokenizer.getNext();
        tokenizer.getAndCheckNext("'");
        tokenizer.getAndCheckNext(";");
    }
}
