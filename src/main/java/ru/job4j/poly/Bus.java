package ru.job4j.poly;

public class Bus implements Transport {

    private boolean drive;
    private int passengers;
    private int fuel;

    public Bus(int passengers, int fuel) {
        drive = false;
        this.passengers = passengers;
        this.fuel = fuel;
    }

    public boolean isDrive() {
         return drive;
    }

    @Override
    public void drive() {
        drive = true;
    }

    @Override
    public void passengerCount(int passengers) {
        this.passengers += passengers;
    }

    @Override
    public int refuel(int quantity) {
        fuel += quantity;
        return fuel;
    }
}
