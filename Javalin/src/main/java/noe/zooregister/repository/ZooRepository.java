package noe.zooregister.repository;
import noe.zooregister.models.*;
import java.util.ArrayList;

public interface ZooRepository {
    Animal getMascot();
    ArrayList<Zoo> getAllZoos();

}
