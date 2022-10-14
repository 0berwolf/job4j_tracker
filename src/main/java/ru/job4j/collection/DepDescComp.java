package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> one = new ArrayList<>(Arrays.asList(o1.split("/")));
        List<String> two = new ArrayList<>(Arrays.asList(o2.split("/")));
        int result = two.get(0).compareTo(one.get(0));
        return (result == 0) ? o1.compareTo(o2) : result;
    }
}
