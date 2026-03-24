package noe;

public class Recursion {
    static void main(String[] args) {
        int[] numbers = {1,3,3,7};
        printRecursively(numbers,0);
        System.out.println("\n"+sumRecursively(numbers,0));
    }

    public static int sumRecursively(int[] numbers, int index){
        if (index >= numbers.length || index<0){
            return 0;
        } else {
            int number = numbers[index];
            return number + sumRecursively(numbers,index+1);
        }
    }

    public static void printRecursively(int[] numbers, int index){
        if (index >= numbers.length || index<0){
            return;
        } else {
            int number = numbers[index];
            System.out.print(number);
            printRecursively(numbers, index+1);
        }
    }
}
