import javax.swing.*;
import java.util.Random;

public class Dicemann2 {
    public static void main(String[] args) {

        Random gen = new Random();
        int dice;     /* den tager nu tallene 1-6. Derfor +1 */
        String activity = "";
        int answer;
        boolean keepgoing = true;
        System.out.println("Dicemann Loop");

        while (keepgoing) {
            dice = gen.nextInt(6) + 1;

            if (dice == 1) {
                activity = "Breakfast ";
            }
            if (dice == 2) {
                activity = "Study ";
            }
            if (dice == 3) {
                activity = "Swim ";
            }
            if (dice == 4) {
                activity = "Go fishing ";
            }
            if (dice == 5) {
                activity = "Call mom ";
            }
            if (dice == 6) {
                activity = "Go back to bed ";
            }
            System.out.println(activity);

          //  if (dice == 6) keepgoing = false;


            answer=JOptionPane.showConfirmDialog(null, activity+"\n Try again ?", "Dicemann Lopp", JOptionPane.YES_NO_OPTION);
            if (answer==JOptionPane.NO_OPTION) keepgoing=false;

           // System.out.println("Goodbye");

        }
    }
}

