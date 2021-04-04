package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SearchAttTest {

    @Test
    public void filterSize() {
        List<Attachment> list = Arrays.asList(
                new Attachment("Tubag", 92),
                new Attachment("Bugur", 116),
                new Attachment("Toplitus", 50)
        );
        List<Attachment> filteredList = SearchAtt.filterSize(list);
        Assert.assertEquals(116, filteredList.get(0).getSize());
    }

    @Test
    public void filterName() {
        List<Attachment> list = Arrays.asList(
                new Attachment("Tubag", 92),
                new Attachment("Gubugur", 116),
                new Attachment("Toplitus", 50)
        );
        List<Attachment> filteredList = SearchAtt.filterName(list);
        Assert.assertEquals("Gubugur", filteredList.get(0).getName());
    }
}