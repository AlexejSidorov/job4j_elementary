package ru.job4j.collection;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {

    private int size = 0;
    private int modCount = 0;
    private T[] container;

    public SimpleArray() {
        container = (T[]) new Object[100];
    }

    public T get(int index) {
        int pos = Objects.checkIndex(index, size);
        return container[pos];
    }

    public void add(T model) {
        if (size == container.length - 1) {
            int newCapacity = (int) (size * 1.1);
            T[] newContainer = (T[]) new Object[newCapacity];
            System.arraycopy(container, 0, newContainer, 0, size);
            container = newContainer;
        }
        modCount++;
        container[size++] = model;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<T> {

        private int count;
        private int expectedModCount;

        Itr() {
            expectedModCount = modCount;
        }

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return container[count++];
        }
    }
}