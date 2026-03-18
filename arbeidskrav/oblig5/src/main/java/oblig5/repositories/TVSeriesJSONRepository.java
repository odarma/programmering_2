package oblig5.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import oblig5.modules.TVSeries;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TVSeriesJSONRepository implements TVSeriesRepository{
    private File file;
    private static final ObjectMapper mapper = JsonMapper.builder().findAndAddModules().build();// Finner automatisk JavaTimeModule

    public TVSeriesJSONRepository(File f){setFile(f);}

    @Override public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file,listOfTVSeries);
        } catch (IOException e) {
            System.err.println("could not write TV-series to JSON file: "+e.getMessage());
        }
    }

    @Override public ArrayList<TVSeries> getAllTVSeries() {
        try{
            TVSeries[] reading = mapper.readValue(getFile(),TVSeries[].class);
            return new ArrayList<>(Arrays.asList(reading));
        }catch (IOException e) {
            System.err.println("could not read TV-series from JSON file: "+e.getMessage());
        }
        return null;
    }

    @Override public TVSeries getTVSeriesByTitle(String title) {
        TVSeries fetchedTVS = null;
        if (getAllTVSeries()!=null) {
            for (TVSeries tvs : getAllTVSeries()) {
                if (tvs.getTitle().equalsIgnoreCase(title)) {
                    fetchedTVS = tvs;
                }
            }
        }
        return fetchedTVS;
    }

    @Override
    public void addTvSeries(TVSeries tvSerie) {}

    public void setFile(File file) {this.file = file;}
    public File getFile() {return file;}
}
