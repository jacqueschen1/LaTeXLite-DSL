package ast;

public class PACKAGE extends LATEXLITE{
    String packageName;

    public void parse(){
        tokenizer.getAndCheckNext("include");
        packageName = tokenizer.getNext();
        tokenizer.getAndCheckNext(";");
    }

}
