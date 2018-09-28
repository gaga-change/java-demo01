package a07_抽象类;

public class Demo01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.say();
        Animate animate = new Animate() {
            @Override
            public void say() {
                System.out.println("匿名类");
            }
        };
        animate.test();
    }
}

