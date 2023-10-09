import java.util.Scanner;

public class Veksleprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kurs = 0.93;

        System.out.println("Indtast beløb i dollars");
        double usd = input.nextDouble();

        double kommision = 0.02;

        if (kommision < 0.5 )  {
            kommision = 0.5;
        }

        double euro = (usd * kurs) - kommision;

        System.out.println("Beløb i euro efter kommision (komission; " + kommision + " euro): " +  euro + " euro");



            }
}
