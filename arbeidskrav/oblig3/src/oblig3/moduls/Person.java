package oblig3.moduls;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFullName() {return String.format("%s %s",getFirstName(),getLastName());}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
}
