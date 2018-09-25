package a05_约瑟夫问题;

import java.util.Objects;

public class Point {
    private Point prev; // 上一个
    private Point next; // 下一个
    private String name; // 名称

    Point(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(prev, point.prev) &&
                Objects.equals(next, point.next) &&
                Objects.equals(name, point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prev, next, name);
    }

    public Point getPrev() {
        return prev;
    }

    public void setPrev(Point prev) {
        this.prev = prev;
    }

    public Point getNext() {
        return next;
    }

    public void setNext(Point next) {
        this.next = next;
    }
}
