package oblig3.moduls;

import java.time.format.*;
import java.time.*;
import java.util.*;

public class TVSeries extends Production{
    private ArrayList<Episode> episodes= new ArrayList<>();
    private double averageRunTime;
    private int numSeasons;

    public TVSeries(String title, String description, LocalDate releaseDate){
        super(title,description,releaseDate);
    }

    public ArrayList<Role> getCast(){
        HashSet<Role> uniqueRoles = new HashSet<>();
        for(Episode episode:getEpisodes()){
            uniqueRoles.addAll(episode.getRoles());
        }
        return new ArrayList<>(uniqueRoles);
    }
    public ArrayList<Person> getDirectors() {
        HashSet<Person> uniquePerson = new HashSet<>();
        for (Episode episode : getEpisodes()) {
            if (episode.getDirector() != null) {
                uniquePerson.add(episode.getDirector());
            }
        }
        return new ArrayList<>(uniquePerson);
    }

    public void addEpisode(Episode episode){
        if (episode == null) {
            System.out.println("\nepisode does not exist");
            return;
        }

        if(episode.getSeasonNumber()>getNumSeasons()+1){
            System.out.printf("%n episode %d season %d's season number is too high. episode not added.%n" +
                    "the episode in question:\n", episode.getEpisodeNumber(), episode.getSeasonNumber());
            System.out.println(episode);
            return;
        }

        if(episode.getSeasonNumber()>getNumSeasons()){
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

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TV-series title: ").append(getTitle()).append("\n");
        sb.append("Number of episodes: ").append(getEpisodes().size()).append("\n");
        sb.append("Average runtime: ").append(Math.round(getAverageRunTime())).append(" min\n");

        sb.append("Cast members:\n");
        for (Role role : getCast()) {
            sb.append("  - ").append(role).append("\n");
        }

        sb.append("Directors:\n");
        for(Person director:getDirectors()){
            sb.append("  - ").append(director).append("\n");
        }

        return sb.toString();
    }

    public ArrayList<Episode> getEpisodes() {return new ArrayList<>(episodes);}
    public double getAverageRunTime() {return averageRunTime;}
    public int getNumSeasons() {return numSeasons;}
}