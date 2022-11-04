package ru.job4j.stream;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private LocalDate created;
    private double volume;
    private String color;

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", created=" + created
                + ", volume=" + volume
                + ", color='" + color + '\''
                + '}';
    }

    public static void main(String[] args) {
        Car carMegan3 = new Builder()
            .buildBrand("Renault")
            .buildModel("Megan 3")
            .buildCreated(LocalDate.of(2010, 11, 18))
            .buildVolume(1.5)
            .buildColor("Black")
            .build();
        System.out.println(carMegan3);
        Car carGolf = new Builder()
            .buildBrand("Volkswagen")
            .buildModel("Golf")
            .buildCreated(LocalDate.of(2016, 3, 15))
            .buildVolume(1.6)
            .buildColor("Metallic Grey")
            .build();
        System.out.println(carGolf);
    }
}
