package com.joe.treesets;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("wanghaizhou", 22);
        Student s2 = new Student("yihui", 22);
        Student s3 = new Student("lucy", 21);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
        System.out.println(s1.compareTo(s2));

    }


}
