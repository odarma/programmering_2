package oblig3.moduls;

import java.time.format.*;
import java.util.ArrayList;
import java.time.*;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes= new ArrayList<>();
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private double averageRunTime;
    private int numSeasons;

    public TVSeries(String title, String description, LocalDate releaseDate){
        setTitle(title);
        setDescription(description);
        setReleaseDate(releaseDate);
    }
    public void addEpisode(Episode episode){
        if (episode == null) {
            System.out.println("\nepisode does not exist");
            return;
        }

        if(episode.getSeasonNumber()>numSeasons+1){
            System.out.printf("\nepisode %d season %d's season number is too high. episode not added.\n" +
                    "the episode in question:\n", episode.getEpisodeNumber(), episode.getSeasonNumber());
            System.out.println(episode);
            return;
        }

        if(episode.getSeasonNumber()>numSeasons){
            numSeasons = episode.getSeasonNumber();
        }

        episodes.add(episode);
        updateAverageRunTime();
    }

    private void updateAverageRunTime(){
        double total = 0;
        if(episodes.isEmpty()){
            averageRunTime = 0;
        }else {
            for (Episode episode : episodes) {
                total += episode.getRuntime();
            }
        }
        averageRunTime = total/getEpisodes().size();
    };

    public ArrayList<Episode> getEpisodesInSeason(int season){
        ArrayList<Episode> showEpisodes = new ArrayList<>();
        for (Episode episode : episodes) {
            if(episode.getSeasonNumber() == season){
                showEpisodes.add(episode);
            }
        }
        return new ArrayList<>(showEpisodes);
    }

    @Override public String toString() {
        return "TV series title: "+getTitle()+"\ndescription: "+getDescription()+"\nrelease date: "
                +getReleaseDate().format(correctFormat)
                +"\nnumber of episodes: "+getEpisodes().size()+"\n";
    }

    public ArrayList<Episode> getEpisodes() {return new ArrayList<>(episodes);}
    public LocalDate getReleaseDate() {return releaseDate;}
    public void setReleaseDate(LocalDate releaseDate) {this.releaseDate = releaseDate;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getAverageRunTime() {return averageRunTime;}
    public int getNumSeasons() {return numSeasons;}
}

