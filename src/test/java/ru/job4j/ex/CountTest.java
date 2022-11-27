package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CountTest {

    @Test
    public void when0to2then3() {
       int rsl = Count.add(0, 3);
       assertThat(rsl, is(3));
    }
}