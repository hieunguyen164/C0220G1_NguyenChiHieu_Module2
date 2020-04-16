package b6_cautrucdulieuvagiaithuat.baitap.arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Invalid capacity");
        }
    }

    public void add(int index, E e) {
        checkIndex(index);
        if (elements.length == size) {
            ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = e;
            size++;
        } else {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            size++;
        }
    }



    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }


    public MyArrayList<E> clone(){
        MyArrayList<E> newElements = new MyArrayList<>();
        newElements.elements = Arrays.copyOf(elements,size);
        newElements.size = size;
        return newElements;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (elements.length == size) {
            ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("Invalid minCapacity");
        }
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }
    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(get(i)+"\t");
        }
        System.out.println();
    }


}

