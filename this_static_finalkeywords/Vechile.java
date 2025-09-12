class Vehicle {
    private static double registrationFee = 5000;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("REG101", "Arjun", "Car");
        Vehicle v2 = new Vehicle("REG102", "Meena", "Bike");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(7000);
        v1.displayDetails();
        v2.displayDetails();
    }
}
