package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengerCount(int passengers);

    int refuel(int quantity);
}
