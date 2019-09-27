package Klasser.Objects.Animals.Mammal;

import Klasser.Objects.Animals.Animal;

public class Mammal extends Animal {
    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public void Sound() {
        System.out.println(getName() + " is a mammal that makes mammal sounds");
    }
    public void Sound(String sound) {
        System.out.println(getName() + " is a "+ getClass().getSimpleName() +" that makes these sounds: " + sound);
    }

    public Mammal() { }
    public Mammal(String name, int legs) {
        super(name);
        this.legs = legs;
    }
}
