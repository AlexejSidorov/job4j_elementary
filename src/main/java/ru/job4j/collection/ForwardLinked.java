package ru.job4j.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardLinked<T> implements Iterable<T> {
    private Node<T> head;

    public void add(T value) {
        Node<T> node = new Node<T>(value, null);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public boolean revert() {
        if (head == null || head.next == null) {
            return false;
        }
        Node<T> nodePrev = null;
        Node<T> node = head;
        Node<T> nodeNext = head.next;
        while (nodeNext != null) {
            node.next = nodePrev;
            nodePrev = node;
            node = nodeNext;
            nodeNext = node.next;
        }
        node.next = nodePrev;
        head = node;
        return true;
    }

    public void addFirst(T value) {
        Node<T> firstNode = head;
        Node<T> node = new Node<>(value, firstNode);
        head = node;
    }

    public T deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T obj = head.value;
        head = head.next;
        return obj;
    }

    public T deleteLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            return deleteFirst();
        }
        Node<T> node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        T obj = node.next.value;
        node.next = null;
        return obj;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = node.value;
                node = node.next;
                return value;
            }
        };
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}