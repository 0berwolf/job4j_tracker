package ru.job4j.poly;

public interface Transport {
    String go();

    int passengers(int countPassengers);

    int refueling(int countFuel, int cost);
}
