package noe.zooregister.models;

import java.time.LocalDate;

public class Panda extends Animal{
    private String kungFuBelt;

    public Panda(String name, LocalDate birthDate, String kungFuBelt) {
        super(name, birthDate);
        setSpecies("Panda");
        this.setKungFuBelt(kungFuBelt);
    }

    public String getKungFuBelt() {return kungFuBelt;}
    public void setKungFuBelt(String kungFuBelt) {this.kungFuBelt = kungFuBelt;}
}
