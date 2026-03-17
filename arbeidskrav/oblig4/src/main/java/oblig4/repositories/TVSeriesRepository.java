package oblig4.repositories;
import oblig4.modules.TVSeries;

import java.util.ArrayList;

public interface TVSeriesRepository {
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);
    ArrayList<TVSeries> getAllTVSeries();
    TVSeries getTVSeriesByTitle(String title);
}
