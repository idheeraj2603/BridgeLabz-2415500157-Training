class Product {
    private static double discount = 10.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            double finalPrice = price * quantity * (1 - discount / 100);
            System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000, 1);
        Product p2 = new Product("P102", "Mouse", 1000, 2);
        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(20);
        p1.displayDetails();
        p2.displayDetails();
    }
}
