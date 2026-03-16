package noe.repository;

import java.util.ArrayList;

import noe.model.Animal;
import noe.model.Zoo;

public interface ZooRepository {

    Animal getMascot();
    ArrayList<Zoo> getAllZoos();
    Zoo getZooByName(String zooName);
    void addZoo(Zoo newZoo);
}
