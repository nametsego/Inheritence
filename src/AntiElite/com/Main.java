package AntiElite.com;

public class Main {

    public static void main(String[] args) {

        Bicycle bike = new Bicycle();
        Car car = new Car();

        bike.go();

        System.out.println("A bicycle has " + bike.pedals + " pedals");

        System.out.println("A car has " + car.windows + " windows");
    }
}
