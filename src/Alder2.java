import java.util.Random;

public class Alder2 {
    public static void main(String[] args) {

        Random gen=new Random();

        java.util.Scanner tastatur = new java.util.Scanner(System.in);
        System.out.println("Indtast din alder, afslut med enter");
        int alder = tastatur.nextInt();
        tastatur.nextLine();

        if (alder >= 18)

            System.out.println("Du er myndig");

            else
            System.out.println("Du er ikke myndig");

        System.out.println(alder );

    }
}
