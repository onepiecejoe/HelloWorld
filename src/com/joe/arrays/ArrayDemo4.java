package com.joe.arrays;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            int j = nums.length - i - 1;
            nums[i] = nums[j];
            nums[j] = tmp;
            System.out.printf("第%d次调换的顺序为:" + Arrays.toString(nums),(i+1));
            System.out.println();
        }
        System.out.println("处理后的顺序为:" + Arrays.toString(nums));
    }
}
