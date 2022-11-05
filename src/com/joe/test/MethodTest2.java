package com.joe.test;

public class MethodTest2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {10,30,40,50,20};
        //调用方法
        int maxArray = maxArray(arr);
        System.out.println(maxArray);
    }
    // 定义方法
    public static int maxArray(int[] arr){
        //定义变量接收数组最大值，初始化为第一个值
        int max = arr[0];
        //遍历数组,记录最大值变化情况
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
