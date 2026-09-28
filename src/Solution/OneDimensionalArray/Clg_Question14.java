package Solution.OneDimensionalArray;

public class Clg_Question14 {
    public static void main(String[] args) {
        int []arr = {5,2,9,2,7,2};
        int key = 2;
        for (int i=arr.length - 1;i>0;i--) {
            if(arr[i] == key){
                System.out.println(i);
                break;
            }
        }
    }
}
