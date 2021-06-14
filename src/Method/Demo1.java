package Method;

/**
 * @author Misluo
 * @create 2021/6/8 22:46
 */
public class Demo1 {
    //main方法
    public static void main(String[] args) {
        //int sum=add(1,2);
        //  System.out.println(sum);
        test();
    }

    //加法
    public static int add(int a, int b) {
        return a + b;
    }

    public static void test() {
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {//每行
                System.out.println();
            }
        }
    }
}