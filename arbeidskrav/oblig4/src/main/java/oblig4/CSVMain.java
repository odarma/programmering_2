package oblig4;

import oblig4.modules.*;
import java.io.*;
import java.time.*;
import java.util.*;

public class CSVMain {
    public static void main(String[] args) {
        TVSeries wawa = new TVSeries("wawa", "ada kadabra sim sala binz", LocalDate.of(2001,9,11));
        TVSeries nya= new TVSeries("nya", "neko", LocalDate.of(2222,2,22));
        ArrayList<TVSeries> tvSeriesArrayList = new ArrayList<>();
        tvSeriesArrayList.add(wawa);
        tvSeriesArrayList.add(nya);
        File f = new File("kys.csv");
        TVSeriesCSVRepository sendFile = new TVSeriesCSVRepository(f);
        sendFile.addListOfTVSeries(tvSeriesArrayList);
        for (TVSeries tvs:sendFile.getAllTVSeries()){
            System.out.println("Lest fra fil: \ntitle: " + tvs.getTitle() + "\nrelease date: " + tvs.getReleaseDate()
            +"\ndescription: "+tvs.getDescription()+"\n");
        }
        System.out.println("Valgt TV-serie lest fra fil: \n"+sendFile.getTVSeriesByTitle("wawa"));
        System.out.println("Valgt TV-serie lest fra fil: \n"+sendFile.getTVSeriesByTitle("wow"));
    }
}
