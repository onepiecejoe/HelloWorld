package com.joe.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55,11};
/*
        int max = arr[0]; // max初始化的值一定要是数组中的值
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);*/
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
