package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator<Integer> {
    private final int[] data;
    private int position = 0;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }

    public boolean hasNext() {
        while (position < data.length) {
            if (data[position] % 2 == 0) {
                return true;
            }
            position++;
        }
        return false;
    }

    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[position++];
    }
}
