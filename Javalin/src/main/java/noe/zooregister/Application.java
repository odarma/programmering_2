package noe.zooregister;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(1337);

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
