package com.joe.arrays;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        if (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.println(num);
        } else {
            System.out.println("输入错误！");
        }

    }
}
