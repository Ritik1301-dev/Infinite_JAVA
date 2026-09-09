package Solution.OOPs;

public class Car {
    String brand;
    String model;
    int maxSpeed;
    double engineCapacity;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    Car(String a, String b, int c, double d){
        this.brand = a;
        this.model = b;
        this.maxSpeed = c;
        this.engineCapacity = d;
    }
    public static void main(String[] args) {
     Car bmw = new Car("BMW","Sport Car",330,2.5);
        System.out.println(bmw);
    }

}
