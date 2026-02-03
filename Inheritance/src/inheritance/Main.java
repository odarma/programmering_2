package inheritance;
import inheritance.models.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person ola = new Person("Ola", "Nordman", 20);
        System.out.printf("Person: %s %s", ola.getFirstName(), ola.getLastName());

        Carpenter rudolf = new Carpenter("Rudolf", "Reinsdyr", 45, 3);
        System.out.printf("\nCarpenter: %s %s %d years old, %d houses built", rudolf.getFirstName(), rudolf.getLastName(), rudolf.getAge(), rudolf.getNumberOfHousesBuilt());

        BussDriver bjarne = new BussDriver("Bjarne", "Jarne", 50, "630 Moss-Halden");
        System.out.printf("\nBuss Driver: %s %s %d years old has route %s", bjarne.getFirstName(), bjarne.getLastName(), bjarne.getAge(), bjarne.getRoute());

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2027, 6, 15);

        CarpenterApprentice jon = new CarpenterApprentice("Jon", "Då", 21, 0, startDate, endDate);
        System.out.println("Carpenter apprentice: " + jon.getFirstName() + " " +
                jon.getLastName());
        System.out.println("Carpenter apprentice num houses built: " + jon.getNumberOfHousesBuilt());
        System.out.println("Carpenter apprentice training period: " +
                jon.getTrainingStartDate() + " - " + jon.getTrainingEndDate());

        System.out.println("\n--- toString() results---");
        System.out.println("-Person object-");
        System.out.println(ola); // Gir det akkurat samme som System.out.println(ola.toString());

        System.out.println("\n-Carpenter object-");
        System.out.println(rudolf);

        System.out.println("\n-BusDriver object-");
        System.out.println(bjarne);

        System.out.println("\n-CarpenterApprentice object-");
        System.out.println(jon);
    }
}
