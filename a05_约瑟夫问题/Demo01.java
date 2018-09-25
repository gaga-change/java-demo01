package a05_约瑟夫问题;

/**
 *  1~n 形成循环单链表
 */
public class Demo01 {
    public static void main(String[] args) {
        Point a = new Point("a");
        Point b = new Point("b");
        Point c = new Point("c");
        Point d = new Point("d");
        Point e = new Point("e");
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(a);

        int temp = 3;
        Point start = a;
        Point now = start;
        Point last = null;
        int i = 0;
        do {
            i ++;
            // 数到 temp 数的，出局。下一个节点从1开始数
            if (i == temp) {
                System.out.println(now.getName());
                if (last == null) {
                    break;
                }
                last.setNext(now.getNext()); // 出局
                i = 0;
                last = null;
            } else {
                last = now;
            }
            now = now.getNext();
        } while(now.getNext() != now);
    }
}
