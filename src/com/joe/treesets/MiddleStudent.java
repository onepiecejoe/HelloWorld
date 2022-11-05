package com.joe.treesets;

public class MiddleStudent /*implements *//*Comparable<MiddleStudent>*/{
    private String name;
    private int age;
    private int yuWen;
    private int shuXue;
    private int yingYu;

    public MiddleStudent(String name, int age, int yuWen, int shuXue, int yingYu) {
        this.name = name;
        this.age = age;
        this.yuWen = yuWen;
        this.shuXue = shuXue;
        this.yingYu = yingYu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYuWen() {
        return yuWen;
    }

    public void setYuWen(int yuWen) {
        this.yuWen = yuWen;
    }

    public int getShuXue() {
        return shuXue;
    }

    public void setShuXue(int shuXue) {
        this.shuXue = shuXue;
    }

    public int getYingYu() {
        return yingYu;
    }

    public void setYingYu(int yingYu) {
        this.yingYu = yingYu;
    }

    @Override
    public String toString() {
        return "MiddleStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yuWen=" + yuWen +
                ", shuXue=" + shuXue +
                ", yingYu=" + yingYu +
                ", totalScore=" + getTotalScore() +
                '}';
    }

    public int getTotalScore() {
        int totalScore = yuWen + shuXue + yingYu;
        return totalScore;
    }


/*    @Override
    public int compareTo(MiddleStudent o) {
        int i = o.getTotalScore() - this.getTotalScore();
        return i;
    }*/
}
