package a10_集合;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList implements Collection {
    private Object[] arr;

    MyArrayList() {
        super();
        arr = new Object[0];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        if (arr.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        int len = arr.length;
        Object[] newArr = new Object[len + 1];
        for(int i = 0; i < len; i ++) {
            newArr[i] = arr[i];
        }
        newArr[len] = o;
        arr = newArr;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
