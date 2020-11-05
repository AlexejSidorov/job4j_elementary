package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80d5() {
        short in = 170;
        double expect = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void whenWoman176Then75d9() {
        short in = 176;
        double expected = 75.9;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman190Then92() {
        short in = 190;
        double expected = 92;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}