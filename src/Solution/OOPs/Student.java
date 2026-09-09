package Solution.OOPs;
public class Student {
    String name;
    String branch;
    double cgpa;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    Student(String a, String b , double c ){
       this.name = a;
       this.branch = b;
       this.cgpa = c;
    }
    public static void main(String[] args) {
        Student putin  = new Student("Putin","Russia",9.99);
        System.out.println(putin);
    }
}
