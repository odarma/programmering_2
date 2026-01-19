public class Objects {
    public static void main(String[] args) {
        System.out.println("\n---student 1---");
        Student student1 = new Student("bob","job", 32, "123");
        student1.setFirstName("bob");
        student1.setLastName("job");
        student1.setAge(32);
        student1.setStudentID("1234");
        System.out.println(student1.getFirstName()+" "
                +student1.getLastName()+": "
                + student1.getAge()+" years "
                + "\nid: "+student1.getStudentID());
        /*
        System.out.println(student1);
        student1.firstName = "Ole-Edvard";
        student1.lastName = "Ørebøk";
        student1.age = 28;
        student1.studentID = 123;
        System.out.println("first name: "+student1.firstName+"\nlast name: "+student1.lastName);

        System.out.println("\n---student 2---");
        Student student2 = new Student();
        System.out.println(student2);
        student2.firstName = "John";
        student2.lastName = "Doe";
        student2.age = 50;
        student2.studentID = 456;
        System.out.println("first name: "+student2.firstName+"\nlast name: "+student2.lastName);
        */

        System.out.println("\n---Course---");
        Course programming2 = new Course();
        programming2.name = "programmering 2";
        programming2.code = "ITF10619";
        programming2.studyPoints = 10;
        System.out.println("course name: "+programming2.name
                +"\ncode: "+programming2.code
                +"\nStudy points: "+programming2.studyPoints);
    }
}
