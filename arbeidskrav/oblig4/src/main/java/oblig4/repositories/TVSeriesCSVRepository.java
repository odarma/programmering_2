package oblig4.repositories;
import oblig4.modules.TVSeries;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TVSeriesCSVRepository implements TVSeriesRepository{
    private File file;
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("d.M.yyyy");

    public TVSeriesCSVRepository(File f){setFile(f);}

    @Override public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getFile()))) {
            for (TVSeries TVS:listOfTVSeries){
                bufferedWriter.write("Title:"+TVS.getTitle());
                bufferedWriter.newLine();
                bufferedWriter.write("Release date:"+ TVS.getReleaseDate().getDayOfMonth()+"."+
                        TVS.getReleaseDate().getMonthValue() +"."+TVS.getReleaseDate().getYear());
                bufferedWriter.newLine();
                bufferedWriter.write("Description:"+TVS.getDescription());
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Could not write to file: "+e.getMessage());
        }
    }

    @Override public ArrayList<TVSeries> getAllTVSeries() {
        ArrayList<TVSeries> fetchedTVS = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            if (file.canRead()) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.isBlank()) {continue;}

                    String title = line.split(":")[1];

                    String dateLine = bufferedReader.readLine();
                    String dateString = dateLine.split(":")[1];
                    LocalDate releaseDate = LocalDate.parse(dateString,correctFormat);

                    String descLine = bufferedReader.readLine();
                    String description = descLine.split(":")[1];

                    TVSeries newTVS = new TVSeries(title, description, releaseDate);
                    fetchedTVS.add(newTVS);
                }
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Could not find file with name " + file.getName());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return new ArrayList<>(fetchedTVS);
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        TVSeries fetchedTVS = null;
        for (TVSeries tvs:getAllTVSeries()){
            if (tvs.getTitle().equalsIgnoreCase(title)) {
                fetchedTVS = tvs;
            }
        }
        return fetchedTVS;
    }

    public void setFile(File file) {this.file = file;}
    public File getFile() {return file;}
}
