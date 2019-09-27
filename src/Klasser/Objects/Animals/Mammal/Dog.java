package Klasser.Objects.Animals.Mammal;

public class Dog extends Mammal {


    public void Sound() {
        super.Sound("\"Bark! Bark!\"");
    }

    public Dog() {
    }
    public Dog(String name, int legs) {
        super(name, legs);
    }
}
