package a03_流程控制;

/**
 * 打印金字塔
 */
public class Demo03 {
    public static void main(String[] args) {

        // 方法一 ： 根据底部算
//        int lay = 5; // 层数
//        int num = lay * 2 - 1;
//        for (int i = 1; i <= num; i += 2) {
//            for (int k = num - i - 1; k > 0; k -= 2) {
//                System.out.print(" ");
//            }
//            for (int y = 0; y < i; y ++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 方法二 ： 根据层数算
        int lay = 4;
        for (int i = 1; i <= lay; i ++) {
            for (int k = 0; k < lay - i; k ++) {
                System.out.print(" ");
            }
            for (int y = 0; y < i* 2 - 1; y ++) {
                if (y == 0 || y == (i - 1) * 2 || i == lay)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
