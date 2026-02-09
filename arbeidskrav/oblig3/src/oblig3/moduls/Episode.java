package oblig3.moduls;

public class Episode extends Production{
    private int episodeNumber;
    private int seasonNumber;


    public Episode(String episodeTitle, int episodeNumber, int seasonNumber, double runtime){
        super(episodeTitle, runtime);
        setEpisodeNumber(episodeNumber);
        setSeasonNumber(seasonNumber);
    }
    public Episode(String episodeTitle, int episodeNumber, int seasonNumber){
        this(episodeTitle, episodeNumber, seasonNumber,0);
    }

    @Override public String toString() {
        return "title: "+ getTitle()+"\nepisode number: "+getEpisodeNumber()+"\nseason number: "+getSeasonNumber()
                + "\nruntime in minutes: "+getRuntime()+"\n";}

    public int getEpisodeNumber() {return episodeNumber;}
    public void setEpisodeNumber(int episodeNumber) {this.episodeNumber = episodeNumber;}
    public int getSeasonNumber() {return seasonNumber;}
    public void setSeasonNumber(int seasonNumber) {this.seasonNumber = seasonNumber;}
}
