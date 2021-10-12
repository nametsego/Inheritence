package AntiElite.com;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Bicycle bike = new Bicycle();
        Car car = new Car();
        Skateboard skateboard = new Skateboard();



        vehicle.go();

        bike.go();

        car.stop();

        skateboard.go();

        System.out.println("A bicycle has " + bike.pedals + " pedals");

        System.out.println("A car has " + car.windows + " windows");

        System.out.println("A skateboard has " + skateboard.wheels + " wheels and " + skateboard.gripTape + " grip tape for safety");
    }
}
