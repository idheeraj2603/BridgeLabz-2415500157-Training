package Student;
import java.sql.Connection;
import java.util.Scanner;

public class Main {
	
	 public static void showMenu() {
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
	
    public static void main(String[] args) {
        iConnection ic = new ConnectionImpl();
        Connection conn = ic.getConnection();
        iStudent st = new StudentImpl(conn);
     
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 : st.insertStudent();
                case 2 : st.insertMultipleStudents();
                case 3 : st.updateStudent();
                case 4 : st.updateMultipleStudents();
                case 5 : st.deleteStudent();
                case 6 :st.deleteMultipleStudents();
                case 7 : st.showStudents();
                case 8 : System.out.println("Exiting... Thank you!");
                default : System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);
    }
}

