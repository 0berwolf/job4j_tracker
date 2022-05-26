package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int q) {
        return q - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int y, int a, int q, int b) {
        return sum(y) + minus(q) + multiply(a) + divide(b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int result1 = minus(12);
        System.out.println(result1);
        int rsl1 = calculator.divide(15);
        System.out.println(rsl1);
        int sumAll = calculator.sumAllOperation(10, 5, 12, 15);
        System.out.println(sumAll);
    }
}
