package a04_类;

/**
 * 动物类
 */
public class Animate {
    private int age; // 年龄

    public Animate() {}

    public Animate(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animate{" +
                "age=" + age +
                '}';
    }
}
