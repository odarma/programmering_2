package noe;
import noe.models.*;
import java.util.*;
import noe.interfaces.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("In Rainbows", "Radiohead", 2007));
        albums.add(new Album("Souvlaki", "Slowdive", 1994));
        albums.add(new Album("SILENT HILL2", "Akira Yamaoka", 2001));
        albums.add(new Album("Pet Sounds", "The Beach Boys", 1966));
        albums.add(new Album("98.12.28", "Fishmans", 1999));
        albums.add(new Album("Blue Rev", "Alvvays", 2022));
        albums.add(new Album("Mercurial World", "Magdalena Bay", 2021));
        albums.add(new Album("The Mollusk", "Ween", 1997));
        albums.add(new Album("In The Court Of The Crimson King", "King Crimson", 1969));
        albums.add(new Album("Knocknarea", "Maruja", 2023));
        albums.add(new Album("The Downward Spiral", "Nine Inch Nails", 1994));
        albums.add(new Album("Emotion", "Carly Rae Jepsen", 2015));
        albums.add(new Album("You Will Never Know Why", "Sweet Trip", 2009));
        albums.add(new Album("EUSEXUA", "FKA Twigs", 2025));
        albums.add(new Album("Violator", "Depeche Mode", 1990));
        albums.add(new Album("Ants From Up There", "Black Country, New Road", 2022));
        albums.add(new Album("Songs Of A Lost World", "The Cure", 2024));


        System.out.println("-----------Unsorted Albums-----------");
        printAlbums(albums);

        System.out.println("\n-----------Standard, name sorted albums----------");
        Collections.sort(albums); // Sorteringen tar her utgangpunkt i Album-klassen sin Comparable-implementasjon
        printAlbums(albums);

        System.out.println("\n----------Albums sorted by year (ascending)--------");
        albums.sort((album1,album2)->Integer.compare(album1.getYear(), album2.getYear()));
        albums.sort(Comparator.comparingInt(Album::getYear)); //samme
        /*albums.sort(new Comparator<Album>() {
            @Override public int compare(Album album1, Album album2) {
                return Integer.compare(album1.getYear(), album2.getYear());
            }
        });*/
        printAlbums(albums);

        System.out.println("\n--------Albums starting with T---------");
        printAlbumsConditionally(albums,album -> {return album.getTitle().toLowerCase().startsWith("t");});

        System.out.println("\n-------Albums after the year 2000------");
        printAlbumsConditionally(albums,album -> {return album.getYear()>2000;});

        System.out.println("\n------Print old albums-----------------");
        printAlbumsConditionally(albums,album -> {return album.getYear()<=1970;});

        System.out.println("\n------Albums between 1990 and 2000------");
        printAlbumsConditionally(albums,album -> {return album.getYear()>=1990 && album.getYear()<=2000;});
    }

    public static void printAlbums(ArrayList<Album> albums) {
        for (Album album : albums) {
            System.out.println(album);
        }
    }
    public static void printAlbumsConditionally(ArrayList<Album> albums,AlbumCondition printCondition){
        for (Album album:albums){
            if (printCondition.isMet(album)){
                System.out.println(album);
            }
        }
    }
}
