package arraylist.moduls;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private Course favoriteCourse;
    private ArrayList<Course> courses =  new ArrayList<>();

    private String birthNumber = "12345678910";

    public Student() {

    }

    public Student(String firstName, String lastName,
                   int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.studentId = studentId;
    }

    public ArrayList<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    /*public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }*/

    public void addToCourses(Course course){
        if (course != null){
            courses.add(course);
        }
    }

    public Course getFavoriteCourse() {
        return favoriteCourse;
    }

    public void setFavoriteCourse(Course favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if (age > 120) {
            this.age = 120;
        }
        else {
            this.age = age;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBirthNumber() {
        return birthNumber;
    }
}
