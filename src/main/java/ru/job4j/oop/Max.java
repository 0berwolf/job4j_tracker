package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public int max(int left, int right, int up) {
        int tmp = max(right, up);
        return left >= tmp ? left : tmp;
    }

    public int max(int left, int right, int up, int down) {
        int tmp = max(right, up, down);
        return left >= tmp ? left : tmp;
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2);
        System.out.println((rsl));
    }
}
