package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String go() {
        return null;
    }

    @Override
    public int passengers(int countPassengers) {
            if (countPassengers == 0) {
                System.out.println("Ожидать пассажиров.");
            } else {
                System.out.println("Продолжать движение.");
            }
        return 0;
        }

    @Override
    public int refueling(int countFuel, int cost) {
        if (countFuel < cost) {
            System.out.println("Ожидаем ещё пассажиров.");
        } else {
            System.out.println("Едем в пункт назначения.");
        }
        return 0;
    }
}
