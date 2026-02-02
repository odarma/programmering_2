package oblig2.models;

public class Episode {
    private String title;
    private int episodeNumber;
    private int seasonNumber;
    private int runtime;

    public Episode(String title, int episodeNumber, int seasonNumber, int runtime){
        setTitle(title);
        setEpisodeNumber(episodeNumber);
        setSeasonNumber(seasonNumber);
        setRuntime(runtime);
    }
    public Episode(String title, int episodeNumber, int seasonNumber){
        this(title, episodeNumber, seasonNumber,0);
    }
    @Override public String toString() {
        return "episode title: "+getTitle()+"\nepisode number: "+getEpisodeNumber()+"\nseason number: "+getSeasonNumber()
                + "\nruntime in minutes: "+getRuntime()+"\n";}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public int getEpisodeNumber() {return episodeNumber;}
    public void setEpisodeNumber(int episodeNumber) {this.episodeNumber = episodeNumber;}
    public int getSeasonNumber() {return seasonNumber;}
    public void setSeasonNumber(int seasonNumber) {this.seasonNumber = seasonNumber;}
    public int getRuntime() {return runtime;}
    public void setRuntime(int runtime) {if (runtime<=0){this.runtime = 25;} else{this.runtime=runtime;}
    }
}
