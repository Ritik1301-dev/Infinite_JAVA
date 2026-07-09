package Solution.SearchingAlgorithm;
public class LinearSearch {
       static int linearSearch(int []arr, int target){
           for (int i=0;i<arr.length;i++){
               if (arr[i]==target) return i;
           }
           return -1;
       }
    public static void main(String[] args) {
           int [] arr = {123,543,344,65,322,56,7,78888,8765};
           int target = 788;
           int index = linearSearch(arr,target);
           if(index == -1) System.out.println("Target Not Found");
           else System.out.println("Target Found at " + index +  "th index" );
    }
}
