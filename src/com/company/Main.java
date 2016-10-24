package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        /*ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get("input.txt"));
        List<String> extractedLines;
        for (String line : lines) {
            if(line.equals("==="))


        }*/
        boolean trigger = false;
        System.out.println(Paths.get("input.txt"));
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);
        BufferedReader br = new BufferedReader(new FileReader(Paths.get("input.txt").toFile()));
        String line;
        ArrayList<String> retrievedStrings = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            if(trigger && line.equals("==="))
                break;
            if(line.equals("==="))
                trigger = true;

            if(trigger){
                System.out.println(line);
            }
        }
        JSONObject jo = new JSONObject();
    }
}
