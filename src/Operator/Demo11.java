package Operator;

/**
 * @author Misluo
 * @create 2021/6/2 20:44
 */
public class Demo11 {
    public static void main(String[] args) {
        //与&& 或 ||  非!
        boolean a=true;
        boolean b=false;

        System.out.println(a&&b);//逻辑与运算：两个都为真，结果才为真
        System.out.println(a||b);//逻辑或运算：两个有一个为真，结果就是真
        System.out.println(!(a&&b));//逻辑非运算：若真为假，若假为真

        //短路运算
        int c=5;
        boolean d=(c<4)&&(c++<4);
        System.out.println(c);
        System.out.println(d);
    }

}
