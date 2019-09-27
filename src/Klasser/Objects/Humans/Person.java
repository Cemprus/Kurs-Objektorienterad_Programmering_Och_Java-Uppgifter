package Klasser.Objects.Humans;

public abstract class Person {
    private String Name, Adress, personnummer;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        this.Adress = adress;
    }

    public void setPersonnummer(String personnummer) { this.personnummer = personnummer; }

    public String getPersonnummer() { return personnummer; }

    public void creatingSet(String name, String adress, String personnummer) {
        setName(name);
        setAdress(adress);
        setPersonnummer(personnummer);
    }
}
