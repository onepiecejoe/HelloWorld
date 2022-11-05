package com.joe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFinalDemo {
    public static void main(String[] args) {
        //初始化会议室名称
        String[] rooms = {"一会议室", "二会议室", "三会议室", "四会议室", "五会议室", "六会议室", "七会议室", "八会议室"};
        Scanner input = new Scanner(System.in);
        while (true) {
            showMenu();
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                if (choice > 2 || choice < 0) {
                    System.out.println("输入有误，请重新输入！");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.print("请输入开会时间（请输入0-23数字，表示0点-23点）：");
                        int time = input.nextInt();
                        System.out.println("空闲的会议室如下");
                        for (int i = 0; i < rooms.length; i++) {
                            System.out.println(i + "\t" + rooms[i]);
                        }
                        System.out.print("请选择要使用的会议室序号:");

                }
            }
        }

    }

    public static void showMenu() {
        System.out.println("*****欢迎使用会议室预定系统*****");
        System.out.println("1.预定会议室");
        System.out.println("2.会议室状态查看");
        System.out.println("0.推出");
        System.out.print("请输入功能序号:");
    }


}
