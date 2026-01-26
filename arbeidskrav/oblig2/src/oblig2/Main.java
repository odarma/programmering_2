package oblig2;
import oblig2.models.*;
import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write under the title of the series:");
        Scanner input = new Scanner(System.in);
        String seriesTitle = input.nextLine();
        System.out.println("write under the description of the series:");
        String description = input.nextLine();
        System.out.println("write under the year the series released on:");
        int year = input.nextInt();
        System.out.println("write under the month the series released on:");
        int month = input.nextInt();
        System.out.println("write under the day the series released on:");
        int day = input.nextInt();
        input.close();

        TVSeries noe = new TVSeries(seriesTitle,description, LocalDate.of(year, month, day));
        System.out.println(noe);

        Episode episode1 = new Episode("wawa", 1,1,25);
        System.out.println(episode1);
        noe.addEpisode(episode1);
        System.out.println(noe);

        Episode episode2 = new Episode("wawawa", 2,2,30);
        System.out.println(episode2);
        noe.addEpisode(episode2);
        System.out.println(noe);
    }
}