package Solution.OneDimensionalArray;

public class Clg_Question7 {
    public static void main(String[] args) {
        int [] arr  = {5,2,9,1,7,3};
        int key = 9;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
