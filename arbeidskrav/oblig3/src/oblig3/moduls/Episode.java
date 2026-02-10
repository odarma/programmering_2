package oblig3.moduls;

import java.time.LocalDate;

public class Episode extends Production{
    private int episodeNumber;
    private int seasonNumber;

    public Episode(String episodeTitle, int episodeNumber, int seasonNumber, double runtime,
                   String description, LocalDate releaseDate, Person director){
        super(episodeTitle, runtime,description,releaseDate,director);
        setEpisodeNumber(episodeNumber);
        setSeasonNumber(seasonNumber);
    }
    public Episode(String episodeTitle, int episodeNumber, int seasonNumber){
        this(episodeTitle, episodeNumber, seasonNumber,0,null,null,null);
    }

    @Override public String toString() {
        return "\ntitle: "+ getTitle()+"\nepisode number: "+getEpisodeNumber()+"\nseason number: "+getSeasonNumber()
                + "\nruntime in minutes: "+getRuntime()+"\n";}

    public int getEpisodeNumber() {return episodeNumber;}
    public void setEpisodeNumber(int episodeNumber) {if (episodeNumber<0){this.episodeNumber = 0;
        System.out.println("episode number cant be under 0. episode number set to 0.");}
    else{this.episodeNumber = episodeNumber;}
    }
    public int getSeasonNumber() {return seasonNumber;}
    public void setSeasonNumber(int seasonNumber) {if(seasonNumber<0){this.seasonNumber = 0;
        System.out.println("season number cant be under 0. season number set to 0");}
        else{this.seasonNumber = seasonNumber;}
    }
}
