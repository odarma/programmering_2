package noe;

import io.javalin.Javalin;
import io.javalin.http.*;
import io.javalin.vue.VueComponent;
import noe.model.*;
import noe.repository.*;
import org.jetbrains.annotations.NotNull;
import noe.controller.*;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueInstanceNameInJs = "app";
        }).start(1337);

        ZooRepository zooRepository = new ZooDummyRepository();
        ZooController zooController = new ZooController(zooRepository);

        // --- API ---
        app.get("/api/add-zoo",context -> {
            zooController.addZoo(context);
        });

        app.get("/api/zoo/{zoo-name}", zooController::getZooByName);

        app.get("/api/all-zoos", context -> zooController.getAllZoos(context));

        app.get("/api/mascot", new Handler() {
            @Override public void handle(@NotNull Context context) throws Exception {
                zooController.getMascot(context);
            }
        });


        // --- Pages ---
        app.get("/", new VueComponent("home-page"));

        app.get("/all-zoos", new VueComponent("zoos-overview"));

        app.get("/zoo/{zoo-name}", new VueComponent("zoo-detail"));

        app.get("/add-zoo", new VueComponent("add-zoo"));

        app.get("/other-page", context -> context.result("Hello from the other page!"));

        app.get("/some-page/page-in-page", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                context.result("This is a sub-page");
            }
        });

    }
}
