public class GrunnleggendeKonsepter {
    static void main(String[] args) {
        System.out.println("---variables and datatypes---");
        int number;
        number = 10;
        System.out.println("whole number: " + number);

        double decimal = 5.5;
        System.out.println("decimal number: " + decimal);

        boolean bool = true;
        System.out.println("bool = " + bool);

        String text = "o_o";
        text += " 0_0";
        System.out.println("text: " + text);

        System.out.println("\n---calculations---");
        int sum1 = number + 20;
        System.out.println("int calculation: "+sum1);

        double sum2 = number + decimal;
        System.out.println("int and double calculation: " + sum2);

        int sum3 = (int)(number + decimal);
        System.out.println("typecasting from double to int calculation: " + sum3);

        int divide1 = number/3;
        System.out.println("division with whole numbers: " + divide1);

        double divide2 = number/3.0;
        System.out.println("typical division: " + divide2);

        System.out.println("\n---variable assignment---");
        int variable1 = 42;
        int variable2 = variable1;
        System.out.println("variable 1: " + variable1 + "\nvariable 2: " + variable2);

        variable1 = 123;
        System.out.println("after change:\nvariable 1: " + variable1 + "\nvariable 2: " + variable2);
    }
}
