package Solution.OOPs;

import java.util.Scanner;

public class BankAccount {
    String name;
    long accNo;
     private  double balance;
    double interest;
    BankAccount(){
        this.name = "";
        this.accNo = 0;
        this.balance = 0.0;
        this.interest = 0.0;
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of User ");
        name = sc.nextLine();
        System.out.println("Enter the Account Number ");
        accNo = sc.nextLong();
        System.out.println("Enter the balance ");
        balance = sc.nextDouble();
    }
     void calculate(){
        if( balance<=10000) this.interest = balance * 5 / 100;
        else interest = balance * 7 / 100;
    }
    void display(){
        System.out.println("User name : "+ name);
        System.out.println("Account number : "+ accNo);
        System.out.println("Balance : "+ balance);;
        System.out.println("Interest : " + interest);
    }
    public static void main(String[] args) {
      BankAccount obj = new BankAccount();
      obj.accept();
      obj.calculate();
      obj.display();
    }
}
