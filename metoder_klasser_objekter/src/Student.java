public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int age;

    public Student(String firstName, String lastName, int age, String studentID){
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age<0) {
            this.age = 0;
        } else if (age > 120) {
            this.age = 120;
        } else{
            this.age = age;
        }
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getStudentID() {
        return studentID;
    }
}
