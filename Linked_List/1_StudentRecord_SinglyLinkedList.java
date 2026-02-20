
import java.util.Scanner;

class Student {
    int roll, age;
    String name, grade;
    Student next;

    Student(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecord_SLL {
    static Student head = null;

    static void addAtEnd(int roll, String name, int age, String grade) {
        Student newNode = new Student(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Student temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    static void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.roll == roll) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    static void search(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    static void updateGrade(int roll, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    static void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addAtEnd(1, "Aman", 20, "A");
        addAtEnd(2, "Riya", 21, "B");
        updateGrade(2, "A+");
        deleteByRoll(1);
        display();
    }
}
