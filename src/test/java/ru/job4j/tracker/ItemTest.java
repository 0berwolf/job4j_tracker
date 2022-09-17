package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    @Test
    void directSorting() {
        List<Item> items = Arrays.asList(
                new Item("Volkswagen", 1),
                new Item("Renault", 2),
                new Item("Mercedes", 3)
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Mercedes", 3),
                new Item("Renault", 2),
                new Item("Volkswagen", 1)
        );
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void reverseSorting() {
        List<Item> items = Arrays.asList(
                new Item("Volkswagen", 1),
                new Item("Mercedes", 3),
                new Item("Renault", 2)

        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Volkswagen", 1),
                new Item("Renault", 2),
                new Item("Mercedes", 3)
        );
        assertThat(items).isEqualTo(expected);
    }
}