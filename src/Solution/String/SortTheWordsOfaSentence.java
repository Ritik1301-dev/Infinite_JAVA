package Solution.String;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheWordsOfaSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr [] = str.split(" ");

        for (int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String ans = "";
        for (int i=0;i<arr.length;i++){
            ans += arr[i] + " ";
        }
        System.out.println(ans);
    }
}
