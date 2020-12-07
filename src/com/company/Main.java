package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        int multiArray[][] = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
        printArray(multiArray);
    }

    private static void printArray(int[][] multiArray) {
        try {
            for (int countOne = 0; countOne < multiArray.length; countOne++) {
                for (int countTwo = 0; countTwo < multiArray[countOne].length; countTwo++) {
                    System.out.println(multiArray[countOne][countTwo]);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
