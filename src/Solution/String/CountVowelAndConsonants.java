package Solution.String;

import java.util.Scanner;

public class CountVowelAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a value : ");
        String str = sc.nextLine();
        int v=0 ,c=0, s=0;
     for (int i=0;i<str.length();i++){
         char ch = str.charAt(i);
         switch (ch){
             case 'a','e','i','o','u'->v++;
             case ' '->s++;
             default->c++;
         }
     }
        System.out.println("Vowel : " + v);
        System.out.println("Consonant : " + c);
        System.out.println("Spaces : "+ s);
    }
}
