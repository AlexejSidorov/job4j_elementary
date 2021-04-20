package ru.job4j.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {

    private int size;
    private T[] data;
    private int index = 0;

    public SimpleArray(int size) {
        this.size = size;
        data = (T[]) new Object[size];
    }

    public void add(T model) {
        Objects.checkIndex(index, size);
        data[index] = model;
        index++;
    }

    public void set(int index, T model) {
        Objects.checkIndex(index, this.index);
        data[index] = model;
    }

    public void remove(int index) {
        Objects.checkIndex(index, this.index);
        int srcPos = index + 1;
        int length = data.length - index - 1;
        System.arraycopy(data, srcPos, data, index, length);
        this.index--;
    }

    public T get(int index) {
        Objects.checkIndex(index, this.index);
        return data[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[position++];
        }
    }
}
