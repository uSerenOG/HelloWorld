package Dicegame;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Dice {

    static Random gen=new Random();
    int roll() {
        return gen.nextInt(6)+1;
    }

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            Dice d=new Dice();
            System.out.println(i+" "+d.roll());
        }
    }
}
