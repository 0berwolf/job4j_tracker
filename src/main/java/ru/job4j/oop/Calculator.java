package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y, int a) {
        return sum(y) + minus(y) + multiply(a) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int result1 = minus(10);
        System.out.println(result1);
        int rsl1 = calculator.divide(10);
        System.out.println(rsl1);
        int sumAll = calculator.sumAllOperation(10, 5);
        System.out.println(sumAll);
    }
}
