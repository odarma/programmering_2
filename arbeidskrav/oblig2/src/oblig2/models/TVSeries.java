package oblig2.models;
import java.time.format.*;
import java.util.ArrayList;
import java.time.*;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes= new ArrayList<>();
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private int averageRunTime;

    public TVSeries(String title, String description, LocalDate releaseDate){
        setTitle(title);
        setDescription(description);
        setReleaseDate(releaseDate);
    }
    public void addEpisode(Episode episode){
        if (episode != null) {
            episodes.add(episode);
        }
    }

    public ArrayList<Episode> getEpisodesInSeason(int season){
        ArrayList<Episode> showEpisodes = new ArrayList<>();
        for (Episode episode : episodes) {
            if(episode.getSeasonNumber() == season){
                showEpisodes.add(episode);
            }
        }
        return new ArrayList<>(showEpisodes);
    }

    private int updateAverageRunTime(){

    };

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
    public int getAverageRunTime() {return averageRunTime;}
}
