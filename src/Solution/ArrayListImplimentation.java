package Solution;

public class ArrayListImplimentation {
    int arr[];
    int size;
    int capacity;
    ArrayListImplimentation(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }
    void add(int ele){
        if(size == arr.length)  grow();
        arr[size] = ele;
        size ++;
    }

    void add(int ele ,int index )throws Exception{
        if(index < 0 || index > size) {
            throw new Exception("ArrayOutOfBoundException");
        }
        if (size == arr.length) grow();
        for (int i=size;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = ele;
        size++;
    }

    int get( int index ) throws Exception{
        if(index < 0 || index >= size) {
            throw new Exception("ArrayOutOfBoundException");
        }
        return arr[index];
    }

    void remove(int index)  throws Exception{
        if (index < 0 || index >= size) {
            throw new Exception("ArrayOutOfBoundException");
        }
      for (int i=index;i<size-1;i++){
            arr[i] = arr[i+1];
      }
      size--;
    }

    void set(int ele , int index) throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("ArrayOutOfBoundException");
        }
      if (index == size){
          arr[index] = ele;
          size++;
      }
      else arr[index] = ele;
    }
    void grow(){
        int newCapacity = capacity + (capacity/2);
        int temp [] = new int[newCapacity];
        for (int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        capacity = newCapacity;
    }

    void print(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)  throws  Exception{
       ArrayListImplimentation list = new ArrayListImplimentation(10);



        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
        System.out.println();
        list.set(100,5);
        list.print();

    }
}
