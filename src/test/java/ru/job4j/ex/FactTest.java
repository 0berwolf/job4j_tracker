package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMines1() {
        new Fact().calc(-1);
    }

    @Test
    public void when4then24() {
        int rsl = new Fact().calc(4);
        assertThat(rsl, is(24));
    }
}