package ru.job4j.collection;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();

    private int countIn = 0;
    private int countOut = 0;

    public T poll() {
        if (countOut == 0) {
            countOut = countIn;
            reFillStack(in, out);
        }
        countOut--;
        return out.pop();
    }

    public void push(T value) {
        in.push(value);
        countIn++;
    }

    private void reFillStack(SimpleStack<T> first, SimpleStack<T> second) {
        for (; countIn > 0; countIn--) {
            T obj = first.pop();
            second.push(obj);
        }
    }
}