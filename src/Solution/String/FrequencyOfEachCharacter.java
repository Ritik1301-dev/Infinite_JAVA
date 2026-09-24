package Solution.String;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int freq[] = new int[128];
//        for (int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            freq[ch] = freq[ch] + 1;
//        }
//        for (int i=0;i<freq.length;i++){
//            if (freq[i] > 0){
//                System.out.println((char) i + "->" + freq[i]);
//            }
//        }
//

        // if all the character has in the small case

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int freq[] = new int[26];
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-97] = freq[ch-97] + 1;
        }
        for (int i=0;i<freq.length;i++){
            if (freq[i] > 0){
                System.out.println((char) (i + 97 ) + " -> " + freq[i]);
            }
        }
    }
}
