import Klasser.Interface.Printable;
import Klasser.Interface.Wheeled;
import Klasser.Objects.Tranport.Bike;
import Klasser.Objects.Tranport.MotorVehicle.Land.Car;
import Klasser.Objects.Tranport.MotorVehicle.Land.Train;
import Klasser.Objects.Tranport.MotorVehicle.Water.Boat;
import Klasser.Objects.Tranport.Vehicle;

public class Uppgift_2a_b {
    public static void printVehicle(Vehicle vehicle) {
        vehicle.printMe();
    }

    public static void printViaInterface(Printable whatever) {
        whatever.printMe();
    }

    public static void main(String[] args) {
        Car car = new Car(100, 25, "AAA000", "1999", "ABC", 8, 4);
        Bike bike = new Bike(50, 10, 10, 2);
        Boat boat = new Boat(80, 30, 250);
        Train train = new Train(250, 75, 5, 20);

        printVehicle(car);
        printVehicle(bike);
        printVehicle(boat);
        printVehicle(train);
        System.out.println("\n");
        printViaInterface(car);
        printViaInterface(bike);
        printViaInterface(boat);
        printViaInterface(train);

        Wheeled wCar = car;
        Wheeled wBike = bike;
        Wheeled wTrain = train;

        System.out.println("Car number of wheels: " + wCar.getWheelNumber());
        System.out.println("Bike number of wheels: " + wBike.getWheelNumber());
        System.out.println("Train number of wheels: " + wTrain.getWheelNumber());
    }
}
