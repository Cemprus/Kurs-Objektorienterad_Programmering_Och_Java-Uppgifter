package Klasser.Objects.Animals.Reptile;

import Klasser.Objects.Animals.Animal;

public class Reptile extends Animal {
    private int tailLentgh;

    @Override
    public void Sound() {
        System.out.println(getName() + " is a reptile that makes reptile sounds");
    }
    public void Sound(String sound) {
        System.out.println(getName() + " is a "+ getClass().getSimpleName() +" that makes these sounds: " + sound);
    }

    public int getTailLentgh() {
        return tailLentgh;
    }

    public void setTailLentgh(int tailLentgh) {
        this.tailLentgh = tailLentgh;
    }

    public Reptile() { }
    public Reptile(String name, int tailLentgh) {
        super(name);
        this.tailLentgh = tailLentgh;
    }
}
