package ru.job4j.collection;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();

    private int count = 0;

    public T poll() {
        T objIn = null;
        for (int i = 0; i < count; i++) {
            objIn = in.pop();
            out.push(objIn);
        }
        out.pop();
        for (int i = 0; i < count - 1; i++) {
            T objOut = out.pop();
            in.push(objOut);
        }
        count--;
        return objIn;
    }

    public void push(T value) {
        in.push(value);
        count++;
    }
}