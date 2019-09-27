package Klasser.Objects.Animals.Mammal;

public class Dog extends Mammal {


    public void Sound() {
        System.out.println("Dogs make these sounds: \"Bark! Bark!\"");
    }

    public Dog() {
    }
    public Dog(String name, int legs) {
        super(name, legs);
    }
}
