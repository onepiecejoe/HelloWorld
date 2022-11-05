package com.joe.runtime;

import java.util.Iterator;
import java.util.ListIterator;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors()); // CPU线程数
        System.out.println(runtime.maxMemory()/1024/1024); // 总内存
        System.out.println(runtime.totalMemory()/1024/1024); // 已获得内存
        System.out.println(runtime.freeMemory()/1024/1024); // 剩余内存
    }


}
