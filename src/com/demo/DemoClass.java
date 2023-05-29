package com.demo;

public class DemoClass {
    public static void main(String[] args) {
        int ss=50;
        int s1=75;
        DemoClass obj = new DemoClass(ss , s1);
        obj.method(ss ,s1);
    }
    public  DemoClass(int ss, int s1) {
    ss = 50;
    s1 = 75;
    }
    public void method(int ss , int s1){
        System.out.println(ss*s1);
    }
}
