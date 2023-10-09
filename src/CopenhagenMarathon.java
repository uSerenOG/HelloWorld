public class CopenhagenMarathon {
    public static void main(String[] args) {

        printCopenhagenMarathon("Peter Adams", "1556", "D");
        printCopenhagenMarathon("Omar Farooq", "1699", "D");
        printCopenhagenMarathon("Lotte Nybo", "843", "B");


    }
    static void printCopenhagenMarathon(String name, String number, String group){
        System.out.println("Dear "+name);

        System.out.println("We are happy to recieve your registration");
        System.out.println("Your start number is:"+number);
        System.out.println("You start in group:"+group);
        System.out.println("Please check in 10 minutes before start");
        System.out.println();

    }
}
