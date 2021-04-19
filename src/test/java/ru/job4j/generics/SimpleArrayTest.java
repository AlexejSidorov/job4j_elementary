package ru.job4j.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;

public class SimpleArrayTest {

    SimpleArray<Integer> simpleArray;

    @Before
    public void setUp() {
        simpleArray = new SimpleArray<>(5);
        simpleArray.add(4);
        simpleArray.add(5);
        simpleArray.add(6);
        simpleArray.add(7);
    }

    @Test
    public void ifAddElement() {
        simpleArray.add(8);
        Integer actual = simpleArray.get(4);
        Integer expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void ifAddObjectException() {
        simpleArray.add(8);
        simpleArray.add(9);
    }

    @Test
    public void ifRemoveElement() {
        simpleArray.remove(1);
        Integer actual = simpleArray.get(1);
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifSetElement() {
        simpleArray.remove(1);
        simpleArray.set(1, 9);
        Integer actual = simpleArray.get(1);
        Integer expected = 9;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifGetIterator() {
        Iterator<Integer> iterator = simpleArray.iterator();
        Assert.assertSame(4, iterator.next());
        Assert.assertSame(5, iterator.next());
        Assert.assertSame(6, iterator.next());
        Assert.assertSame(7, iterator.next());
    }
}
