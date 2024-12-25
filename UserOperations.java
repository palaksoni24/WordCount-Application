package com.mycompany.wordcountusingarraylist;

import java.util.*;

public class UserOperations {

    public static void print(Collection list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public static void print2D(char[][] charCount) {
        for (char[] cs : charCount) {
            System.out.println(cs[0] + " " + (int) cs[1]);
        }

    }

    public static void print2D(String[][] wordCount) {
        for (String[] string : wordCount) {
            System.out.println(string[0] + " " + string[1]);
        }

    }

    public static void print(char[][] charCount, int number) {
        if (number == 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println(charCount[i][0] + " " + (int) charCount[i][1]);
            }
        }
        if (number == 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(charCount[i][0] + " " + (int) charCount[i][1]);
            }
        }
    }

    public static char[][] getCharCount(ArrayList<String> inputString) {
        String input = "";
        for (String string : inputString) {
            input = input.concat(string);
        }
        char inputCharArray[] = input.toCharArray();
        ArrayList<Character> inputList = new ArrayList<>();
        ArrayList<Character> alphabetList = new ArrayList<>();
        for (Character character : inputCharArray) {
            inputList.add(character);
        }
        for (int i = 97; i <= 122; i++) {
            alphabetList.add((char) i);
        }
        int index = 0;
        char charCount[][] = new char[26][2];
        for (char alpha : alphabetList) {
            int frequency = Collections.frequency(inputList, alpha);
            charCount[index][0] = alpha;
            charCount[index][1] = (char) frequency;
            index++;
        }

        return charCount;

    }

    public static String[][] getWordCount(TreeSet<String> inputString) {
        String input = "";
        for (String string : inputString) {
            input = input.concat(string).concat(" ");
        }
        String inputStringArray[] = input.split(" ");
        ArrayList<String> inputList = new ArrayList<>();
        for (String string : inputStringArray) {
            inputList.add(string);
        }
        String wordCount[][] = new String[inputList.size()][2];
        int index = 0;
        int count = 0;
        for (String str : inputList) {
            wordCount[index][0] = str;
            count++;
            wordCount[index][1] = String.valueOf(count);
            index++;
        }
        return wordCount;

    }

    public static void getTop5(char[][] charCount) {
        Sorting.getDescendingSort(charCount);
    }

    public static void getTop10(char[][] charCount) {
        Sorting.getDescendingSort(charCount);

    }

    public static void getBottom5(char[][] charCount) {
        Sorting.getAscendingSort(charCount);

    }

    public static void getBottom10(char[][] charCount) {
        Sorting.getAscendingSort(charCount);

    }

}
