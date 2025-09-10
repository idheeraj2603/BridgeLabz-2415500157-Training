import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for natural number (positive integer)
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            sc.close();
            return;
        }

        // Arrays to hold odd and even numbers (max possible size = number/2 + 1)
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Index trackers
        int evenIndex = 0;
        int oddIndex = 0;

        // Fill odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.println("\nOdd numbers between 1 and " + number + ":");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print even numbers
        System.out.println("\n\nEven numbers between 1 and " + number + ":");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}
