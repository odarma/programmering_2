package inheritance.models;

public class Person extends Object /*underforstått at hver klasse arver fra Object. er toppen av hierarkien*/ {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }
    @Override public String toString(){
        return String.format("\n\nfirst name: %s\nlast name: %s\nage: %d", getFirstName(), getLastName(), getAge());
    }

    /*public void printDescription(){
        System.out.printf("\n\nfirst name: %s\nlast name: %s\nage: %d", getFirstName(), getLastName(), getAge());
    }*/

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
