package a06_多态;

public class Dog extends Animate {
    @Override
    public void say() {
        System.out.println("汪汪汪~");
    }

    public void test(){
        System.out.println("test");
    }
}
