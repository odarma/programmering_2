package oblig4.modules;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Production{
    private String title;
    private double runtime;
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String description;
    private LocalDate releaseDate;
    private Director director;
    private ArrayList<Role> roles = new ArrayList<>();

    public Production(){}

    public Production (String title, double runtime,String description,LocalDate releaseDate,Director director) {
        this(title, description, releaseDate);
        setRuntime(runtime);
        setDirector(director);
    }
    public Production (String title) {setTitle(title);}
    public Production(String title, double runtime) {
        this(title);
        setRuntime(runtime);
    }
    public Production(String title, String description, LocalDate releaseDate) {
        this(title);
        setDescription(description);
        setReleaseDate(releaseDate);
    }

    public void addRoles(Role role){roles.add(role);}
    public void addRoles(ArrayList<Role> listOfRoles) {roles.addAll(listOfRoles);}

    @Override public String toString() {
        return getTitle()+"\nDescription: "+getDescription() +"\nRelease date: "+getReleaseDate().format(correctFormat)+"\n";
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getRuntime() {return runtime;}
    public void setRuntime(double runtime) {if (runtime <= 0) {this.runtime = 0;} else {this.runtime = runtime;}}
    public LocalDate getReleaseDate() {return releaseDate;}
    public void setReleaseDate(LocalDate releaseDate) {this.releaseDate = releaseDate;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Person getDirector() {return director;}
    public void setDirector(Director director) {this.director = director;}
    public ArrayList<Role> getRoles() {return new ArrayList<>(roles);}
}