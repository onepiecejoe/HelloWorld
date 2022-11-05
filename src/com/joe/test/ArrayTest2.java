package com.joe.test;

import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 1.定义一个动态初始化数组
        int[] arr = new int[10];
        // 2.创建random对象
        Random r = new Random();
        // 3.生成10个随机数存入数组并打印
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        // 4.求所有元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        // 5.求所有元素的平均数
        int avg = sum / arr.length;
        System.out.println(avg);
        // 6.统计有多少个元素比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println(count);
    }
}
