package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row = 0;
    private int column = 0;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if (column < data.length && row < data[column].length) {
            return true;
        }
        if (column < data.length && !(row < data[column].length)) {
            column++;
            row = 0;
            return hasNext();
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int num = data[column][row];
        row++;
        return num;
    }
}