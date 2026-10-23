package Solution.AdvanceArrayQuestions;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,5,6};
        int arr2[] = {3,4,4,7,9,10};
        int temp [] = new int[arr1.length + arr2.length];
        int i,j,k;
        i=j=k=0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]) temp[k++] = arr1[i++];
            else temp[k++] = arr2[j++];
        }

        while (i < arr1.length){
            temp[k++] = arr1[i++];
        }
        while (j < arr2.length){
            temp[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(temp));
    }
}
