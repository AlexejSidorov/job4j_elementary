package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax9To9Then9() {
        int result = Max.max(9, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax5To6To7() {
        int result = Max.max(5, 6, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax5To0To34To5() {
        int result = Max.max(5, 0, 34, 5);
        assertThat(result, is(34));
    }

    @Test
    public void whenMax0To0To0To0() {
        int result = Max.max(0, 0, 0, 0);
        assertThat(result, is(0));
    }
}