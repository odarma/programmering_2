public class Constructor {
    public static void main(String[] args) {
        Student student = new Student("bob","joe",
                32,"123");
        System.out.println(student.getFirstName()+" "
                +student.getLastName()+": "
                + student.getAge()+" years "
                + "\nid: "+student.getStudentID());
    }
}

