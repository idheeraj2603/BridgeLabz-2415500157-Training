import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {   
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();

            if (num <= 0) {   
                break;
            }

            tot
