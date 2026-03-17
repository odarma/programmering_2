package noe.repository;

import java.time.LocalDate;
import java.util.ArrayList;

import noe.model.Animal;
import noe.model.Chimp;
import noe.model.HoneyBadger;
import noe.model.Panda;
import noe.model.Zoo;

public class ZooDummyRepository implements ZooRepository {
    private ArrayList<Zoo> zoos = new ArrayList<>();
    private Animal mascot;

    public ZooDummyRepository() {
        Zoo kristiansand = new Zoo("Kristiansand");

        Chimp julius = new Chimp("Julius",
                LocalDate.of(1979, 12, 26),
                80);
        HoneyBadger nils = new HoneyBadger("Nils", LocalDate.now());
        Panda po = new Panda("Po", LocalDate.now(), "Black");

        kristiansand.addAnimal(julius);
        kristiansand.addAnimal(nils);
        kristiansand.addAnimal(po);

        Zoo noahsArk = new Zoo("Noahs Ark");
        noahsArk.addAnimal(new Chimp("Monke", LocalDate.now(), 60));

        zoos.add(kristiansand);
        zoos.add(noahsArk);

        mascot = julius;
    }

    @Override public Zoo getZooByName(String zooName) {
        for (Zoo currentZoo : zoos) {
            if (currentZoo.getName().equalsIgnoreCase(zooName)) {
                return currentZoo;
            }
        }
        return null;
    }

    @Override public Animal getMascot() {
        return mascot;
    }
    @Override public ArrayList<Zoo> getAllZoos() {
        return new ArrayList<>(zoos);
    }

    @Override public void addZoo(Zoo newZoo) {
        zoos.add(newZoo);
    }
}
