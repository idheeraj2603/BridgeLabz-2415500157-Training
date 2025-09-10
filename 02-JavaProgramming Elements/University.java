public class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discount;

        System.out.println(
            "The Discount is INR " + discount + "\n" +
            "The Discounted Price the student will pay is INR " + discountedPrice
        );
    }
}
