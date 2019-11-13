package Libraries;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class SaveLatex {
    public static void save(HashMap<String, String> data) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("output.tex", "UTF-8");
        for (String key: data.keySet()) {
            if (key.startsWith("doctype")) {
                writer.println("\\documentclass[11pt]{" + data.get(key) + "}");
                break;
            }
        }

        writer.println("\\usepackage[utf8]{inputenc}");
        writer.close();
        System.out.println("Finished");
    }
}