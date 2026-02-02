package oblig2;
import oblig2.models.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Random;
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

        TVSeries noe = new TVSeries(seriesTitle,description, LocalDate.of(year, month, day));
        Random random = new Random();

        for (int season = 1; season <= 5; season++) {
            for (int episodeNr = 1; episodeNr <= 10; episodeNr++) {
                int randomNr = random.nextInt(20,30);
                Episode episode  = new Episode("wawa"+episodeNr, episodeNr,season,randomNr);
                noe.addEpisode(episode);
            }
        }
        System.out.println(noe);

        System.out.println("\nwrite which season you want to get episodes from:");
        int chooseSeason = input.nextInt();
        ArrayList<Episode> rah = noe.getEpisodesInSeason(chooseSeason);
        System.out.println(rah);
        System.out.printf("titles of episodes from season %d:", chooseSeason);
        for (Episode rahs:rah){
            System.out.printf("\n%s",rahs.getTitle());
        }
    }
}