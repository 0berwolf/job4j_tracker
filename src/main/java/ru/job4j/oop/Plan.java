package ru.job4j.oop;

public class Plan implements Vehicle {
    @Override
    public void move() {
        System.out.println(nameClass() + " летает в небе. (может двигать со скоростью звука)");
    }

    @Override
    public String nameClass() {
        return "Самолёт";
    }
}
