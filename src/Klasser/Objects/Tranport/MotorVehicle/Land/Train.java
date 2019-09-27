package Klasser.Objects.Tranport.MotorVehicle.Land;

import Klasser.Interface.Printable;
import Klasser.Interface.Wheeled;
import Klasser.Objects.Tranport.Vehicle;

public class Train extends Vehicle implements Printable, Wheeled {
    private int totalCarriages, totalWheels;

    public int getTotalCarriages() {
        return totalCarriages;
    }

    public void ConnectCarriage() {

    }

    @Override
    public void printMe() {
        System.out.println("Train weight: " + getWeight());
        System.out.println("Train speed: " + getSpeed());
        System.out.println("Train total carriages: " + getTotalCarriages());
    }

    public Train() { }
    public Train(int speed, int weight, int totalCarriages, int totalWheels) {
        super(speed, weight);
        this.totalCarriages = totalCarriages;
        this.totalWheels = totalWheels;
    }

    @Override
    public int getWheelNumber() {
        return totalWheels;
    }
}
