package packages;
import packages.models.Course;
import packages.models.Student;

public class ObjectInObject {
    static void main(String[] args) {
        Student oleE = new Student("Ole-Edvard", "Ørebæk", 28, "123456");
        Course programming2 = new Course("Programming 2", "ITF10619", 10);
        oleE.setFavoriteCourse(programming2);
        Course oleEsFavoriteCourse = oleE.getFavoriteCourse();
        System.out.printf("Ole-Es favorite course: %s", oleEsFavoriteCourse.getCourseName());

        programming2.setCourseName("Programming 2077");
        System.out.printf("\nCourse reference after change: %s", oleEsFavoriteCourse.getCourseName());
        System.out.printf("\nCourse reference in Student-object after change: %s",oleE.getFavoriteCourse().getCourseName());
    }
}
