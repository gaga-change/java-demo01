
public class Main02 {
    public static void main(String args[]) {
        int a = (int)1.2;
        double b = 3;
        System.out.println(a);
        System.out.println(b); // 3.0

        int int1 = 1;
        double double1 = 3.1;
        // int1 = (int)double1;
        // System.out.println(int1);
        double1 = int1;
        System.out.println(double1);

        int int2 = 222;
        byte byte1 = (byte)int2;
        System.out.println(byte1);

        int int3 = 3;
        int int4 = (int)(int3 + 3.4);
        System.out.println(int4);

        float f = 3.4f;
        System.out.println(f);
    }
}