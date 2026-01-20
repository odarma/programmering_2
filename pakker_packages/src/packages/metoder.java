package packages; //egentlig skal skrives med revesert domenenavn (no.hiof.omidka.packages)
public class metoder {
    public static void main(String[] args) {


        System.out.println("\n---void method---");
        tellTil(12);

        boolean myndig = erMyndig(20);
        System.out.println("20 is a legal age: " + myndig);

        boolean ikkeMyndig = erMyndig(15);
        System.out.println("15 is a legal age: "+ikkeMyndig);
    }
    public static boolean erMyndig(int alder){
        if (alder>=18){return true;}
        else{return false;}
    }
    public static void tellTil(int nummer){
        for (int i = 1; i <= nummer; i++){
            System.out.println(i);
        }
    }
}
