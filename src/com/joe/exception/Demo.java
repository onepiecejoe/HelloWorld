package com.joe.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========欢迎使用除法计算器==========");
        try {
            System.out.println("请输入被除数：");
            int x = input.nextInt();
            System.out.println("请输入除数：");
            int y = input.nextInt();
            int z = x / y;
            System.out.println("运算完毕，结果是：" + z);
        } catch (ArithmeticException e) {
            System.out.println("用户输入的除数为0，异常已处理");
            System.out.println("用户输入了错误的参数类型，异常已处理");
        } finally{
            System.out.println("程序结束！");
        }


    }
}
