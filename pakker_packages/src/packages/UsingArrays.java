package packages;
import packages.models.Student;
import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        System.out.println("---primitive array---\n");
        int[] intArray = new int[3];
        String intArrayToString = Arrays.toString(intArray);
        System.out.printf("array values after start: %s", intArrayToString);

        intArray[0]=1;
        intArray[1]=2;
        intArray[2]=3;
        String intArrayToString2 = Arrays.toString(intArray);
        System.out.printf("\narray values after change: %s", intArrayToString2);

        Student[] studentArray = new Student[1];
        System.out.println("\nstudent array value after start: "+studentArray[0]);

        studentArray[0] = new Student("bingus", "dingus",30, "098765");
        System.out.println("student object in array name: "+studentArray[0].getFirstName());

        System.out.println("for loop through array");
        for (int i=0; i<intArray.length;i++){
            System.out.println("index " + i + ": "+intArray[i]);
        }
    }
}
