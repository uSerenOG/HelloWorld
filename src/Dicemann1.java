import java.util.Random;

public class Dicemann1 {
    public static void main(String[] args) {

        Random gen=new Random();
        int dice=gen.nextInt(6)+1;       /* den tager nu tallene 1-6. Derfor +1 */
        String activity="";

        System.out.println("Dicemann1 ");

        if (dice==1) {
            activity="Breakfast ";
        }
        if (dice==2) {
            activity="Study ";
        }
        if (dice==3) {
            activity="Swim ";
        }
        if (dice==4) {
            activity="Go fishing ";
        }
        if (dice==5) {
            activity="Call mom ";
        }
        if (dice==6) {
            activity="Go back to bed ";
        }

        System.out.println(activity);
        System.out.println("Goodbye");

    }
}
