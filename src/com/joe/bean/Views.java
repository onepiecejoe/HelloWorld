package com.joe.bean;

import java.util.Random;
import java.util.Scanner;

public class Views {
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();
    public void welcome() {
        System.out.println("欢迎使用小区快递管理系统");
    }

    public void bye() {
        System.out.println("程序即将关闭，再见");
    }

    public int mainMenu() {
        System.out.println("请根据提示，输入功能序号:");
        System.out.println("1.快递录入");
        System.out.println("2.快递取出");
        System.out.println("3.查看所有");
        System.out.println("0.退出程序");
        int num = -1;
        try {
            num = input.nextInt();
        } catch (Exception e) {

        }
        if (num < 0 || num > 3) {
            System.out.println("输入错误，请重新输入");
            return mainMenu();
        }
        return num;
    }



}
