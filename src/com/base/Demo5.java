package com.base;

/**
 * @author Misluo
 * @create 2021/5/31 21:01
 */
public class Demo5 {
    public static void main(String[] args) {
        //操作比较打的数时候，注意溢出问题
        //JDK7新特性，数字之间可用下划线分割
        int money=10_0000_0000;
        int years=20;
        int total=money*years;//计算时候溢出
        System.out.println(total);
        long total2=money*years;//依旧溢出，默认是int，转换之前已经存在问题。
        long total3=money*((long)years);
        System.out.println(total3);
    }
}
