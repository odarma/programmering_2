package noe.zooregister.models;

import java.time.LocalDate;

public class Chimp extends Animal{
    private int iq;

    public Chimp(String name, LocalDate birthDate,int iq){
        super(name,birthDate);
        setIq(iq);
        setSpecies("Chimp");
    }

    public int getIq() {return iq;}
    public void setIq(int iq) {this.iq = iq;}
}
