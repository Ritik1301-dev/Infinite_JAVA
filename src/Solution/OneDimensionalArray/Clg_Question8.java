package Solution.OneDimensionalArray;

public class Clg_Question8 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 4, 7};
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
            int countOdd = arr[arr.length-1] - count;
            System.out.println("Even value : " + count);
            System.out.println("Odd value : " + countOdd);
    }
}
