package struct;

/**
 * @author Misluo
 * @create 2021/6/6 20:38
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        //case穿透   //switch匹配一个具体的值
        char grade='C';

        switch(grade){
            case'A':
                System.out.println("Excellent");
                break;
            case'B':
                System.out.println("good");
                break;
            case'C':
                System.out.println("just so so");
            case'D':
                System.out.println("bad");
            default:
                System.out.println("未知");
        }
    }
}
