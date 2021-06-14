package struct;

/**
 * @author Misluo
 * @create 2021/6/7 21:18
 */
public class ForDemo4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for(int j=1;j<=i;j++){
                int k=i*j;
                System.out.print(j+"*"+i+"="+k+"\t");
            } System.out.println();
        }

    }
}
