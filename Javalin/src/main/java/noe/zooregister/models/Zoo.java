package noe.zooregister.models;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) {animals.add(animal);}
    public ArrayList<Animal> getAnimals() {return new ArrayList<>(animals);}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
