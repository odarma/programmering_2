package overloading.models;

public class Carpenter extends Person {
    private int numberOfHousesBuilt;

    public Carpenter(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public Carpenter(String firstName, String lastName, int age, int numberOfHousesBuilt){
        super(firstName, lastName, age);
        setNumberOfHousesBuilt(numberOfHousesBuilt);
    }

    @Override
    public String toString() {return super.toString() + "\nHouses built: " + numberOfHousesBuilt;}

    public int getNumberOfHousesBuilt() {return numberOfHousesBuilt;}
    public void setNumberOfHousesBuilt(int numberOfHousesBuilt) {this.numberOfHousesBuilt = numberOfHousesBuilt;}
}
