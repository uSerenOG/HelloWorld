public class Main{
    public static void main(String[] args) {
       int width, length, areal;
       width = 5;
       length = 8;

       areal = width*length;
       System.out.println("arealet er :" + areal);



       // opgave 2
        int x, y;
        x = 7;
        y = 3*x*x+6*x+9;

        System.out.println("y = " + y);


        // opgave 3
        double usd, euro, kurs;
        // den regner det for os.
        usd = 526;
        kurs = 0.95;
        euro = usd * kurs;

        System.out.println( usd + " usd i euro = " + euro);


        // opgave 4
        double nummer_1, nummer_2, nummer_3, sum, gns;
        // her der vælger den et tilfældigt nummer
        nummer_1=Math.random();
        nummer_2=Math.random();
        nummer_3=Math.random();

        sum =nummer_1+nummer_2+nummer_3;   /* viser summen af de 3 tilfældig */
        gns =nummer_1+nummer_2+nummer_2/3;   /* her viser den gennesmnittet for de tilfældige */

        System.out.println("Sum total " + sum);
        System.out.println("Gns total " + gns);




    }
}



