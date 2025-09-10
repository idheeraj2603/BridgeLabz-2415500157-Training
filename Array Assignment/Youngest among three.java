import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String[] names = {"Amar", "Akbar", "Anthony"};

        
        int[] ages = new int[3];
        double[] heights = new double[3];

       
        System.out.println("Enter age and height for Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " Age: ");
            ages[i] = sc.nextInt();
            System.out.print(names[i] + " Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

       
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

      
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        sc.close();
    }
}
