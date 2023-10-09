import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {

        Random gen = new Random();     /* en tildeling ligesom a=2. Du tildeler new random */
        int tal = gen.nextInt(2);

        System.out.println("tal = " + tal);

        if (tal == 0) {
            System.out.println("Plat ");
            System.out.println("Tillykke du vandt ");
        } else {
            System.out.println("Krone ");
            System.out.println("Tillykke du vandt ");
        }
        System.out.println("Tak for i dag ");
    }
}
