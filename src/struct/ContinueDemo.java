package struct;

/**
 * @author Misluo
 * @create 2021/6/8 16:28
 */
public class ContinueDemo {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            i++;
            if (i%10==0){
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
        /*
        1.break 再任何循环主体部分，均可用break控制循环的流程。
         2.break用于强制退出循环，不执行剩余部分语句
        3.continue  语句用在循环语句体中，用于终止某次循环过程，即跳过循环中尚未执行的语句，接着进行下一句是否执行循环的判定
         */
    }
}
