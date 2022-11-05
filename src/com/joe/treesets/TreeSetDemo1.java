package com.joe.treesets;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        System.out.println(ts);
        // 迭代器
        System.out.println("------------------");
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()){
            int i = iter.next();
            System.out.println(i);
        }
        // 增强FOR
        System.out.println("------------------");
        for (Integer i : ts) {
            System.out.println(i);
        }
        // for each
        System.out.println("------------------");
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
        // for each lambda
        ts.forEach(i->System.out.print(i));
    }
}
