package com.joe.system_;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

/*        System.arraycopy(arr1, 0, arr2, 4, 3);*/
        System.arraycopy(arr1,6,arr2,2,3);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

}
