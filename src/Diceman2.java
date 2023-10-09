import java.util.Random;

public class Diceman2 {
    public static void main(String[] args) {
        Random gen=new Random();
        int ugedag=gen.nextInt(7)+1;
        switch(ugedag) {
            case 1:
                System.out.print("Mandag");
                break;

            case 2:
                System.out.print("Tirsdag");
                break;

            case 3:
                System.out.print("Onsdag");
                break;

            case 4:
                System.out.print("Torsdag");
                break;

            case 5:
                System.out.print("Fredag");
                break;

            case 6:
                System.out.print("Lordag");
                break;

            case 7:
                System.out.print("Sondag");
                break;
            default:
                System.out.print("Weekend");
        }
    }
}
