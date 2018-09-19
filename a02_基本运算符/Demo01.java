package a02_基本运算符;

/**
 * 1. 判断是否整除
 */
public class Demo01 {
    public static void main(String args[]) {
        int a = 2;
        int b = 4;
        if (b % a == 0) {
            System.out.println("可以整除");
        } else {
            System.out.println("不可以整除");
        }
    }
}
