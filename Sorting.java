package com.mycompany.wordcountusingarraylist;

public class Sorting {

    public static char[][] getAscendingSort(char[][] charCount) {
        char temp = 0;
        for (int i = 0; i < charCount.length - 1; i++) {
            for (int j = 0; j < charCount.length - i - 1; j++) {
                if (charCount[j][1] > charCount[j + 1][1]) {

                    // Swap charCount[j] and charCount[j+1]
                    temp = charCount[j][0];
                    charCount[j][0] = charCount[j + 1][0];
                    charCount[j + 1][0] = temp;

                    temp = charCount[j][1];
                    charCount[j][1] = charCount[j + 1][1];
                    charCount[j + 1][1] = temp;
                }
            }

        }
        return charCount;
    }

    public static char[][] getDescendingSort(char[][] charCount) {
        char temp = 0;
        for (int i = 0; i < charCount.length - 1; i++) {
            for (int j = 0; j < charCount.length - i - 1; j++) {
                if (charCount[j][1] < charCount[j + 1][1]) {

                    // Swap charCount[j] and charCount[j+1]
                    temp = charCount[j][0];
                    charCount[j][0] = charCount[j + 1][0];
                    charCount[j + 1][0] = temp;

                    temp = charCount[j][1];
                    charCount[j][1] = charCount[j + 1][1];
                    charCount[j + 1][1] = temp;
                }
            }

        }
        return charCount;
    }

    public static void printSorting(char[][] charCount, String type) {
        if (type == "Asc") {
            getAscendingSort(charCount);
        }
        if (type == "Dsc") {
            getDescendingSort(charCount);
        }
        for (int i = 0; i < charCount.length; i++) {
            System.out.println(charCount[i][0] + " " + (int) charCount[i][1]);
        }

    }
}
