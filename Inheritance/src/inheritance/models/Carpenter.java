package inheritance.models;

public class Carpenter extends Person {
    private int numberOfHousesBuilt;

    public Carpenter(String firstName, String lastName, int age, int numberOfHousesBuilt){
        super(firstName, lastName, age);
        setNumberOfHousesBuilt(numberOfHousesBuilt);
    }

    public int getNumberOfHousesBuilt() {return numberOfHousesBuilt;}
    public void setNumberOfHousesBuilt(int numberOfHousesBuilt) {this.numberOfHousesBuilt = numberOfHousesBuilt;}
}
