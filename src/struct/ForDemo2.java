package struct;

/**
 * @author Misluo
 * @create 2021/6/7 10:30
 */
public class ForDemo2 {
    public static void main(String[] args) {
        //计算0-100奇数偶数之和
        int oddsum=0;
        int evensum=0;
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
            oddsum+=i;
            }else{
                evensum+=i;
            }
        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
