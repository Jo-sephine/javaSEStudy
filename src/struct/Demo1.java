package struct;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author Misluo
 * @create 2021/6/6 17:16
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入内容：");
        String s=scanner.nextLine();
        //equals:判断字符串是否相等
        if(s.equals("Hello")) {
            System.out.println(s);
        }
        System.out.println("end");
        scanner.close();
    }
}
