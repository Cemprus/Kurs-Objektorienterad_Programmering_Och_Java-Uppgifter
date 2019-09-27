import Klasser.Objects.Humans.Carowner;
import Klasser.Objects.Tranport.MotorVehicle.Land.Car;

public class Uppgift_1a_b_c {
    public static void main(String[] args) {
        Car[] c = new Car[4];
        c[0] = new Car("AAA000", "1999","WWW", 4);
        c[1] = new Car("BBB111", "1999","ABC", 8);
        c[2] = new Car("CCC222", "2010","WWW", 4);
        c[3] = new Car("DDD333", "2010","ABC", 8);
        Carowner[] p = new Carowner[3];
        p[0] = new Carowner("David", "Stockholm", "20000101-0101");
        p[1] = new Carowner("Jack", "New York", "20000101-0101");
        p[2] = new Carowner("Ruscemp", "Unknown", "20000101-0101");



        c[0].changeOwner(p[0]);
        c[1].changeOwner(p[0]);
        c[2].changeOwner(p[1]);
        c[3].changeOwner(p[2]);
        c[2].changeOwner(p[1]);
        c[0].changeOwner(p[0]);
        c[1].changeOwner(p[2]);
        c[3].changeOwner(p[1]);
        c[2].changeOwner(p[0]);
        c[0].changeOwner(p[2]);

        for (int i = 0; i < 4; i++) {
            System.out.println("Bilen med reg. nummer: " + c[i].getRegNum() + " av " + c[i].getMark() + " modell: " + c[i].getModel() + " ägs av " + c[i].getOwner().getName());
        }
    }
}
