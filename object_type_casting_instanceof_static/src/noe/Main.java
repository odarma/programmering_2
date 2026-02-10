package noe;
import noe.moduls.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ola", "Nordmann", 20);
        Person person2 = new Person("Ola-E", "Ørebæk", 28);
        Carpenter carpenter = new Carpenter("Rudolf", "Arnesen", 45, 3);
        CarpenterApprentice apprentice = new CarpenterApprentice("Jon", "Då", 19, 0,
                LocalDate.now(), LocalDate.of(2028, 10, 10));

        person1.compareAgeTo(person2);
        person1.compareAgeTo(carpenter);
        person1.compareAgeTo(apprentice);


        System.out.println("\n--- List of Persons ---");

        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(carpenter);
        listOfPersons.add(apprentice);
        listOfPersons.add(new BussDriver("buzz","driver", 40, "630 - moss-halden"));

        for (Person currentPerson : listOfPersons) { //refaktorisering fra if-else til switch-case
            switch (currentPerson) {
                case BussDriver bussDriver ->
                        System.out.println("\n" + currentPerson.getFirstName() + "is a buss driver" + bussDriver.getRoute());
                case CarpenterApprentice carpenterApprentice ->
                        System.out.println("\n" + currentPerson.getFirstName() + "is a carpenter apprentice with training period from "
                                + carpenterApprentice.getTrainingStartDate() + " to " + carpenterApprentice.getTrainingEndDate());
                case Carpenter carpenter1 -> System.out.println("\n" + currentPerson.getFirstName() + "is a carpenter");
                default -> System.out.println("\n" + currentPerson.getFirstName() + " is a person");
            }
        }

    }
}
