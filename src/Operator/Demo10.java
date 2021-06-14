package Operator;

/**
 * @author Misluo
 * @create 2021/6/2 20:31
 */
public class Demo10 {
    public static void main(String[] args) {
        //++  --自增，自减  一元运算符
        int a=3;
        int b=a++;
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //幂运算  很多运算需要工具来用
       double pow= Math.pow(2,3);
        System.out.println(pow);
    }
}
