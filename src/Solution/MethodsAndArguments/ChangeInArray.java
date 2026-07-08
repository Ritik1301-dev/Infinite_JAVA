package Solution.MethodsAndArguments;

import java.util.Arrays;

public class ChangeInArray {
    static void array(int []temp){
        temp[0] = 69;
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
      int[] arr = {10,20,30,40,50};
      array(arr);
        System.out.println(Arrays.toString(arr));
    }
}
