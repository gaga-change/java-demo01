package a09_数组;

import java.util.Arrays;

/*
定义数组方法：
静态创建

动态创建
 */
public class Demo01 {
    public static void main(String[] args) {
        // 方式一： 声明，分配空间并赋值
        int[] abc = {1, 2, 3}; // 这里和js不一样。已花括号初始化。
        // abc = {1, 2, 3}; // Error : 不能后赋值

        // 方式二： 后赋值
        int[] test;
        test = new int[]{1, 2, 3}; // 有一个 new

        int[] test2;
        test2 = new int[3];

        int[] test3 = new int[3];

        sayArr(test2);
        System.out.println(Arrays.toString(new float[4]));
    }

    public static String arrToStr(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuilder.append(arr[i]);
            } else {
                stringBuilder.append(arr[i]).append(',');
            }
        }
        return stringBuilder.toString();
    }

    public static void sayArr(int[] arr) {
        String str = arrToStr(arr);
        System.out.println(str);
    }
}
