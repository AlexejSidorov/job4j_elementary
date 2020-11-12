package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOf3() {
        int[] input = new int[] {0, -8, 10};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-8, 0, 10};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOf5() {
        int[] input = new int[] {98, 97, 96, 95, 94};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {94, 95, 96, 97, 98};
        assertThat(result, is(expect));
    }
}