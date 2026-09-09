package Solution.OOPs;
import java.util.Scanner;
public class RailwayTicket {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    public void accept() {
        // Write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Customer name ");
        name = sc.nextLine();
        System.out.println("Enter coach ");
        coach = sc.nextLine();
        System.out.println("Enter Customer Mobile Number ");
        mobno = sc.nextLong();
        System.out.println("Enter Amount ");
        amt = sc.nextInt();
    }
    public void update() {
        // Write your code here
        if(coach.equals("First_AC")){
            totalamt = 700 + amt;
        }else if(coach.equals("Second_AC")){
            totalamt = 500 + amt;
        }else if(coach.equals("Third_AC")){
            totalamt = 250 + amt;
        }else{
            totalamt = amt;
        }
    }

    public void display() {
        // Write your code here
        System.out.println("NAME: "+ name);
        System.out.println("COACH: "+ coach);
        System.out.println("MOBILE NUMBER: "+ mobno);
        System.out.println("TOTAL AMOUNT: "+ totalamt);
    }
    public static void main(String args[]){
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}