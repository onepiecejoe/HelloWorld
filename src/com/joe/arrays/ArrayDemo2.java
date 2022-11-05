package com.joe.arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] nums = {9, 14, 8, 20, 4};
        // 最大值
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("最大值为:" + max);
        // 最小值
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = nums[i] < min ? nums[i] : min;
        }
        System.out.println("最小值为:" + min);
        // 求和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("和为:" + sum);
        // 求平均值
        double avg = (double) sum / nums.length;
        System.out.println("平均值为:" + avg);
        // 统计符合条件的元素个数 计数器
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("偶数的个数为:" + count);
    }
}
