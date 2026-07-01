package Solution.Loop.ForLoop;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcf = 1;
        int small;
        if(n1<n2) small = n1;
        else small = n2;

        for(int i=1;i<=small;i++){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
