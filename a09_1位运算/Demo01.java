package a09_1位运算;

/**
 * 四个位运算（默认结果为int）
 * ~ 取反 ： 0变1， 1变0
 * & 与 ： 全为1，结果为1
 * | 或 ： 有一个为1，结果为1
 * ^ 异或 ： 一个为0，一个为1，结果为1
 * ======================================
 * 三个移位运算（默认结果为int）
 * >> 算术右移 ：低位溢出，符号位不变，并用符号位补溢出的高位
 * << 算术左移 ：符号位不变，低位补0
 * >>> 逻辑右移 ： 低位溢出，高位补0
 */
public class Demo01 {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
    }

    // 取反
    public static void test01() {
        // 1 => 0000 0001
        // =》 补码 1111 1110
        // =》 反码 1111 1101
        // =》 原码 1000 0010
        // -2
        System.out.println("~1 = " + ~1);
    }

    // >> 算术右移
    public static void test02() {
        int b = 1 >> 2;
        // 1 补码 0000 0001
        // 1 右移两位 0000 0000
        // 0
        System.out.println("1 >> 2 = " + b);
    }

    // << 算术左移
    public static void test03() {
        int b = -1 << 2;
        // -1 补码 1111 1111
        // 左移两位 1111 1100
        // 补码 1111 1011
        // 原码 1000 0100
        // -4
        System.out.println("-1 << 2 =" + b);
    }

    // >>> 逻辑右移
    public static void test04() {
        int b = 1 >>> 3;
        // 1 的反码 0000 0001
        // 逻辑右移3位 0000 0000
        // 0
        System.out.println("1 >>> 3 = " + b);

        // -1 反码 1111 1111 1111 1111 1111 1111 1111 1111
        // 逻辑右移31位 0000 0000 0000 0000 0000 0000 0000 0001
        // 1
        System.out.println("-1 >>> 2 = " + (-1 >>> 31));
    }
}
