package oblig5;

import oblig5.modules.TVSeries;
import oblig5.repositories.TVSeriesJSONRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class JSONMain {
    public static void main(String[] args) {
        TVSeries wawa = new TVSeries("wawa", "ada kadabra sim sala binz", LocalDate.of(2001,9,11));
        TVSeries nya= new TVSeries("nya", "neko", LocalDate.of(2222,2,22));
        ArrayList<TVSeries> tvSeriesArrayList = new ArrayList<>();
        tvSeriesArrayList.add(wawa);
        tvSeriesArrayList.add(nya);
        File f = new File("kys.json");
        TVSeriesJSONRepository sendFile = new TVSeriesJSONRepository(f);
        sendFile.addListOfTVSeries(tvSeriesArrayList);

        ArrayList<TVSeries> readJSON = sendFile.getAllTVSeries();
        if (readJSON != null && !readJSON.isEmpty()) {
            for (TVSeries fetchedTVS : readJSON) {
                System.out.println("Lest fra fil: \n"+fetchedTVS);
            }
        }
        System.out.println("Lest fra fil: \n"+sendFile.getTVSeriesByTitle("wawa"));
        System.out.println("Lest fra fil: \n"+sendFile.getTVSeriesByTitle("wow"));

    }
}
