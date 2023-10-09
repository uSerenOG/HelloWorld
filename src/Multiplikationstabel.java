public class Multiplikationstabel {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {

                // System.out.print(i*j+" ");
                System.out.printf("%5d", + j * i);   /* her der laver den en tabel men du bestemmer selv distancen ved tallet 5 eks */
            }
            System.out.println();
        }
    }
}
