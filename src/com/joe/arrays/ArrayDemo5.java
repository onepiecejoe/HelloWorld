package com.joe.arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 8, 20, 6, 15};
        int index = indexValue(nums, 20);
        System.out.println(index);
    }

    public static int indexValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
