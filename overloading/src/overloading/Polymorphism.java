package overloading;
import overloading.models.Carpenter;
import overloading.models.CarpenterApprentice;
import overloading.models.Person;
import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        Person person1 = new Person("ola", "nordmann", 20);
        Person person2 = new Person("ola-e", "ørebæk", 28);
        person1.compareAgeTo(person2);

        Carpenter carpenter = new Carpenter("rudolf","arnesen",45, 3);
        person1.compareAgeTo(carpenter);

        CarpenterApprentice apprentice = new CarpenterApprentice("jon", "då", 20);
        person1.compareAgeTo(apprentice);

        System.out.println("\n---list of persons---");
        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(carpenter);
        listOfPersons.add(apprentice);

        for(Person person:listOfPersons){
            System.out.println(person);
            //person.compareAgeTo();
        }
    }
}
