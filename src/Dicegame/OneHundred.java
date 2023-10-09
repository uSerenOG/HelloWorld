package Dicegame;

public class OneHundred {
    Player p1 = new Player("Bjarke");
    Player p2 = new Player("Martin");
    Player p3 = new Player("Jimmy");

    void play() {
        System.out.println("\t\t\t\t" + p1.name + "\t" + p2.name + "\t" + p3.name);
        while (p1.points < 100 && p2.points < 100 && p3.points < 100) {
            p1.turn();
            p2.turn();
            p3.turn();

            System.out.println("Slag nr :" + p1.AntalSlag + "\t\t" + p1.points + "\t\t" + p2.points + "\t\t" + p3.points);
        }

            if (p1.points > p2.points && p1.points > p2.points) {
                System.out.println(p1.name + " Vandt");

            }
            else if (p2.points > p1.points && p2.points > p2.points) {
                System.out.println(p2.name + " Vandt");

            }
            else if (p3.points > p1.points && p3.points > p2.points) {
                System.out.println(p3.name + " Vandt");

            } else {
                System.out.println("\t\t" + "Det blev en ommer");
            }
        }


    public static void main(String[] args) {
        OneHundred game = new OneHundred();
        game.play();

    }
}


