package Solution.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class pratice {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(210);
//        list.add(23550);
//        list.add(232223);
//        list.add(321);
//        list.add(21321);
//        System.out.println(list);
//        System.out.println(list.get(3));
//        list.add(3, 600);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        list.remove(Integer.valueOf(23550));
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(600));
//        list.set(3, 9000);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            int sum = 0;
            while (num > 0){
             int digit = num%10;
             sum += digit*digit;
             num /= 10;
            }
            if (sum == 1){
                System.out.println("Happy Number");
                break;
            }else if (list.contains(sum)){
                System.out.println("Not Happy Number");
            }
            else {
                list.add(sum);
            }
            num = sum;
        }
    }
}
