package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void when3then6() {
        new Fact().calc(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMines1() {
        int rsl = new Fact().calc(4);
        assertThat(rsl, is(4));
    }
}