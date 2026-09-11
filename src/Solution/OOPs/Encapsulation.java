package Solution.OOPs;

public class Encapsulation {
        static  class  Student {
            private String name;
            private int rollNumber;
            private double cgpa;
            private String collage;

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", rollNumber=" + rollNumber +
                        ", cgpa=" + cgpa +
                        ", collage='" + collage + '\'' +
                        '}';
            }


            Student(String name, int rollNumber, double cgpa, String collage) {
                this.name = name;
                this.rollNumber = rollNumber;
                this.cgpa = cgpa;
                this.collage = collage;

            }

            // getters and setters
            public String getName() {
                return name;
            }

            public void setName(String name) {
                // we also add validations.
                this.name = name;
            }

        }

        public static void main(String[] args) {
            Student ravi = new Student("Ravi Sharma", 100, 9.9, "MIT");
            System.out.println(ravi);
        }
    }

