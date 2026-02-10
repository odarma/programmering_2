package oblig3.moduls;
import java.time.LocalDate;

public class Movie extends Production {
    public Movie(String title, double runtime, String description, LocalDate releaseDate, Person director){
        super(title, runtime,description,releaseDate,director);
    }
}
