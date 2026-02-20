
// InventoryManagement_SLL
import java.util.*;

class Node {
    int id;
    String name;
    Node next, prev;

    Node(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class InventoryManagement_SLL {
    static Node head = null, tail = null;

    static void add(int id, String name) {
        Node newNode = new Node(id, name);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void remove(int id) {
        Node temp = head;
        while (temp != null && temp.id != id)
            temp = temp.next;

        if (temp == null) return;

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
        else
            tail = temp.prev;
    }

    static void search(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    static void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        add(1,"Sample1");
        add(2,"Sample2");
        remove(1);
        search(2);
        displayForward();
    }
}
