package com.joe.treesets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("c");
        ts.add("ad");
        ts.add("bc");
        ts.add("efg");
        System.out.println(ts);

        TreeSet<String> newTs = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        newTs.addAll(ts);
        System.out.println(newTs);
    }
}
