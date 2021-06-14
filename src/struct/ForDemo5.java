package struct;

/**
 * @author Misluo
 * @create 2021/6/8 11:20
 */
public class ForDemo5 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};//定义一个数组
       //遍历数组元素

        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
