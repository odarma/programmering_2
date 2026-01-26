package arraylist;
import arraylist.moduls.*;

public class StudentWithCourses {
    public static void main(String[] args) {
        Student ole = new Student("Ole-Edvard","Ørebæk",28,"123456");
        Course prog2 = new Course("programmering 2", "ITF10619",10);
        Course databaser = new Course("databasesystemer", "ITF12345",10);
        ole.addToCourses(prog2);
        ole.addToCourses(databaser);
        for (Course course:ole.getCourses()){
            System.out.println(course.getCourseName());
        }
    }
}