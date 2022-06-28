package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(nameClass() + " передвигается по дорогам общего пользования. (могут перевозить от 20 до 140 человек)");
    }

    @Override
    public String nameClass() {
        return "Автобус";
    }
}
