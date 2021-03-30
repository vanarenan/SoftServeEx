package com.company;

import java.util.Arrays;

public class SecondEx {
    public static String encryption(String text){
        text = text.toLowerCase().replaceAll(" ", "");
        int length = text.length();
        double sqrt = Math.sqrt(length);
        int rows = (int) sqrt;
        int column = rows + 1;
        System.out.println(sqrt + " " + rows + " " + column);
        if (length >= rows*column){
            rows += 1;
        }
        System.out.println(length);
        int RC = (rows*column) - length;
        for (int i = 0; i < RC; i++) {
            text += " ";

        }
        System.out.println(text.length());
        String[] array = new String[rows];
        for (int i = 0; i < rows; i++) {
            array[i] = text.substring(i*column, column+i*column);
        }
        System.out.println(Arrays.toString(array));

        String result = "";
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < array.length; j++) {
                result += array[j].charAt(i);
            }
            result += " ";
        }
        result = result.trim();
        return result;
    }
    public static void main(String[] args) {
    String text = "if man was meant to stay on the ground god would have given us roots";
        System.out.println(encryption("feed the dog"));
    }
}
