
import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        generateException(text);
        handleException(text);
        sc.close();
    }
}
