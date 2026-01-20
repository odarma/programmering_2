package packages;
import packages.models.Student;

public class ObjectReferences {
    static void main(String[] args) {
        Student oleE=new Student("Ole-Edvard", "Ørebæk", 28, "123456");
        Student student2 = oleE;
        System.out.printf("Student 1: %s %s\n", oleE.getFirstName(), oleE.getLastName());
        System.out.printf("Student 2: %s %s\n", student2.getFirstName(), student2.getLastName());

        oleE.setLastName("Antonsen");
        System.out.printf("Student 1: %s %s\n", oleE.getFirstName(), oleE.getLastName());
        System.out.printf("Student 2: %s %s\n", student2.getFirstName(), student2.getLastName());
    }
}
