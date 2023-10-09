package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {

        Account a1=new Account("Joe Pass", 5);
        Account a2=new Account("Jimmy Hendrix", 7);

        a1.deposit(100);
        a1.withdraw(50);
       // a1.setOwner("Magnus");

        a1.printTransactions();
        System.out.println();
        a2.printTransactions();
    }
}

class Account {
  private  static int noOfAccounts=0;
  private  int accountNo;
  private  String owner;
  private  double balance;         // Indestående
  private  double interest;        // årlig rente i %
    ArrayList<Transaction> transactions=new ArrayList<Transaction>();

    Account(String ow, double ir){      /* Denne constructor SKAL hede det samme som klassen */
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        interest=ir;
        balance=0;

    }
    void setOwner(String newName){
        owner=newName;
    }

    void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat", amount, balance));
    }

    void withdraw(double amount) {
        balance = balance - amount;
        transactions.add(new Transaction("Hævet", amount, balance));
    }

    void anualInterest(){
        double amount=balance*interest/100;
        balance=balance+amount;
        transactions.add(new Transaction("Renter", amount, balance));

    }
    void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\t\tDato\t\tBeløb\tSaldo");
      for (Transaction t: transactions)
        System.out.println(t);
    }

    @Override
    public String toString(){
        return "Kontonr: "+accountNo+"\t"+owner+"\t";
    }

}

class Transaction {
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance) {
        this.text = text;
        this.amount = amount;
        this.newBalance = newBalance;
        date = LocalDate.now();
    }
        @Override
        public String toString() {
            return (text+"\t\t"+date +"\t"+amount+"\t"+ newBalance);
        }

    }

