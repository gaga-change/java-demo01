package a02_基本运算符;

/**
 * ++ -- 运算符
 */
public class Demo02 {
    public static void main(String args[]) {
        int a = 1;
        int b = a ++; // 1
        int c = ++ a; // 3
        int d = c*=3;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
