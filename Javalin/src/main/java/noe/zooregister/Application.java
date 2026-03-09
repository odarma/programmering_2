package noe.zooregister;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import noe.zooregister.models.*;
import noe.zooregister.repository.ZooDummyRepository;
import noe.zooregister.repository.ZooRepository;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(1337);

        ZooRepository zooRepository = new ZooDummyRepository();

        app.get("/api/zoo/{zoo-name}", new Handler() {@Override public void handle(@NotNull Context context) throws Exception {
                String zooName = context.pathParam("zoo-name");
                context.result("the zoo name is "+zooName);
            }
        });

        app.get("/api/all-zoos", new Handler() {@Override public void handle(@NotNull Context context) throws Exception {
                context.json(zooRepository.getAllZoos());
            }
        });

        app.get("/api/mascot", new Handler() {@Override public void handle(@NotNull Context context) throws Exception {
                context.json(zooRepository.getMascot();
            }
        });

        app.get("/", new Handler() {@Override public void handle(@NotNull Context context) throws Exception {
                context.result("hellow javalin");
            }
        });

        app.get("/otha-peij", new Handler() {@Override public void handle(@NotNull Context context) throws Exception {
                context.result("ballow fron otha peij");
            }
        });

        app.get("/otha-peij/kys", new Handler() {@Override public void handle(@NotNull Context context) throws Exception {
                context.result("søb peij");
            }
        });
    }
}
