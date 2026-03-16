package noe.controller;

import noe.model.Zoo;
import noe.repository.ZooRepository;
import io.javalin.http.*;

public class ZooController {
    private ZooRepository zooRepository;

    public ZooController(ZooRepository zoo){
        setZooRepository(zoo);
    }

    public void getMascot(Context context){
        context.json(getZooRepository().getMascot());
    }
    public void getAllZoos(Context context){
        context.json(getZooRepository().getAllZoos());
    }

    public void getZooByName(Context context){
        String zooName = context.pathParam("zoo-name");
        Zoo fetchedZoo = getZooRepository().getZooByName(zooName);

        if (fetchedZoo != null) {
            context.json(fetchedZoo);
        }
        else {
            context.result("Could not find zoo with name " + zooName);
        }
    }

    public void addZoo(Context context){
        String zooName = context.formParam("zoo-name");
        Zoo createdZoo = new Zoo(zooName);
        getZooRepository().addZoo(createdZoo);
        context.redirect("/all-zoos");
    }

    public ZooRepository getZooRepository() {return zooRepository;}
    public void setZooRepository(ZooRepository zooRepository) {this.zooRepository = zooRepository;}
}
