package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1To4Then4() {
        Max max = new Max();
        int result = max.max(2, 1, 4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To5To3To2Then5() {
        Max max = new Max();
        int result = max.max(1, 5, 3, 2);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}
