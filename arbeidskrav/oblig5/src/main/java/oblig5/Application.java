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
        }).start(1337);

        // --- API ---
        app.get("/api/tvseries/{name}",new VueComponent("name"));

        // --- Sider ---
        app.get("/", new VueComponent("home-page"));
        app.get("/api/add-tvseries",new VueComponent("add-tvseries"));
        app.get("/tvseries/{name}", new VueComponent("tvseries-detail"));
        app.get("/tvseries",new VueComponent("tvseries-overview"));
    }
}
