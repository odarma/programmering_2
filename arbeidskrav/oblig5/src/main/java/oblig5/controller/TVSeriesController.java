package oblig5.controller;

import oblig5.modules.*;
import oblig5.repositories.*;
import io.javalin.http.*;
import java.time.LocalDate;
import java.util.Objects;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class TVSeriesController {
    private TVSeriesRepository tvSeriesRepository;

    public TVSeriesController (TVSeriesRepository tvs){setTvSeriesRepository(tvs);}

    public void getAllTvSeries(Context context){context.json(getTvSeriesRepository().getAllTVSeries());}
    public void getTvSeriesByTitle(Context context){
        String title = context.pathParam("title");
        TVSeries fetchedTVS = getTvSeriesRepository().getTVSeriesByTitle(title);

        if (fetchedTVS != null) {
            context.json(fetchedTVS);
        }
        else {
            context.result("Could not find TV-serie with this name: " + title);
        }
    }

    public void addTvSeries(Context context){
        try {
            String title = Objects.requireNonNull(context.formParam("title"));
            String description = Objects.requireNonNull(context.formParam("description"));
            int day = Integer.parseInt(Objects.requireNonNull(context.formParam("release-date-day")));
            int month = Integer.parseInt(Objects.requireNonNull(context.formParam("release-date-month")));
            int year = Integer.parseInt(Objects.requireNonNull(context.formParam("release-date-year")));

            TVSeries addedTVSeries = new TVSeries(title,description, LocalDate.of(year, month, day));
            getTvSeriesRepository().addTvSeries(addedTVSeries);

            String pathTitle = URLEncoder.encode(title, StandardCharsets.UTF_8.toString()).replace("+", "%20");
            context.redirect("/tvseries/"+pathTitle);
        } catch (Exception e){
            context.status(400).result("Invalid input: " + e.getMessage());
        }
    }

    public TVSeriesRepository getTvSeriesRepository() {
    return tvSeriesRepository;
}
    public void setTvSeriesRepository(TVSeriesRepository tvSeriesRepository) {
        this.tvSeriesRepository = tvSeriesRepository;
    }
}

