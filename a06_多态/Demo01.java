package a06_多态;

public class Demo01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animate a1 = dog;
        ((Dog) a1).test(); // 强制转换
        a1.say();
        runSay(new Cat());

        // 强制转换报错
        /*Animate test1 = new Animate();
        Dog d = (Dog) test1;
        d.say();*/
    }

    public static void runSay(Animate animate) {
        animate.say();
    }
}
