package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas80Then2() {
        int[] input = {10, 100, 80, -9};
        int value = 80;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6ThenNeg1() {
        int[] input = {0, 8, 7, 10, 96};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind0() {
        int[] input = new int[]{0, 2, 89, 6};
        int value = 0;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNoFind() {
        int[] input = new int[]{6, 5, 48, 20, 36};
        int value = 5;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}