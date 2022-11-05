package com.joe.arrays;

public class ArrayDemo7 {
    public static void main(String[] args) {
        // 二维数组
        int[][] nums = new int[3][2];
        nums[0] = new int[]{34, 19};
        nums[1] = new int[]{45, 67,88};
        nums[2] = new int[]{47, 98,12,10};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("第%d组的第%d个元素为:" + nums[i][j],(i+1),(j+1));
                System.out.println();
            }
        }
    }
}
