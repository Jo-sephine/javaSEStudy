package com.scanner;

import java.util.Scanner;

/**
 * @author Misluo
 * @create 2021/6/6 16:53
 */
public class Demo5 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车键\确认，通过输入非数字来结束输入并输出执行结果；

        Scanner scanner=new Scanner(System.in);



        //和
        double sum=0;
        //计算输入了多少数字
        int m=0;
        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while(scanner.hasNextDouble()){
            double x=scanner.nextDouble();

            m++;
            sum+=x;

        }
        System.out.println(m+"个数的和是"+sum);
        System.out.println(m+"个数平均值是"+sum/m);

    }
}
