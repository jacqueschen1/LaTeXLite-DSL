package ast;

import Libraries.InvalidSymbolNameException;

public class SYMBOL extends LATEXLITE {

    String symName;

    public void parse(){
        //name = tokenizer.getNext();
        symName = tokenizer.getNext();
        if (symName.contains(" ") || symName.contains(";") || symName.equals("codeblock") || symName.equals("figure") ||
        symName.equals("table")) {
            throw new InvalidSymbolNameException(symName);
        }
    }
}
