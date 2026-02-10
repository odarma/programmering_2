package oblig3.moduls;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Production{
    private String title;
    private double runtime;
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String description;
    private LocalDate releaseDate;
    private Person director;

    public Production (String title, double runtime,String description,LocalDate releaseDate,Person director) {
        setTitle(title);
        setRuntime(runtime);
        setDescription(description);
        setReleaseDate(releaseDate);
        setDirector(director);
    }
    public Production (String episodeTitle) {this(episodeTitle,0,null,null,null);}

    @Override public String toString() {
        return "title: "+getTitle()+"\ndescription: "+getDescription() +"\nrelease date: "+getReleaseDate().format(correctFormat)
                +"\nruntime in minutes: "+getRuntime()+"\ndirector: "+getDirector().getFullName()+"\n";
    }

    public String getFormattedReleaseDate() {if (releaseDate == null) {return "N/A";}return releaseDate.format(correctFormat);}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getRuntime() {return runtime;}
    public void setRuntime(double runtime) {if (runtime <= 0) {this.runtime = 0;} else {this.runtime = runtime;}}
    public LocalDate getReleaseDate() {return releaseDate;}
    public void setReleaseDate(LocalDate releaseDate) {this.releaseDate = releaseDate;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Person getDirector() {return director;}
    public void setDirector(Person director) {this.director = director;}
}