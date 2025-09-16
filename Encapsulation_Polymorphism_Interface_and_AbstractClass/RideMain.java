import java.util.*;

abstract class RideHailing {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String location;
    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    public double calculateFare(double distance) { return distance * getRatePerKm(); }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    public double calculateFare(double distance) { return distance * getRatePerKm() - 10; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    public double calculateFare(double distance) { return distance * getRatePerKm() + 20; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

public class RideMain {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "Raj", 15));
        rides.add(new Bike("B202", "Amit", 8));
        rides.add(new Auto("A303", "Suresh", 10));
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: " + v.calculateFare(10));
        }
    }
}
