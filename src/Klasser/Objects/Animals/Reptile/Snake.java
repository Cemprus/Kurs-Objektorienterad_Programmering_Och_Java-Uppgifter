package Klasser.Objects.Animals.Reptile;

public class Snake extends Reptile {


    public void Sound() {
        System.out.println("Snakes make these sounds: \"Ssss! Ssss!\"");
    }

    public Snake() {    }
    public Snake(String name, int tailLentgh) {
        super(name, tailLentgh);
    }
}
