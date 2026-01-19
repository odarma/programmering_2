import java.util.Scanner; //oversetter-metode

public class CalculateWeightOnMoon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //lager en Scanner-objekt som tar inn rådata fra tastatur som parameter og oversetter rådata til en menneskelig, lesbart datatype
        System.out.println("skriv din vekt på jorda under:");

        double weightOnEarth = input.nextDouble(); //leser av/scanner neste token/data som double (desimaltall)
        double weightOnMoon = weightOnEarth*0.165;
        IO.println("din vekt på månen: "+weightOnMoon);

        input.close(); //stopper avlesing for sikkerhetsskyld hvis scanneren ikke selv stoppa
    }
}
