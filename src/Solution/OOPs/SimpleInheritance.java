package Solution.OOPs;

public class SimpleInheritance {

    public  static  class Student{
        String name;
        int rollNumber;

        void markAttendence(){
            System.out.println("Attendence marked");
        }
    }
    static class engineeringStudent extends Student {
        void labAttendence(){
            System.out.println("Lab Attendence");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.markAttendence();
        engineeringStudent es = new engineeringStudent();
        es.markAttendence();
        es.labAttendence();

    }

}

