package com.mycompany.wordcountusingarraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {

    public static String getFileContent(String filePath) throws FileNotFoundException   {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        String input = "";
        while (sc.hasNext()) {
            input = input.concat(sc.next()).concat(" ");
        }
        return input.toLowerCase();

    }
    public static ArrayList<Character> getSymbols(String filePath) throws FileNotFoundException  {
        ArrayList<Character> symbolList = new ArrayList<>();
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            symbolList.add(sc.nextLine().charAt(0));
        }
        return symbolList;
    }

    public static ArrayList<String> getStopWords(String filePath) throws FileNotFoundException {
        ArrayList<String> stopwordList = new ArrayList<>();
        File file = new File(filePath);
        Scanner sc = new Scanner(filePath);
        while (sc.hasNext()) {
            stopwordList.add(sc.next());
        }
        return stopwordList;
    }
    
}
