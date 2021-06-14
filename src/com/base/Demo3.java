package com.base;

/**
 * @author Misluo
 * @create 2021/5/30 20:39
 */
public class Demo3 {
    public static void main(String[] args) {
        //整数扩展：进制  二进制0b 十进制 八进制0  十六进制0x
        int i = 10;
        int i2 = 010;//八进制10
        int i3 = 0x10;//十六进制10


        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);


        //浮点型扩展  银行业务怎么表示？钱
        //BigDecimal 数学工具类
        //float 有限 离散 舍入误差 大约  接近但不等于 最好完全使用浮点数进行比较
        //double
        float f = 0.1f;//0.1
        double d = 1.0 / 10;//0.1
        System.out.println(f == d);
        System.out.println(f);
        System.out.println(d);
        float d1 = 2339848489f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);


        //字符扩展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1);//强制转换
        System.out.println(c2);
        System.out.println((int) c2);
        //所有字符本质还是数字
        //编码Unicode 2字节 65536
        //U0000-UFFFF区间范围
        char c3 = '\u0061';
        System.out.println(c3);
        //转义字符
        //\t 制表符
        //\n 换行
        System.out.println("Hello\tWorld");


        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);
        //对象  内存分析
        //布尔值扩展
        boolean flag = true;

    }
}
