package ast;

public class ENV extends LATEXLITE{


    public void parse(){
        tokenizer.getAndCheckNext("env");

    }
}
