
// Digital Payment Interface
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid Rs." + amount + " via UPI."); }
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid Rs." + amount + " via Credit Card."); }
}

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid Rs." + amount + " via Wallet."); }
}

public class DigitalPaymentInterface {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.pay(500.0);
    }
}
