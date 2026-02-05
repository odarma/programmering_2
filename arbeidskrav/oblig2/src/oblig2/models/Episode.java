package oblig2.models;

public class Episode {
    private String episodeTitle;
    private int episodeNumber;
    private int seasonNumber;
    private int runtime;

    public Episode(String title, int episodeNumber, int seasonNumber, int runtime){
        setEpisodeTitle(title);
        setEpisodeNumber(episodeNumber);
        setSeasonNumber(seasonNumber);
        setRuntime(runtime);
    }
    public Episode(String title, int episodeNumber, int seasonNumber){
        this(title, episodeNumber, seasonNumber,0);
    }

    @Override public String toString() {
        return "title: "+ getEpisodeTitle()+"\nepisode number: "+getEpisodeNumber()+"\nseason number: "+getSeasonNumber()
                + "\nruntime in minutes: "+getRuntime()+"\n";}

    public String getEpisodeTitle() {return episodeTitle;}
    public void setEpisodeTitle(String episodeTitle) {this.episodeTitle = episodeTitle;}
    public int getEpisodeNumber() {return episodeNumber;}
    public void setEpisodeNumber(int episodeNumber) {this.episodeNumber = episodeNumber;}
    public int getSeasonNumber() {return seasonNumber;}
    public void setSeasonNumber(int seasonNumber) {this.seasonNumber = seasonNumber;}
    public double getRuntime() {return runtime;}
    public void setRuntime(int runtime) {if (runtime<=0){this.runtime = 0;} else{this.runtime=runtime;}
    }
}
