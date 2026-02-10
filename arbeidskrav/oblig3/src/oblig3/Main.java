package oblig3;
import oblig3.moduls.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1965,11,8);
        TVSeries noe = new TVSeries("wow","noe", date);
        Random random = new Random();
        int episode = 1;
        int season = 1;
        int episodeNr = 1;
        int aarFoer = date.getYear();
        while(episodeNr<=14430){
            if (date.getYear()>aarFoer){
                aarFoer = date.getYear();
                episode=1;
                season++;}
            if (!(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                int randomNr = random.nextInt(20, 30);
                Episode ep = new Episode("wawa " + episode, episode, season, randomNr);
                noe.addEpisode(ep);
                episode++;
                episodeNr++;
            }
            date = date.plusDays(1);
        }
        System.out.println(noe);
        System.out.printf("current number of seasons: %d\n",noe.getNumSeasons());

        ArrayList<Episode> season42 = noe.getEpisodesInSeason(42);
        System.out.println("--- episodes in season 42 ---");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Title", "Episode", "Season", "Runtime");
        for (Episode ep : season42) {
            System.out.printf("%-15s %-10d %-10d %-2.0f min%n",
                    ep.getTitle(),
                    ep.getEpisodeNumber(),
                    ep.getSeasonNumber(),
                    ep.getRuntime());
        }
        System.out.println("Totalt antall episoder i sesongen: " + season42.size());
    }
}