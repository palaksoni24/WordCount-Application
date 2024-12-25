package com.mycompany.wordcountusingarraylist;

import java.io.FileNotFoundException;
import java.util.*;

public class DataOperations {

    public static ArrayList<String> getStringToList(String inputString) {
        String inputArray[] = inputString.split(" ");
        ArrayList<String> inputList = new ArrayList<>();
        for (String string : inputArray) {
            inputList.add(string);
        }
        return inputList;
    }

    public static ArrayList<Character> getStringToCharList(String inputString) {
        char inputArray[] = inputString.toCharArray();
        ArrayList<Character> inputList = new ArrayList<>();
        for (char ch : inputArray) {
            inputList.add(ch);
        }
        return inputList;
    }

    public static String removeSymbols(String inputString) throws FileNotFoundException {
        ArrayList<Character> symbolList = FileOperations.getSymbols("C:\\WordCount\\Symbols.txt");
        ArrayList<Character> inputList = getStringToCharList(inputString);
        inputList.removeAll(symbolList);
        inputString = "";
        for (Character character : inputList) {
            inputString = inputString.concat(String.valueOf(character));
        }
        return inputString;
    }

    public static String removeSymbolsRetain(String inputString) throws FileNotFoundException {
        char inputCharArray[] = inputString.toCharArray();
        ArrayList<Character> inputList = new ArrayList<>();
        for (char c : inputCharArray) {
            inputList.add(c);
        }
        ArrayList<Character> retainSymbols = FileOperations.getSymbols("C:\\WordCount\\Symbols.txt");
        retainSymbols.add(' ');
        inputList.retainAll(retainSymbols);
        inputString = "";
        for (Character character : inputList) {
            inputString = inputString.concat(String.valueOf(character));
        }
        return inputString;
    }

    public static TreeSet<String> getUniqueList(String inputString) {
        inputString = inputString.toLowerCase();
        String inputStringArray[] = inputString.split(" ");
        TreeSet<String> uniqueList = new TreeSet();
        for (String string : inputStringArray) {
            uniqueList.add(string);
        }

        return uniqueList;

    }

    public static String removeSymbolsByAlphabets(String inputString) {
        ArrayList<Character> alphabetList = new ArrayList<>();
        alphabetList.add(' ');
        for (int i = 97; i <= 122; i++) {
            alphabetList.add((char) i);
        }
        ArrayList<Character> inputList = getStringToCharList(inputString);
        inputList.retainAll(alphabetList);
        inputString = "";
        for (Character character : inputList) {
            inputString = inputString.concat(String.valueOf(character));
        }
        return inputString;

    }

    public static ArrayList<String> removeStopWords(String inputString) throws FileNotFoundException {
        String inputStringArray[] = inputString.split(" ");
        ArrayList<String> inputList = new ArrayList<>();
        for (String string : inputStringArray) {
            inputList.add(string);
        }
        ArrayList<String> stopwordList = FileOperations.getStopWords("C:\\WordCount\\StopWords.txt");
        stopwordList.add(" ");
        stopwordList.add("  ");
        stopwordList.add("   ");
        inputList.removeAll(stopwordList);
        return inputList;
        

    }
}
