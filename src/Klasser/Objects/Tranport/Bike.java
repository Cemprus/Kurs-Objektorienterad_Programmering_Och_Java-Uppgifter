package Klasser.Objects.Tranport;

import Klasser.Interface.Printable;
import Klasser.Interface.Wheeled;

public class Bike extends Vehicle implements Printable, Wheeled {
    private int totalGears, currentGear, totalWheels;

    public int getTotalGears() {
        return totalGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeGear(int newGear) {
        if (newGear < totalGears || newGear > totalGears) {
            throw new IllegalArgumentException("NewGear cannot exceed TotalGears!");
        } else {
            this.currentGear = newGear;
        }
    }

    @Override
    public void printMe() {
        System.out.println("Bike weight: " + getWeight());
        System.out.println("Bike speed: " + getSpeed());
        System.out.println("Bike total gears: " + getTotalGears());
        System.out.println("Bike current gear: " + getCurrentGear());
    }

    public Bike() { }
    public Bike(int speed, int weight, int totalGears, int totalWheels) {
        super(speed, weight);
        this.totalGears = totalGears;
        this.currentGear = 0;
        this.totalWheels = totalWheels;
    }

    @Override
    public int getWheelNumber() {
        return totalWheels;
    }
}
