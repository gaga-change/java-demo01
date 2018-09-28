package a08_接口;

public interface Usb {
    int a = 1;

    /**
     * 连接
     */
    public Boolean connect();

    /**
     * 读取
     */
    public String read();
}
