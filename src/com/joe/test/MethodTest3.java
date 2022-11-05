package com.joe.test;

public class MethodTest3 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {10, 20, 30, 40};
        //调用方法
        boolean exist = isExist(arr, 60);
        System.out.println(exist);
    }
    public static boolean isExist(int[] arr,int number){
        //定义变量，初始化为false
        boolean isExist = false;
        //遍历数组元素，如果存在则将变量置为true
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                isExist = true;
            }
        }
        return isExist;
    }
}
