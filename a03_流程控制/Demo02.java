package a03_流程控制;

/**
 * do while
 * while
 * for
 */
public class Demo02 {
    public static void main (String args[]) {
        int i = 1;
        do {
            System.out.println(i++);
        } while (i < 6);
        i = 1;
        System.out.println("-----------");
        while (i < 6) {
            System.out.println(i++);
        }
        System.out.println("-----------");
        for (i = 1; i < 6; i ++) {
            System.out.println(i);
        }
    }
}
