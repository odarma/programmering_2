package noe.moduls;

public class Person extends Object /*underforstått at hver klasse arver fra Object. er toppen av hierarkien*/ {
    protected String firstName;
    protected String lastName;
    protected int age;
    private static int numPersons = 0;
    private final String birthNumber;

    public Person(String birthNumber){
        this.birthNumber = birthNumber;
    }

    public Person(String firstName, String lastName, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        numPersons++;
        birthNumber = "1234567890";
    }

    public void compareAgeTo(Person otherPerson){
        if (getAge() > otherPerson.getAge()){
            System.out.printf("%s %s is older\n", getFirstName(), getLastName());
        } else if (getAge() < otherPerson.getAge()){
            System.out.printf("%s %s is older\n", otherPerson.getFirstName(), otherPerson.getLastName());
        } else {
            System.out.printf("%s %s and %s %s have same age\n", getFirstName(), getLastName(), otherPerson.getFirstName(), otherPerson.getLastName());
        }
    }

    @Override public String toString(){
        return String.format("\n\nfirst name: %s\nlast name: %s\nage: %d", getFirstName(), getLastName(), getAge());
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public static int getNumPersons() {return numPersons;}
    public String getBirthNumber() {return birthNumber;}
}
