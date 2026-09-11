package Solution.OOPs;

interface Bike {

    void start();
    void accelerate();
    void brake();

    public static void main(String[] args) {

        Bike bike = new FuelBike();

        bike.start();
        bike.accelerate();
        bike.brake();
    }
}


class FuelBike implements Bike {

    @Override
    public void start() {
        System.out.println("Fuel Bike is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel Bike is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fuel Bike is braking");
    }
}


class ElectricBike implements Bike {

    @Override
    public void start() {
        System.out.println("Electric Bike is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Bike is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric Bike is braking");
    }
}