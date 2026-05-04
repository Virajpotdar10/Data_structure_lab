// Program to implement various operations on Doubly linked List

import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Doublylinkedlist {

    Node head = null;

    // Insert at beginning
    void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    // Insert at end
    void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from beginning
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Delete from end
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        if (temp.next == null) {
            head = null;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doublylinkedlist dll = new Doublylinkedlist();

        while (true) {
            System.out.println("\n1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    dll.insertFirst(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    dll.insertLast(sc.nextInt());
                    break;

                case 3:
                    dll.deleteFirst();
                    break;

                case 4:
                    dll.deleteLast();
                    break;

                case 5:
                    dll.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}