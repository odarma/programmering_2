package noe;
import noe.moduls.*;

public class UsingStatic {
    static void main(String[] args) {
        Person ola = new Person("ola", "ola", 20);
        Person ole = new Person("ole", "ole", 30);
        System.out.println(Person.getNumPersons());
    }
}
