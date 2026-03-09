package noe.zooregister.repository;

import noe.zooregister.models.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class ZooDummyRepository implements ZooRepository{
    private ArrayList<Zoo> zoos = new ArrayList<>();
    private Animal mascot;

    public ZooDummyRepository(){
        Zoo kristiansand = new Zoo("kristiansand");
        Chimp julius = new Chimp("julius", LocalDate.of(1979,12,26),80);
        HoneyBadger nils = new HoneyBadger("nils", LocalDate.now());
        Panda po = new Panda("po", LocalDate.now(), "black");
        kristiansand.addAnimal(julius);
        kristiansand.addAnimal(po);
        kristiansand.addAnimal(nils);

        Zoo noahsArk = new Zoo("noahs ark");
        noahsArk.addAnimal(new Chimp("monke", LocalDate.now(), 60));

        zoos.add(kristiansand);
        zoos.add(noahsArk);
        mascot = julius;
    }

    @Override public ArrayList<Zoo> getAllZoos() {
        return new ArrayList<>(zoos);
    }

    @Override public Animal getMascot() {
        return mascot;
    }
}
