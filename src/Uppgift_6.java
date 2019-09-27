import Klasser.Objects.Animals.Animal;
import Klasser.Objects.Animals.Mammal.Dog;
import Klasser.Objects.Animals.Reptile.Snake;

public class Uppgift_6 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Snake("Liz", 5);
        animals[1] = new Dog("Rex", 4);
        animals[2] = new Snake("Slisser", 10);
        animals[3] = new Dog("Rex", 4);

        printAnimals(animals);
    }

    public static void printAnimals(Animal[] animals) {
        for (Animal a : animals) {
            a.Sound();
        }
    }
}
