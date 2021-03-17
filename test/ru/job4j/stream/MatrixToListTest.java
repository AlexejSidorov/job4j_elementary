package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void whenArrayToList() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expectList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actualList = new MatrixToList().toList(matrix);
        Assert.assertEquals(expectList, actualList);
    }
}