package Klasser.Objects.Tranport.MotorVehicle.Land;

import Klasser.Interface.Printable;
import Klasser.Interface.Wheeled;
import Klasser.Objects.Humans.Carowner;
import Klasser.Objects.Tranport.Vehicle;

public class Car extends Vehicle implements Printable, Wheeled {
    private String regNum, model, mark;
    private Carowner owner;
    private int totalGears, currentGear, totalWheels;

    public String getRegNum() {
        return regNum;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Carowner getOwner() {
        return owner;
    }

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

    public void changeOwner(Carowner owner) {
        this.owner = owner;
    }

    public Car() {}
    public Car(int speed, int weight, String regNum, String model, String mark, int totalGears, int totalWheels) {
        super(speed, weight);
        this.regNum = regNum;
        this.model = model;
        this.mark = mark;
        this.totalGears = totalGears;
        this.currentGear = 0;
        this.totalWheels = totalWheels;
    }
    public Car(String regNum, String model, String mark, int totalGears) {
        this.regNum = regNum;
        this.model = model;
        this.mark = mark;
        this.totalGears = totalGears;
        this.currentGear = 0;
    }

    @Override
    public void printMe() {
        System.out.println("Car weight: " + getWeight());
        System.out.println("Car speed: " + getSpeed());
        System.out.println("Car regNum: " + getRegNum());
        System.out.println("Car mark: " + getMark());
        System.out.println("Car model: " + getModel());
        System.out.println("Car owner: " + getOwner());
        System.out.println("Car total gears: " + getTotalGears());
        System.out.println("Car current gear: " + getCurrentGear());
    }

    @Override
    public int getWheelNumber() {
        return totalWheels;
    }
}
