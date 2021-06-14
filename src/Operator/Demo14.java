package Operator;


import com.base.*;//导入这个包下所有类


/**
 * @author Misluo
 * @create 2021/6/3 15:12
 */
//三元运算符
public class Demo14 {
    public static void main(String[] args) {
      //x?y:z   若x结果为真，则结果为y，否则结果为z
      int score=80;
      String typle=score<60?"不及格":"及格";
      System.out.println(typle);


    }
}
