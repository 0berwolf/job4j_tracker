package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                rsl[count++] = item;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) > -1) {
            items[indexOf(id)].setName(item.getName());
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id) {
        Item[] rsl = new Item[size];
        for (int index = 0; index < size; index++) {
            System.arraycopy(rsl, index + 1, rsl, index, size - index - 1);
            if (indexOf(id) != -1) {
                items[size - 1] = null;
                size--;
            } else {
                return false;
            }
        }
        return true;
    }
}