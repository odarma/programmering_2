package json;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import json.models.*;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Batman", "Bruce Wayne", LocalDate.of(1939,3,30));
        SuperHero wolverine = new SuperHero("Wolverine", "Logan",LocalDate.of(1974,9,1));
        SuperHero wonderWoman = new SuperHero("Wonder Woman", "Diana Prince",LocalDate.of(1941,10,21));

        ArrayList<SuperHero> batmanSideKicks = new ArrayList<>();
        batmanSideKicks.add(new SuperHero("Robin","Jason Todd"));
        batmanSideKicks.add(new SuperHero("Batgirl","Barbara Gordon"));
        batman.setSidekicks(batmanSideKicks);

        ArrayList<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(batman);
        superHeroes.add(wolverine);
        superHeroes.add(wonderWoman);

        File jsonFile = new File("superheroes.json");
        writeJSONFile(superHeroes,jsonFile);
        ArrayList<SuperHero> readJSON = readJSONFile(jsonFile);
        assert readJSON != null;
        for (SuperHero sh:readJSON) {
            System.out.println(sh);
            for(SuperHero sk: sh.getSidekicks()){
                System.out.println(sh.getName()+"'s sidekick: "+sk);
            }
        }
    }

    public static ArrayList<SuperHero> readJSONFile (File f){
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        try{
            SuperHero[] reading = om.readValue(f,SuperHero[].class);
            return new ArrayList<>(Arrays.asList(reading));
        }catch (IOException e) {
            System.err.println("could not read superheroes from JSON file: "+e.getMessage());
        }
        return null;
    }

    public static void writeJSONFile(ArrayList<SuperHero> superHeroArrayList,File f){
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());
        try {
            om.writerWithDefaultPrettyPrinter().writeValue(f,superHeroArrayList);
        } catch (IOException e) {
            System.err.println("could not write superheroes to JSON file: "+e.getMessage());
        }
    }
}
