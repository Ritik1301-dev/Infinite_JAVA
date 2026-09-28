package Solution.OneDimensionalArray;

public class Clg_Question12 {
    public static void main(String[] args) {
      int   arr1[] = {1,2,3,4};
       int arr2[] = {1,2,5,4};
        boolean isEqual = true;
        if(arr1.length != arr2.length){
            isEqual = false;
        }
        for (int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                isEqual = false;
                break;
            }
            else {
                isEqual = true;
            }

        }
        System.out.println(isEqual);
    }
}
