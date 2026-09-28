package Solution.OneDimensionalArray;

public class Clg_Question13 {
    public static void main(String[] args) {
        int []arr = {5,2,9,2,7,2};
        int key = 2;
        for (int i=0;i<arr.length;i++) {
            if(arr[i] == key){
                System.out.println(i);
                break;
            }
        }

    }
}
