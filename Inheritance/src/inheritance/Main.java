package inheritance;
import inheritance.models.*;

public class Main {
    public static void main(String[] args) {
        Person ola = new Person("Ola", "Nordman", 20);
        System.out.printf("Person: %s %s", ola.getFirstName(), ola.getLastName());

        Carpenter rudolf = new Carpenter("Rudolf", "Reinsdyr", 45, 3);
        System.out.printf("\nCarpenter: %s %s %d years old, %d houses built", rudolf.getFirstName(), rudolf.getLastName(), rudolf.getAge(), rudolf.getNumberOfHousesBuilt());

        BussDriver bjarne = new BussDriver("Bjarne","Jarne", 50, "630 Moss-Halden");
        System.out.printf("\nBuss Driver: %s %s %d years old has route %s", bjarne.getFirstName(),bjarne.getLastName(), bjarne.getAge(),bjarne.getRoute());
        /*
        ola.printDescription();
        rudolf.printDescription();
        bjarne.printDescription();
         */

        System.out.print(ola);
    }
}
