import java.util.Scanner;

public class DigitsLargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        
        while (number != 0) {
            int digit = number % 10;  digits[index] = digit;
            index++;

            if (index == maxDigit) {
                System.out.println("Reached maximum digit capacity (10 digits). Remaining digits ignored.");
                break;
            }

            number /= 10; // remove last digit
        }

        
        int largest = -1;
        int secondLargest = -1;

       
        for (int i = 0; i < index; i++) {
            int digit = digits[i];
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.print("\nDigits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("No second largest digit found (all digits same).");
        }

        sc.close();
    }
}
