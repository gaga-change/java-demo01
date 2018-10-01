package a09_数组;

import java.util.Arrays;

/*
对象数组 测试
 */
public class Demo02 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        // 这里 dogs[0] == null
//        dogs[0].setName("123"); // error 报错
        System.out.println(dogs[0] == null); // true
        System.out.println(Arrays.toString(dogs));
    }
}
