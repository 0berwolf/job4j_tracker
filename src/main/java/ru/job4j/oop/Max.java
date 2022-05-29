package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public int max(int left, int right, int up) {
        return max(left, max(right, up));
    }

    public int max(int left, int right, int up, int down) {
        return max(left, max(right, up, down));
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2);
        System.out.println((rsl));
    }
}
