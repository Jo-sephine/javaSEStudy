package struct;

/**
 * @author Misluo
 * @create 2021/6/6 21:16
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        //字符的本质是数字
        String name="罗小忙";
        switch(name){
            case"罗小莓":
                System.out.println("罗小莓");
                break;
            case"罗小忙":
                System.out.println("罗小忙");
                break;
        }

    }
}
