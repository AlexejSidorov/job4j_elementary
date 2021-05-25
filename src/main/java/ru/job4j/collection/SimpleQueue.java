package ru.job4j.collection;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();

    private int count = 0;
    private boolean isPushLastOp = true;

    public T poll() {
        if (isPushLastOp) {
          reFillStack(in, out);
        }
        isPushLastOp = false;
        count--;
        return out.pop();
    }

    public void push(T value) {
        if (!isPushLastOp) {
         reFillStack(out, in);
        }
        isPushLastOp = true;
        in.push(value);
        count++;
    }

    private void reFillStack(SimpleStack<T> first, SimpleStack<T> second) {
        for (int i = 0; i < count; i++) {
            T objOut = first.pop();
            second.push(objOut);
        }
    }
}