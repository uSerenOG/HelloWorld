package Dicegame;

public class Player {
    String name;
    Cup cup=new Cup();
    int points;
    int AntalSlag=0;

    Player (String name){
        this.name=name;
    }

    void turn(){
        cup.roll();
        points=points+cup.getSum();
        AntalSlag=AntalSlag+1;

    }
}
