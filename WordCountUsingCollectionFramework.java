package com.mycompany.wordcountusingarraylist;

import java.io.FileNotFoundException;
import java.util.*;

public class WordCountUsingCollectionFramework {

    public static void main(String[] args) throws FileNotFoundException {
        String string = FileOperations.getFileContent("C:\\WordCount\\Input.txt");
        System.out.println("--------Before--------");
        System.out.println(string);
        System.out.println("--------After Symbol Remove--------");
        string = DataOperations.removeSymbols(string);
        System.out.println(string);
        System.out.println("--------After Symbol Retain--------");
        System.out.println(DataOperations.removeSymbolsRetain(string));     
        System.out.println("--------After stopWords Remove--------");
        ArrayList<String> list = DataOperations.removeStopWords(string);
        System.out.println(list);

        System.out.println("--------Unique Word List--------");
        TreeSet<String> list1 = DataOperations.getUniqueList(string);
        UserOperations.print(list1);
        System.out.println("--------Character Count--------");
        char[][] charCount = UserOperations.getCharCount(list);
        UserOperations.print2D(charCount);
        System.out.println("--------Ascending Sort--------");
        // char[][] Asc = Sorting.getAscendingSort(charCount);
        Sorting.printSorting(charCount, "Asc");
        System.out.println("--------Descending Sort--------");
        // char[][] Dsc = Sorting.getDescendingSort(charCount);
        Sorting.printSorting(charCount, "Dsc");
        System.out.println("--------Word Count--------");
        String[][] wordCount = UserOperations.getWordCount(list1);
        UserOperations.print2D(wordCount);
        System.out.println("--------Top 5--------");
        UserOperations.getTop5(charCount);
        UserOperations.print(charCount, 5);
        System.out.println("--------Top 10--------");
        UserOperations.getTop10(charCount);
        UserOperations.print(charCount, 10);
        System.out.println("--------Bottom 5--------");
        UserOperations.getBottom5(charCount);
        UserOperations.print(charCount, 5);
        System.out.println("--------Bottom 10--------");
        UserOperations.getBottom10(charCount);
        UserOperations.print(charCount, 10);

   }

}
