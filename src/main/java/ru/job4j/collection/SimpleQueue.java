package ru.job4j.collection;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();

    private int count = 0;
    private boolean isPushLastOp = true;

    public T poll() {
        T objIn = null;
        if (isPushLastOp) {
            for (int i = 0; i < count; i++) {
                objIn = in.pop();
                out.push(objIn);
            }
        }
        isPushLastOp = false;
        out.pop();
        count--;
        return objIn;
    }

    public void push(T value) {
        if (!isPushLastOp) {
            for (int i = 0; i < count; i++) {
                T objOut = out.pop();
                in.push(objOut);
            }
        }
        isPushLastOp = true;
        in.push(value);
        count++;
    }
}