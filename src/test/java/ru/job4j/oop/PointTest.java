package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to32then3dot16() {
        Point a = new Point(1, 3);
        Point b = new Point(4, 2);
        double out = a.distance(b);
        double expected = 3.16;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to35then3dot61() {
        Point a = new Point(2, 3);
        Point b = new Point(5, 5);
        double out = a.distance(b);
        double expected = 3.61;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when58to69then4dot24() {
        Point a = new Point(5, 6);
        Point b = new Point(8, 9);
        double out = a.distance(b);
        double expected = 4.24;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to12to13then2dot45() {
        Point e = new Point(0, 1, 1);
        Point f = new Point(1, 2, 3);
        double out = e.distance3d(f);
        double expected = 2.45;
        Assert.assertEquals(expected, out, 0.01);
    }
}