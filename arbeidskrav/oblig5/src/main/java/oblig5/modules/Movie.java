package oblig5.modules;
import java.time.LocalDate;

public class Movie extends Production {
    public Movie(String title, double runtime, String description, LocalDate releaseDate, Director director){
        super(title, runtime,description,releaseDate,director);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Director(s): ").append(getDirector().getFullName()).append("\n");
        sb.append("Role(s) and its(their) actor(s):\n");
        for (Role role : getRoles()) {
            sb.append("  - ").append(role).append("\n");
        }
        return super.toString()+sb;
    }
}
