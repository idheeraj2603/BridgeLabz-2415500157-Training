package Student;
import java.sql.*;
import java.util.Scanner;

public class StudentImpl implements iStudent {
    private Connection conn;
    private Scanner sc = new Scanner(System.in);

    public StudentImpl(Connection conn) {//dependency injection sstudent depeendnet connection 
        this.conn = conn;
    }

    @Override
    public void insertStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.executeUpdate();
            System.out.println("✅ Student inserted successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void insertMultipleStudents() {
        System.out.print("How many students to insert? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insertStudent();
        }
    }

    @Override
    public void updateStudent() {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new name: ");
            String name = sc.next();
            System.out.print("Enter new age: ");
            int age = sc.nextInt();

            String query = "UPDATE students SET name=?, age=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Updated!" : "❌ No record found.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void updateMultipleStudents() {
        System.out.print("How many students to update? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            updateStudent();
        }
    }

    @Override
    public void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Deleted!" : "❌ No record found.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void deleteMultipleStudents() {
        System.out.print("How many students to delete? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            deleteStudent();
        }
    }

    @Override
    public void showStudents() {
        try {
            String query = "SELECT * FROM students";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("ID\tName\tAge");
            System.out.println("--------------------");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

