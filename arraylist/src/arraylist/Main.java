package arraylist;
import arraylist.moduls.*;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        System.out.println("---integer arraylist---");
        ArrayList<Integer> intArrayList = new ArrayList<>();
        System.out.println("list size: "+intArrayList.size());
        intArrayList.add(500);
        intArrayList.add(35);
        intArrayList.add(89);
        System.out.println("list size: "+intArrayList.size());
        System.out.println("second number in list: "+intArrayList.get(1));
        intArrayList.remove(1);
        System.out.println("second number in list after change: "+intArrayList.get(1));

        System.out.println("---for each-loop---");
        for (Integer element : intArrayList){
            System.out.println(element);
        }

        System.out.println("---for each-loop reversed loop---");
        for (Integer element:intArrayList.reversed()){
            System.out.println(element);
        }

        System.out.println("---student arraylist---");
        ArrayList<Student> student = new ArrayList<>();
        Student ole = new Student("Ole-Edvard","Ørebæk",28,"123456");
        Student john = new Student("John","Doe",50,"654321");
        Student bingus = new Student("Bingus","Dingus",1,"123098");

        student.add(ole);
        student.add(john);
        student.add(bingus);
        System.out.println("student list size: "+student.size());
        student.remove(bingus);


    }
}
