public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass){
        setName(name);
        setRadius(radius);
        setMass(mass);
    }
    @Override public String toString(){
        return String.format("planeten %s har en radius på %e km og en masse på %e kg",getName(),getRadius(),getMass());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}

