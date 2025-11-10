
// Default Methods in Interfaces
interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refunded Rs." + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed Rs." + amount + " via PayPal.");
    }
}

public class DefaultMethodsInInterfaces {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        paypal.processPayment(2500);
        paypal.refund(500);
    }
}
