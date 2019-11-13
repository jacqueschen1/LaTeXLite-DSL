package ast;

import Libraries.Node;

import java.util.ArrayList;

public class LATEXLITE extends Node {
    public ArrayList<String>[] parsedData = new ArrayList[4];
    public ArrayList<String>[] interpData = new ArrayList[4];

    @Override
    public void parse() {
        while (!tokenizer.checkToken("finished")){
            if (tokenizer.checkToken("doctype")){
                DOCTYPE dt = new DOCTYPE();
                dt.parse();
                parsedData[0].add(dt.doctype);
            }
            else if (tokenizer.checkToken("include")){
                PACKAGE p = new PACKAGE();
                p.parse();
                parsedData[1].add(p.packageName);
            }
            else if (tokenizer.checkToken("env")){
                ENV e = new ENV();
                e.parse();
                parsedData[2].add(e.env);
            }
            else if (tokenizer.checkToken("content")){
                CONTENT c = new CONTENT();
            }
        }
    }

    @Override
    public void evaluate() {
        if (parsedData[0].size() == 1) {
            interpData[0].add("\\documentclass[11pt]{" + parsedData[0].get(0) + "}");
        } else if (parsedData[0].size() == 0) {
            // Add default doctype.
            interpData[0].add("\\documentclass[11pt]{article}");
        } else {
            System.out.println("Error: more than one doctype included!");
            System.exit(-1);
        }

        for(String pack: parsedData[1]) {
            interpData[1].add("\\usepackage{" + pack + "}");
        }


    }

    @Override
    public void nameCheck() {

    }
}
