package Method;/**
*@author Misluo
*@create 2021/6/10 14:42
*/public class Demo5 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int n){

        if(n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
