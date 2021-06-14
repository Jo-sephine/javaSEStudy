package Operator;

/**
 * @author Misluo
 * @create 2021/6/2 20:15
 */
public class Demo8 {
    public static void main(String[] args) {
        long a=123345556666L;
        int b=123;
        short c=10;
        byte d=8;
        System.out.println(a+b+c+d);//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int  有long输出就是long类型，否则全都是int类型


    }
}
