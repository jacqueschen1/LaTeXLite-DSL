package ast;

public class ENV extends LATEXLITE{
    String env;


    public void parse(){
        tokenizer.getAndCheckNext("env");
        SYMBOL sym = new SYMBOL();
        sym.parse();
        tokenizer.getAndCheckNext("[");
        if (tokenizer.checkToken("var")){
            VAR v = new VAR();
            v.parse();
        }
        else if (tokenizer.checkToken("rule")){
            RULE r = new RULE();
            r.parse();
        }
    }
}
