package Method;

/**
 * @author Misluo
 * @create 2021/6/8 23:11
 */
public class Demo2 {
    public static void main(String[] args) {
     int max=max(10,10);
        System.out.println(max);
    }
    //比大小
    public static int max(int a,int b){
        if (a==b){
            System.out.println("a=b");
            return 0;//终止方法
        }
        int result=0;
        if (a>b){
          result=a;
        }else{
            result=b;
        }
        return result;
    }
}
