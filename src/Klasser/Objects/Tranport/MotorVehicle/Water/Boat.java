package Klasser.Objects.Tranport.MotorVehicle.Water;

import Klasser.Interface.Printable;
import Klasser.Objects.Tranport.Vehicle;

public class Boat extends Vehicle implements Printable {
    private int deadWeight;

    public int getDeadWeight() {
        return deadWeight;
    }

    public void Turn() {

    }

    @Override
    public void printMe() {
        System.out.println("Boat weight: " + getWeight());
        System.out.println("Boat speed: " + getSpeed());
        System.out.println("Boat dead weight: " + getDeadWeight());
    }

    public Boat() { }
    public Boat(int speed, int weight, int deadWeight) {
        super(speed, weight);
        this.deadWeight = deadWeight;
    }
}
