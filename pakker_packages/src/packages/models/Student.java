package packages.models; //egentlig skal skrives med revesert domenenavn (no.hiof.omidka.packages)
public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int age;
    private Course favoriteCourse;

    public Student(String firstName, String lastName, int age, String studentID){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setStudentID(studentID);
    }
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {if (age<0) {this.age = 0;} else this.age = Math.min(age, 120);}
    public void setFavoriteCourse(Course favoriteCourse) {this.favoriteCourse = favoriteCourse;}
    public Course getFavoriteCourse() {return favoriteCourse;}
    public void setStudentID(String studentID) {this.studentID = studentID;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public String getStudentID() {return studentID;}
}
