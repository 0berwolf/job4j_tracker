package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a", "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            int result = Integer.compare(right.length(), left.length());
            System.out.println("сравнение строк - " + right.length() + " : " + left.length() + " соответствует " + result);
            return result;
        };
        strings.sort(comparator);
    }
}


