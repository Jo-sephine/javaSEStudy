package struct;

/**
 * @author Misluo
 * @create 2021/6/7 10:17
 */
public class ForDemo1 {
    public static void main(String[] args) {

        int a=1;//初始化条件
        while(a<=100) {//条件判断
            System.out.println(a);//循环体
            a += 2;//迭代
        }


        for ( a=1;a<=100;a+=2){
            System.out.println(a);
        }

    }
}
