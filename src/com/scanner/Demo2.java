package com.scanner;

import java.util.Scanner;

/**
 * @author Misluo
 * @create 2021/6/3 19:36
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("使用nextline方式接收：");
        if(scanner.hasNextLine()){
            String str=scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
        scanner.close();
    }
}
