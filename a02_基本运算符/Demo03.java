package a02_基本运算符;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 接收两个数，判断 大于、小于、等于
 */
public class Demo03 {
    public static void main(String args[]) {
        try {
            // 输入流，从键盘接收数
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            System.out.println("请输入第一个数");
            // 从控制台读取一行数据
            String a1 = bufferedReader.readLine();
            System.out.println("请输入第二个数");
            // 从控制台读取一行数据
            String a2 = bufferedReader.readLine();

            // 把String 转 float
            Float f1 = Float.parseFloat(a1);
            Float f2 = Float.parseFloat(a2);

            if (f1 < f2) {
                System.out.println("第一个数小于第二个数");
            } else if (f1.equals(f2)) {
                System.out.println("第一个数等于第二个数");
            } else if (f1 > f2) {
                System.out.println("第一个数大于第二个数");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
