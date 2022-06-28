package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(nameClass() + " движется по рельсам (некоторые модели могут достигать скорости свыше 400 км/ч)");
    }

    @Override
    public String nameClass() {
        return "Поезд";
    }
}
