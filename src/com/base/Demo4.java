package com.base;

/**
 * @author Misluo
 * @create 2021/5/31 20:39
 */
public class Demo4 {
    public static void main(String[] args) {
        int i=128;
        Byte b=(byte)i;//内存溢出
        //强制转换 （类型）变量名 高-低需要强制转换
        System.out.println(i);
        System.out.println(b);
        //自动转换 低-高
        int i1=128;
        double d=i;

        System.out.println(i1);
        System.out.println(d);


        System.out.println((int)23.7);//23
        System.out.println((int)-45.89f);//45

        char a='c';
        int f=a+1;
        System.out.println(f);
        System.out.println((char)f);
    }
}
/*
注意：
1.不能对布尔值进行变换
2.不能把对象类型转换成不相干类型
3.在把高容量转换成低容量时候，强制转换
4.转换时候可能出现内存溢出，或者精度问题！
 */



