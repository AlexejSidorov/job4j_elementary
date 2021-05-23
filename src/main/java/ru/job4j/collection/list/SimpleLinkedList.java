package ru.job4j.collection.list;

import java.util.*;

public class SimpleLinkedList<T> implements List<T> {

    private int size = 0;
    private int modCount = 0;

    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T value) {
        if (size == 0) {
            first = new Node<T>(null, value, null);
            last = first;
        } else if (size == 1) {
            last = new Node<T>(first, value, null);
            first.next = last;
        } else {
            Node node = new Node(last, value, null);
            last.next = node;
            last = node;
        }
        size++;
        modCount++;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        Node node;
        if (index < size / 2) {
            node = first;
            for (; index > 1; index--) {
                node = node.next;
            }
        } else {
            node = last;
            for (; index < size - 1; index++) {
                node = node.prev;
            }
        }
        return (T) node.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr<>();
    }

    public int getSize() {
        return size;
    }

    private class Itr<T> implements Iterator<T> {

        private int count = 0;
        private int expectedModCount = 0;
        private Node node = first;

        private Itr() {
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
            if (count > 0) {
                node = node.next;
            }
            count++;
            return (T) node.item;
        }
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
