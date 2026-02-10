package noe.moduls;

public class BussDriver extends Person {
    private String route;

    public BussDriver(String firstName, String lastName, int age, String route){
        super(firstName, lastName, age);
        setRoute(route);
    }

    public String getRoute() {return route;}
    public void setRoute(String route) {this.route = route;}
}
