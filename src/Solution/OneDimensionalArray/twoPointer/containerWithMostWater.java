package Solution.OneDimensionalArray.twoPointer;
import java.util.*;
public class containerWithMostWater {
    static int maxArea(int[]height){
      int leftSide = 0; int rightSide = height.length-1;
      int maxWater = 0;

      while(leftSide<rightSide){
          int width = rightSide-leftSide;
          int h = Math.min(height[leftSide],height[rightSide]);
          int currentWater = width*h;
          maxWater = Math.max(maxWater,currentWater);

          if(height[leftSide] < height[rightSide]){
              leftSide++;
          }else {
              rightSide--;
          }
      }
      return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int height[] = new int[size];

        for(int i=0;i<height.length;i++) {
            System.out.print((i + 1) + "th element : ");
            height[i] = sc.nextInt();
        }
        int ans  = maxArea(height);
        System.out.println(ans);
    }
}
