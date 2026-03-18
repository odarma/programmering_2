package oblig5.repositories;
import oblig5.modules.TVSeries;
import java.util.ArrayList;

public interface TVSeriesRepository {
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);
    ArrayList<TVSeries> getAllTVSeries();
    TVSeries getTVSeriesByTitle(String title);
    void addTvSeries(TVSeries tvSerie);
}
