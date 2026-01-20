package week9;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    // Constructor using super
    public Car(int vehicleId, String brand, double basePrice,
               int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    // Calculate final price (basePrice + tax + 5% luxury charge)
    public double calculateFinalPrice() {
        double tax = super.calculateTax();
        double luxuryCharge = basePrice * 0.05;
        return basePrice + tax + luxuryCharge;
    }

    public void displayCarInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
