package a04_类;

/**
 * 工具类
 */
public class Tools {

    /**
     * 计算两数和
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 计算 1 + 2 + 3 + ... + num 的和
     * @param num
     * @return
     */
    public static int add(int num) {
        int sum = 0;
        for(int i = 1; i <= num; i ++) {
            sum += i;
        }
        return sum;
    }

    public static float add (float a, float b) {
        return a + b;
    }

}
