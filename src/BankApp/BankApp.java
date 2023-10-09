package BankApp;

public class BankApp{
public static void main(String[]args) {
    double konto_1 = 50.25;
// double kan køre med kommtal og ikke kun hele tal

    int konto_nr=1;
// variblen for konto_nr er 1

    String name_1="Magnus Svensson";


    double konto_2;
    int konto_nr_2;
    String name_2;

    konto_2=100;
    konto_nr_2=2;
    name_2="Malthe Randrup";

    System.out.println("Før");
    System.out.println("konto "+konto_nr+": "+name_1+" "+konto_1);
    System.out.println("konto "+konto_nr_2+": "+name_2+" "+konto_2);

    konto_1=konto_1+100;  /* her tager vi konto 1 og tilføjer 100kr */
    konto_1=konto_1*1.05;  /* her der tager vi konto 1 og tilføjer en rente */

    System.out.println("Efter");
    System.out.println("konto "+konto_nr+": "+name_1+" "+konto_1);
    System.out.println("konto "+konto_nr_2+": "+name_2+" "+konto_2);


    double samlet_beholdning=konto_1+konto_2; /* her der har vi samlet det hele fra de 2 kontier */
    System.out.println("Samlet beholdning " + samlet_beholdning);

    double gns_indlaen=samlet_beholdning/2;  /* her der finder vi gennemsnit på hvad den enkelte har stående */
    System.out.println("gns_indlaen " + gns_indlaen);

    }
}
