package com.joe.sb;

import java.util.StringJoiner;

public class StringJ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrToString(arr));
        StringJoiner sj = new StringJoiner("---");
        sj.add("a").add("b");
        System.out.println(sj);


    }

    public static String arrToString(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
            System.out.println(sj);
        }
        return sj.toString();
    }
}
