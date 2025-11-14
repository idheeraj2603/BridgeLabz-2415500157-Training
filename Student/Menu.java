package Student;

import java.util.Scanner;

public class Menu implements iMenu {
    @Override
    public void showMenu() {
        System.out.println("\n==============================");
        System.out.println("Welcome to JDBC");
        System.out.println("Student Database Menu");
        System.out.println("1. Insert a Student");
        System.out.println("2. Insert Multiple Students");
        System.out.println("3. Update a Student");
        System.out.println("4. Update Multiple Students");
        System.out.println("5. Delete a Student");
        System.out.println("6. Delete Multiple Students");
        System.out.println("7. Show Students");
        System.out.println("8. Exit");
        System.out.println("==============================");
        System.out.print("Enter your choice: ");
    }
}




