package oblig5.repositories;

import oblig5.modules.*;

import java.time.*;
import java.util.*;

public class TVSeriesDummyRepository implements TVSeriesRepository{
    private ArrayList<TVSeries> allTvSeries;

    public TVSeriesDummyRepository (){
        Random random = new Random();

        TVSeries wawa = new TVSeries("wawa", "ada kadabra sim sala binz", LocalDate.of(2001,9,11));
        TVSeries nya= new TVSeries("nya", "neko", LocalDate.of(2222,2,22));

        Actor ww = new Actor("Walter", "White", 55);
        Actor jp = new Actor("Jesse", "Pinkman", 26);
        Actor dd = new Actor("Ding","Dong",42);
        Actor rdjr = new Actor("robert", "downey jr", 50);
        Director jd = new Director("jån", "dåw", 67);
        Director pdf = new Director("pita", "d. foya", 69);
        Director bb = new Director("bigg", "boj", 100);
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(ww);
        personArrayList.add(jp);
        personArrayList.add(dd);
        personArrayList.add(jd);
        personArrayList.add(pdf);
        personArrayList.add(bb);
        ArrayList<Director> directorList = new ArrayList<>();
        for (Person currentPerson:personArrayList){
            if (currentPerson instanceof Director director){
                directorList.add(director);
            }
        }

        Role ts = new Role("tony", "stark", rdjr);
        Role role1 = new Role("ada","kadabra", ww);
        Role role2 = new Role("wewe","wiwi", jp);
        Role role3 = new Role("kaka", "koko", dd);
        ArrayList<Role> listOfRoles = new ArrayList<>();
        listOfRoles.add(role1);
        listOfRoles.add(role2);
        listOfRoles.add(role3);
        listOfRoles.add(ts);

        LocalDate date = LocalDate.of(1965,11,8);
        int episode = 1;
        int season = 1;
        int episodeNr = 1;
        int aarFoer = date.getYear();
        int i;
        while(episodeNr<=14430){
            if (date.getYear()>aarFoer){
                aarFoer = date.getYear();
                episode=1;
                season++;}
            if (!(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                Episode ep = new Episode("mao mao " + episode, episode, season, random.nextInt(20, 30),
                        "bao bao",date, directorList.get(random.nextInt(0, directorList.size())));
                int rand1 = random.nextInt(0, listOfRoles.size()+1);
                int rand2 = random.nextInt(0, listOfRoles.size()+1);
                while (rand1==rand2) {
                    rand1 = random.nextInt(0, listOfRoles.size()+1);
                    rand2 = random.nextInt(0, listOfRoles.size()+1);
                }
                HashSet<Role> uniqueRole = new HashSet<>();
                if (rand1<rand2){
                    for (i = rand1; i < rand2;i++){
                        uniqueRole.add(listOfRoles.get(random.nextInt(rand1,rand2)));
                    }
                    ep.addRoles(new ArrayList<>(uniqueRole));
                }else {
                    for (i = rand2; i < rand1;i++){
                        uniqueRole.add(listOfRoles.get(random.nextInt(rand2,rand1)));
                    }
                    ep.addRoles(new ArrayList<>(uniqueRole));
                }
                nya.addEpisode(ep);
                wawa.addEpisode(ep);

                episode++;
                episodeNr++;
            }
            date = date.plusDays(1);
        }

        addTvSeries(wawa);
        addTvSeries(nya);
    }

    @Override public void addTvSeries(TVSeries tvSerie){allTvSeries.add(tvSerie);}

    @Override public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        getAllTVSeries().addAll(listOfTVSeries);
    }

    @Override public ArrayList<TVSeries> getAllTVSeries() {
        return new ArrayList<>(allTvSeries);
    }

    @Override public TVSeries getTVSeriesByTitle(String title) {
        for (TVSeries tvs : getAllTVSeries()) {
            if (tvs.getTitle().equalsIgnoreCase(title)) {
                return tvs;
            }
        }
        return null;
    }

}