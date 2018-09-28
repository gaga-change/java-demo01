package a08_接口;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    // 已插入的设备
    private static int MAX_NUM = 3;
    private List<Usb> usbList = new ArrayList<>();

    // 插入设备
    public void useUsb(Usb usb) {
        if (usbList.size() == Computer.MAX_NUM) {
            System.out.println("设备已满");
        } else {
            Boolean connect = usb.connect();
            if (!connect) {
                System.out.println("连接失败");
            } else {
                usbList.add(usb);
            }
        }
    }

    // 读取设备内容
    public void readStore() {
        if (usbList.size() == 0) {
            System.out.println("无设备");
        } else {
            for (Usb usb: usbList) {
                String data = usb.read();
                System.out.println(data);
            }
        }
    }
}
