package Klasser.Objects.Humans;

public class Carowner extends Person{

    public Carowner(){}
    public Carowner(Carowner carOwner) {
        creatingSet(carOwner.getName(),carOwner.getAdress(),carOwner.getPersonnummer());
    }
    public Carowner(String Name, String Adress, String Personnummer) {
        creatingSet(Name, Adress, Personnummer);
    }
}
