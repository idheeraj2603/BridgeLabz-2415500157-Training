import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer greater than 0.");
            sc.close();
            return;
        }

        
        String[] results = new String[number + 1]; 

      
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0"; 
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
