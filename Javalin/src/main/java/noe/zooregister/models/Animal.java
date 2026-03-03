package noe.zooregister.models;

import java.time.LocalDate;

public class Animal {
    private final int id;
    private String species;
    private String name;
    private LocalDate birthDate;
    private static int numAnimals = 0;

    public Animal(String name, LocalDate birthDate) {
        setName(name);
        setBirthDate(birthDate);
        numAnimals++;
        id = 1000+numAnimals;
    }

    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getId() {return id;}
    public LocalDate getBirthDate() {return birthDate;}
    public void setBirthDate(LocalDate birthDate) {this.birthDate = birthDate;}
}
