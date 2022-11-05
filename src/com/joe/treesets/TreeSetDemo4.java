package com.joe.treesets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        MiddleStudent m1 = new MiddleStudent("Joe", 22, 100, 99, 99);
        MiddleStudent m2 = new MiddleStudent("Hui", 21, 95, 95, 80);
        MiddleStudent m3 = new MiddleStudent("Lucy", 21, 95, 95, 80);
        MiddleStudent m4 = new MiddleStudent("Lili", 23, 100, 99, 80);
        MiddleStudent m5 = new MiddleStudent("Tom", 22, 100, 90, 70);
        HashSet<MiddleStudent> ts = new HashSet<>();
        ts.add(m1);
        ts.add(m2);
        ts.add(m3);
        ts.add(m4);
        ts.add(m5);
/*        for (MiddleStudent m : ts) {
            System.out.println(m.getName() +":" +  m.getTotalScore());
        }
        System.out.println(ts);*/

        TreeSet<MiddleStudent> newTs = new TreeSet<>(new Comparator<MiddleStudent>() {
            @Override
            public int compare(MiddleStudent o1, MiddleStudent o2) {
                if (o1.getTotalScore() == o2.getTotalScore()) {
                    if (o1.getYuWen() == o2.getYuWen()) {
                        if (o1.getShuXue() == o2.getShuXue()) {
                            if (o1.getYingYu() == o2.getYingYu()) {
                                if (o1.getAge() == o2.getAge()) {
                                    if (o1.getName() == o2.getName()) {
                                        return 0;
                                    } else {
                                        return o2.getName().compareTo(o1.getName());
                                    }
                                } else {
                                    return o2.getAge() - o1.getAge();
                                }
                            } else {
                                return o2.getYingYu() - o1.getYingYu();
                            }
                        } else {
                            return o2.getShuXue() - o1.getShuXue();
                        }
                    } else {
                        return o2.getYuWen() - o1.getYuWen();
                    }
                } else {
                    return o2.getTotalScore() - o1.getTotalScore();
                }
            }
        });

        newTs.addAll(ts);
        for (MiddleStudent m : newTs) {
            System.out.println(m);
        }
    }
}
