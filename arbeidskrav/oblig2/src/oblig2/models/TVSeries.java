package oblig2.models;
import java.util.ArrayList;
import java.time.*;

public class TVSeries {
    private String title;
    private String description;
    private String releaseDate;
    private ArrayList<String> episodes;

    public TVSeries(String title, String description, String releaseDate){
        setTitle(title);
        setDescription(description);
        setReleaseDate(releaseDate);
    }
    public addEpisode(Episode episode){

    }

    public ArrayList<String> getEpisodes() {return episodes;}
    public void setEpisodes(ArrayList<String> episodes) {this.episodes = episodes;}
    public String getReleaseDate() {return releaseDate;}
    public void setReleaseDate(String releaseDate) {this.releaseDate = releaseDate;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
}
