package Solution.OOPs;

import javax.smartcardio.Card;
import java.util.Scanner;

public class CabService {
    String carType;
    double km , bill;

    CabService(){
        this.carType = "";
        this.km = this.bill = 0.0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter carType : AC or NON AC ");
        this.carType = sc.nextLine();

        System.out.println("Enter km travelled : ");
        this.km = sc.nextDouble();
    }
    void calculate(){
        if(this.carType.equals("AC")) {
            if (km <= 5) this.bill = 150;
            else this.bill = 150 + (this.km-5)*10;
        }else {
            if (km <= 5) this.bill = 120;
            else this.bill = 120 + (this.km-5)*8;
        }
    }
    void display(){
        System.out.println("Car type : " + this.carType);
        System.out.println("Kilometer travelled : "+ this.km);
        System.out.println("Total bill " + this.bill);
    }

    public static void main(String[] args) {
        CabService obj = new CabService();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
