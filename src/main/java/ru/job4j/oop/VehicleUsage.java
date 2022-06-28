package ru.job4j.oop;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle plan = new Plan();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[] {plan, train, bus};
        for (Vehicle v: vehicles) {
            v.move();
        }
    }
}
