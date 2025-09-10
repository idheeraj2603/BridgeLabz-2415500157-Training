import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeCount = 10;

        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];

        double[] bonuses = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];

              double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Please re-enter details for Employee " + (i + 1));
                i--; 
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < employeeCount; i++) {
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05; // 5%
            } else {
                bonus = salaries[i] * 0.02; // 2%
            }

            double newSalary = salaries[i] + bonus;

            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salaries[i] +
                    " | Bonus: " + bonuses[i] +
                    " | New Salary: " + newSalaries[i]);
        }

        System.out.println("\nSummary for Company Zara:");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
