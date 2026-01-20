package week9;

public class VehicleApp {
    public static void main(String[] args) {

        Car car = new Car(101, "Toyota", 3000000, 4, "Petrol");
        Bike bike = new Bike(201, "Yamaha", 400000, 150);

        System.out.println("----- Car Details -----");
        car.displayCarInfo();

        System.out.println("\n----- Bike Details -----");
        bike.displayBikeInfo();
    }
}
