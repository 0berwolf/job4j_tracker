package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] splitLeft = left.split("\\. ");
        String[] splitRight = right.split("\\. ");
        int strLeft = Integer.parseInt(splitLeft[0]);
        int strRight = Integer.parseInt(splitRight[0]);
        return Integer.compare(strLeft, strRight);
    }
}
