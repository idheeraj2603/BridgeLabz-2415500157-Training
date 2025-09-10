import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

      
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {  
            int formulaSum = n * (n + 1) / 2;

          
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Sum using formula   : " + formulaSum);

      
            if (loopSum == formulaSum) {
                System.out.println("✅ Both computations are correct!");
            } else {
                System.out.println("❌ Results do not match. Something is wrong!");
            }
        }

        sc.close();
    }
}
