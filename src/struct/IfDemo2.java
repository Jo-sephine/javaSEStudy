package struct;

import java.util.Scanner;

/**
 * @author Misluo
 * @create 2021/6/6 20:10
 */
public class IfDemo2 {
    public static void main(String[] args) {
        //考试分数大于60及格，小于60不及格
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score=scanner.nextInt();
        if(score>60){
            System.out.println("及格");
        }else{
            System.out.println("不及格 ");
        }



        scanner.close();
    }
}
