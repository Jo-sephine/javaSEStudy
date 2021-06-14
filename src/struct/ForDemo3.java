package struct;

/**
 * @author Misluo
 * @create 2021/6/7 21:11
 */
public class ForDemo3 {
    public static void main(String[] args) {
        //用while或者for循环输出1-1000之间能被5整除的数，并且每行输出3个
        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){//每行
                System.out.println();
                //System.out.print("\n");
            }
        }
    }
}
