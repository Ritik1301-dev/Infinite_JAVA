package Solution.OOPs;

public class Abstraction {
    public static void main(String[] args) {

        Bike bike = new ElectricBike();
        bike.start();
        bike.accelerate();
        bike.brake();
    }
}

abstract class Bike{

    static void start() {
        System.out.println("Bike  is starting");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelBike extends Bike  {

    @Override
    void accelerate() {
        System.out.println("Fuel Bike is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel Bike is braking");
    }
}

 class ElectricBike extends Bike {

    @Override
    void accelerate() {
        System.out.println("Electric Bike is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric Bike is braking");
    }
}