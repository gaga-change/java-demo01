package a10_集合;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * linkedList 测试
 *
 * 底层是链表（堆栈：先进后出）
 */
public class Demo03 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1); // 添加到末尾
        linkedList.add(2);
        linkedList.add(3);

        linkedList.push(4); // 添加在开头
        linkedList.push(5);
        linkedList.push(6);

        // 删除开头
        System.out.println(linkedList.pop()); // 6
        System.out.println(linkedList.poll()); // 5
        System.out.println(Arrays.toString(linkedList.toArray()));
        ListIterator listIterator = linkedList.listIterator(0);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
    }
}
