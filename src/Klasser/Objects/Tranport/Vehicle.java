package Klasser.Objects.Tranport;

import Klasser.Interface.Printable;

public abstract class Vehicle implements Printable {
    int speed, weight;

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public void changeSpeed(int speed) {
        this.speed = speed;
    }
    public Vehicle() {}
    public Vehicle(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }
}
