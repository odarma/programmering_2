package oblig5;
import io.javalin.*;
import io.javalin.http.*;
import io.javalin.vue.VueComponent;
import oblig5.repositories.*;
import oblig5.controller.*;
import org.jetbrains.annotations.NotNull;

public class Application {
    public static void main(String[] args) {
        TVSeriesDummyRepository tvSeriesRepository = new TVSeriesDummyRepository();
        TVSeriesController tvSeriesController = new TVSeriesController(tvSeriesRepository);

        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueInstanceNameInJs = "app";
        }).start(8080);

        // --- Sider ---
        app.get("/", new VueComponent("home-page"));
        app.get("/tvseries/{title}", new VueComponent("tvseries-detail"));
        app.get("/tvseries",new VueComponent("tvseries-overview"));

        // --- API ---
        app.get("/api/tvseries/{title}", tvSeriesController::getTvSeriesByTitle);
        app.get("/api/tvseries",tvSeriesController::getAllTvSeries);
        //app.get("/api/add-tvseries",tvSeriesController::addTvSeries);
    }
}
