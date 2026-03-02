package json.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class SuperHero {

    private String name;
    private String secretIdentity;
    private ArrayList<SuperHero> sidekicks = new ArrayList<>();
    private LocalDate firstAppearance;

    public SuperHero(String name, String secretIdentity) {
        setName(name);
        setSecretIdentity(secretIdentity);
    }

    public SuperHero(String name, String secretIdentity, LocalDate firstAppearance) {
        this(name,secretIdentity);
        this.firstAppearance = firstAppearance;
    }

    public SuperHero(){}

    @Override
    public String toString() {return "Superhero name: " + name + " - Secret identity: " + secretIdentity +" - First appearance: "+getFirstAppearance();}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSecretIdentity() {return secretIdentity;}
    public void setSecretIdentity(String secretIdentity) {this.secretIdentity = secretIdentity;}
    public ArrayList<SuperHero> getSidekicks() {return new ArrayList<>(sidekicks);}
    public void setSidekicks(ArrayList<SuperHero> sidekicks) {this.sidekicks = sidekicks;}
    public LocalDate getFirstAppearance() {return firstAppearance;}
    public void setFirstAppearance(LocalDate firstAppearance) {this.firstAppearance = firstAppearance;}
}
