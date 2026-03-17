package noe.models;

public class Album implements Comparable<Album> {
    private String title;
    private String artist;
    private int year;

    public Album(String title, String artist, int year) {
        setTitle(title);
        setArtist(artist);
        setYear(year);
    }

    @Override
    public int compareTo(Album otherAlbum) {return getTitle().compareTo(otherAlbum.getTitle());}

    @Override public String toString() {return title + " - " + artist + " - " + year;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getArtist() {return artist;}
    public void setArtist(String artist) {this.artist = artist;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
}
