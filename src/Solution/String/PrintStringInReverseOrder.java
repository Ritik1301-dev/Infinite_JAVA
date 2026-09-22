package Solution.String;

import java.util.Scanner;

public class PrintStringInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word : ");
        String s = sc.nextLine();
        String rev = "";
        for (int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
