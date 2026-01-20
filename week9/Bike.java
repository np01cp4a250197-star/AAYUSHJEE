package week9;

public class Bike extends Vehicle {
    private int engineCapacity;

    // Constructor using super
    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    // Calculate final price (basePrice + tax)
    public double calculateFinalPrice() {
        return basePrice + super.calculateTax();
    }

    public void displayBikeInfo() {
        super.displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
