package com.joe.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
/*        double[] scores = new double[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
*//*            System.out.println("请输入第" + (i+1) + "个成绩:");*//*
            System.out.printf("请输入第%d个成绩：", (i + 1));
            scores[i] = input.nextDouble();
        }

        System.out.println("输入的成绩如下:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }*/

        int[] nums = {4, 8, 2, 7, 9, 1, 3, 5, 6};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            int iMax = nums.length - 1;
            sb.append(nums[i]);
            if (i == iMax) {
                sb.append("]");
                break;
            }
            sb.append(",");
        }
        System.out.println(sb.toString());

/*        String str = Arrays.toString(nums);
        System.out.println(str);*/
/*        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));*/
        Arrays.sort(nums, 2, 5);
        System.out.println(Arrays.toString(nums));

    }
}
