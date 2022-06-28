package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Station");
    }

    @Override
    public void passengers(int countPassengers) {
            if (countPassengers == 0) {
                System.out.println("Ожидать пассажиров.");
            } else {
                System.out.println("Продолжать движение.");
            }
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
