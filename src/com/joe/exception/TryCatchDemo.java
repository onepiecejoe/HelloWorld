package com.joe.exception;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true) {
            i = 0;
            System.out.print("请输入一个整数:");
            String s = scanner.nextLine();
            try {
                i = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是整数");
            }
        }
        System.out.println("您输入的整数是:" + i);


    }
}
