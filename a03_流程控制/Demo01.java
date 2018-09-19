package a03_流程控制;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 输入 1 ~ 7。 返回相应 星期
 */
public class Demo01 {
    public static void main(String args[]) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("请输入 1 ~ 7");
            String in = bufferedReader.readLine();
            int num = Integer.parseInt(in);
            String out;
            switch (num) {
                case 1:
                    out = "星期一";
                    break;
                case 2:
                    out = "星期二";
                    break;
                case 3:
                    out = "星期三";
                    break;
                case 4:
                    out = "星期四";
                    break;
                case 5:
                    out = "星期五";
                    break;
                case 6:
                    out = "星期六";
                    break;
                case 7:
                    out = "星期日";
                    break;
                default:
                    out = "输入数字不是 1 ~ 7 范围内~";
                    break;
            }
            System.out.println(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
