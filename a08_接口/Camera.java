package a08_接口;

public class Camera implements Usb {
    // 是否启动
    private Boolean run = false;
    private String data = "我是相机里存放的照片";

    // 启动相机
    public void runCamera() {
        if (run) {
            System.out.println("相机已启动");
        } else {
            this.run = true;
            System.out.println("相机启动成功");
        }
    }

    @Override
    public Boolean connect() {
        if (!run) {
            System.out.println("相机未启动~");
            return false;
        } else {
            return  true;
        }
    }

    @Override
    public String read() {
        return data;
    }
}
