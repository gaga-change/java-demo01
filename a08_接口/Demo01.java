package a08_接口;

// 模拟实现：
// 相机插入电脑，电脑获取相机内存信息
public class Demo01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.runCamera();
        Computer computer = new Computer();
        computer.useUsb(camera);
        computer.readStore();
    }
}