package com.joe.sb;

import java.util.Scanner;

public class StringBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = sc.next();
        System.out.println("字符串是否是对称：" + ifBalance(str));

    }

    public static boolean ifBalance(String str) {
        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.reverse().toString();
        if (newStr.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
