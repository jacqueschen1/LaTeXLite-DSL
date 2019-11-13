package ast;

import Libraries.Node;

public class LATEXLITE extends Node {
    @Override
    public void parse() {
        while (!tokenizer.checkToken("finished")){
            if (tokenizer.checkToken("doctype")){
                DOCTYPE dt = new DOCTYPE();
            }
            else if (tokenizer.checkToken("include")){
                PACKAGE p = new PACKAGE();
            }
            else if (tokenizer.checkToken("env")){
                ENV e = new ENV();
            }
            else if (tokenizer.checkToken("content")){
                CONTENT c = new CONTENT();
            }
        }
    }

    @Override
    public void evaluate() {

    }

    @Override
    public void nameCheck() {

    }
}
