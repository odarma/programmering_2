package oblig3;
import oblig3.moduls.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1965,11,8);
        TVSeries noe = new TVSeries("Days of our Lives","noe", date);
        Random random = new Random();
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person ww = new Person("Walter", "White", 55);
        Person jp = new Person("Jesse", "Pinkman", 26);
        Person dd = new Person("Ding","Dong",42);
        personArrayList.add(ww);
        personArrayList.add(jp);
        personArrayList.add(dd);

        Movie honhon = new Movie("honhon",234,"wiwi",date,
                personArrayList.get(random.nextInt(0, personArrayList.size())));
        System.out.println(honhon);

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
                Episode ep = new Episode("wawa " + episode, episode, season, random.nextInt(20, 30),
                        "bau bau",date,personArrayList.get(random.nextInt(0, personArrayList.size())));
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
        System.out.printf("%-15s %-10s %-10s %-10s %-15s %-15s %-15s \n",
                "Title", "Episode", "Season", "Runtime","Description","Release Date","Director");

        for (Episode ep : season42) {
            System.out.printf("%-15s %-10d %-10d %-3.0f %-6s %-15s %-15s %s \n",
                    ep.getTitle(), ep.getEpisodeNumber(), ep.getSeasonNumber(),
                    ep.getRuntime(),"min",ep.getDescription(),ep.getFormattedReleaseDate(),ep.getDirector().getFullName());
        }
        System.out.println("total episodes in this season: " + season42.size());
    }
}