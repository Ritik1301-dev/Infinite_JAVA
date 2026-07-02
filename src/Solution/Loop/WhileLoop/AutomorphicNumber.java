package Solution.Loop.WhileLoop;
import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copyn = n;
        int count = 0;
        while (n>0){
            count ++;
            n/=10;
        }
        int square =copyn*copyn;
        System.out.println(copyn==square%(int)Math.pow(10,count)? "true":"false" );
    }
}
