package oblig3.moduls;

import java.time.format.DateTimeFormatter;

public class Production {
    private String title;
    private double runtime;
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Production (String title, double runtime) {
        setTitle(title);
        setRuntime(runtime);
    }
    public Production (String episodeTitle) {
        this(episodeTitle,0);
    }


public String getTitle() {return title;}
public void setTitle(String title) {this.title = title;}
public double getRuntime() {return runtime;}
public void setRuntime(double runtime) {if (runtime <= 0) {this.runtime = 0;} else {this.runtime = runtime;}}
}