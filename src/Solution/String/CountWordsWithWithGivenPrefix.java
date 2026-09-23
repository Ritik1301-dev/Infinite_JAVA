package Solution.String;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordsWithWithGivenPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String : ");
        int size = sc.nextInt();
        sc.nextLine();
        String str [] = new String[size];
        for(int i=0;i<str.length;i++){
            System.out.println("Enter " + (i+1) + "th element ");
             str[i] = sc.nextLine();
        }
        System.out.println("Enter the Prefix : ");
        String prefix= sc.nextLine();
        int count = 0;
        for (String Word : str){
            if (Word.startsWith(prefix)) count++;
        }
        System.out.println("Outcomes : " + count);
    }
}
