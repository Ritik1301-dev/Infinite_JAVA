package Solution.Clq_Questions;
import java.util.*;
public class Queue {
   /*  public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.peek());  // 10 (smallest ,only looks )
        System.out.println(pq.poll());  // 10   10  ( remove it )
        System.out.println(pq.poll());  // 20
        System.out.println(pq.poll());  // 30
    }  */


 /*   public static void main(String[] args) {
        // Max heap

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }    */


     /*  //  Custom  Object
       static class Student {
        String name;
        int marks ;
        Student(String name , int marks){
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(((a,b) -> b.marks));
        pq.add(new Student("Riya", 70));
        pq.add(new Student("Aman", 90) );
        pq.add(new Student("Neha", 80));

        while (!pq.isEmpty()){
            Student s = pq.poll();
            System.out.println(s.name + " " + s.marks);
        }
    }  */

      /*   public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);
    }   */

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 50};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert all elements into PriorityQueue
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        // Remove k-1 smallest elements
        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        // Kth smallest element
        System.out.println(k + "rd smallest element: " + pq.peek());
         }
    }
