package oblig5.controller;

import oblig5.modules.*;
import oblig5.repositories.*;
import io.javalin.http.*;

public class TVSeriesController {
    private TVSeriesRepository tvSeriesRepository;

    public TVSeriesController (TVSeriesRepository tvs){setTvSeriesRepository(tvs);}

    public void getAllTvSeries(Context context){context.json(getTvSeriesRepository().getAllTVSeries());}
    public void getTvSeriesByTitle(Context context,String title){
        String name = context.pathParam("name");
        TVSeries fetchedTVS = getTvSeriesRepository().getTVSeriesByTitle(title);

        if (fetchedTVS != null) {
            context.json(fetchedTVS);
        }
        else {
            context.result("Could not find TV-serie with this name: " + name);
        }
    }
    //public void addTvSeries(Context context){context.json(getTvSeriesRepository().addTvSeries());}

    public TVSeriesRepository getTvSeriesRepository() {
    return tvSeriesRepository;
}
    public void setTvSeriesRepository(TVSeriesRepository tvSeriesRepository) {
        this.tvSeriesRepository = tvSeriesRepository;
    }
}

