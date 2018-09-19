
public class Main01 {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        byte byte1 = 127;
        short short1 = 32767;
        char char1 = 'a';
        char char2 = 98;
        char char3 = '严';
        System.out.println(char1); // a
        System.out.println(char2); // b
        System.out.println(char3); // 严
        System.out.println(char3 + 0); // b
        System.out.println(char1 + 0); // 97
    }
}