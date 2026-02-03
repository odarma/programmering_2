package overloading;
import overloading.models.*;

import java.time.LocalDate;

public class Overloading {
    public static void main(String[] args) {
       BussDriver buzzDraiva = new BussDriver(
               "buzz", "draiva", 30, "630 - Halden-Moss");
        System.out.println(buzzDraiva);

        Carpenter carpenter = new Carpenter(
                "car","penter", 60,0);

        CarpenterApprentice carpenterApprentice = new CarpenterApprentice(
                "carappren", "penterrentice", 20
        );
        System.out.println(carpenterApprentice);

        CarpenterApprentice apprentice2 = new CarpenterApprentice(
                "jon","då", 21, 0, LocalDate.now(), LocalDate.of(2027,6,15)
        );
        apprentice2.extendTrainingPeriod(LocalDate.of(2027,12,24));
        System.out.println(apprentice2);
        apprentice2.extendTrainingPeriod(100);
        System.out.println(apprentice2);
    }
}
