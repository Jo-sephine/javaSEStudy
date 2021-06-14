package struct;

/**
 * @author Misluo
 * @create 2021/6/6 21:32
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        //1+2....+100
        int i=0;
        int sum=0;
        do {

            sum+=i;
            i++;
        }while(i<=100);

            System.out.println(sum);

    }
}
