package Solution.OOPs;
public class Student {
    int age;
    String name;
    long contactNo;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }
    Student(int a, String n , long c ){
        age = a;
        name = n;
        contactNo = c;

    }
    public static void main(String[] args) {
        Student ravi = new Student(21,"Ravi Gupta",98765432);
        System.out.println(ravi);
    }
}
