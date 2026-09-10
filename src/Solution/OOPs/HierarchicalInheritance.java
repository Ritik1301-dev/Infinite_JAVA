package Solution.OOPs;
public class HierarchicalInheritance {
    public   static  class Student{
        String name;
        int rollNumber;

        void markAttendence(){
            System.out.println("Attendence marked");
        }
    }
    static class engineeringStudent extends Student {
        void labAttendence(){
            System.out.println(" Computer Lab Attendence");
        }
    }
    static class medicalStudentent extends Student{
        void medicalLabAttendence(){
            System.out.println("Medical Lab Attendence");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.markAttendence();
        engineeringStudent es = new engineeringStudent();
        es.markAttendence();
        es.labAttendence();
        medicalStudentent ms = new medicalStudentent();
        ms.markAttendence();
        ms.medicalLabAttendence();
    }

}

