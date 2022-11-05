package com.joe.arrays;

import java.util.Arrays;
import java.util.EnumSet;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] nums = {15, 3, 21, 49, 8};
        int[] tmpNums = nums;
        System.out.println("原始顺序为:" + Arrays.toString(nums));
        // 冒泡排序
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
            System.out.printf("第%d轮:" + Arrays.toString(nums), (i + 1));
            System.out.println();
        }
        System.out.println("最终顺序为:" + Arrays.toString(nums));
        System.out.print("快捷方法的排序为:");
        Arrays.sort(tmpNums);
        System.out.println(Arrays.toString(tmpNums));

    }
}
