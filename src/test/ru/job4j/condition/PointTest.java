package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        int expected = 0;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to00then5() {
        int expected = 5;
        int x1 = 5;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX5Y0Z0ToX0Y0Z0Then5() {
        double expected = 5;
        int x1 = 5;
        int y1 = 0;
        int z1 = 0;
        int x2 = 0;
        int y2 = 0;
        int z2 = 0;
        double out = new Point(x1, y1, z1).distance3D(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX0Y0Z0ToX0Y0Z0Then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 0;
        int y2 = 0;
        int z2 = 0;
        double out = new Point(x1, y1, z1).distance3D(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10Y10Z10ToX100Y100Z100Then155p88() {
        double expected = 155.88;
        int x1 = 10;
        int y1 = 10;
        int z1 = 10;
        int x2 = 100;
        int y2 = 100;
        int z2 = 100;
        double out = new Point(x1, y1, z1).distance3D(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}