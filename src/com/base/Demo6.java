package com.base;

/**
 * @author Misluo
 * @create 2021/6/2 15:18
 */
public class Demo6 {
    //类变量  static
    //static 修饰符不存在先后顺序
    static double salary=2500;



    //属性；变量

    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值是0或者0.0 0000 布尔值默认是false除了基本类型其他都默认null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值
        int i=10;//只在这个括号里有用
        //变量类型  变量名字=new com.base.Demo6()
        Demo6 Demo6=new Demo6();
        System.out.println(Demo6.age);
        System.out.println(Demo6.name);


        //类变量 static
    }
    //其他方法
    public void add(){

    }
}
