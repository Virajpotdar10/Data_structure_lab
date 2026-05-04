// // Program to implement various operations on Singly linked List
// package Experiment_7;
// import java.util.Scanner;

// public class Singlylinkedlist7 {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     Node head = null;

//     void insertAtFirst(Scanner sc) {
//         System.out.print("Enter data: ");
//         int val = sc.nextInt();

//         Node newNode = new Node(val);
//         newNode.next = head;
//         head = newNode;
//     }

//     void insertAtLast(Scanner sc) {
//         System.out.print("Enter data: ");
//         int val = sc.nextInt();

//         Node newNode = new Node(val);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node t = head;
//             while (t.next != null) {
//                 t = t.next;
//             }
//             t.next = newNode;
//         }
//     }

//     void deleteFirst() {
//         if (head == null) {
//             System.out.println("List is empty");
//         } else {
//             head = head.next;
//         }
//     }

//     void deleteLast() {
//         if (head == null) {
//             System.out.println("List is empty");
//         } else if (head.next == null) {
//             head = null;
//         } else {
//             Node t = head;
//             while (t.next.next != null) {
//                 t = t.next;
//             }
//             t.next = null;
//         }
//     }

//     void display() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         Node t = head;
//         while (t != null) {
//             System.out.print(t.data + " -> ");
//             t = t.next;
//         }
//         System.out.println("Null");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Singlylinkedlist7 sl = new Singlylinkedlist7();
//         int choice;
//         do {
//             System.out.println("\n--- MENU ---");
//             System.out.println("1. Insert at First");
//             System.out.println("2. Insert at Last");
//             System.out.println("3. Delete First");
//             System.out.println("4. Delete Last");
//             System.out.println("5. Display");
//             System.out.println("6. Exit");

//             System.out.print("Enter choice: ");
//             choice = sc.nextInt();

//             switch (choice) {

//                 case 1:
//                     sl.insertAtFirst(sc);
//                     break;

//                 case 2:
//                     sl.insertAtLast(sc);
//                     break;

//                 case 3:
//                     sl.deleteFirst();
//                     break;

//                 case 4:
//                     sl.deleteLast();
//                     break;

//                 case 5:
//                     sl.display();
//                     break;

//                 case 6:
//                     System.out.println("Exit");
//                     break;

//                 default:
//                     System.out.println("Invalid choice");
//             }

//         } while (choice != 6);

//         sc.close();
//     }
// }


import java.util.*;

public class Singlylinkedlist7{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    void insertAtFirst(Scanner sc){
        System.out.print("Enter Data:");
        int val=sc.nextInt();
        Node newnode = new Node(val);
          newnode.next=head;
          head =newnode;
    }
    void insertAtLast(Scanner sc){
        System.out.print("Enter data");
        int val=sc.nextInt();
        Node newnode=new Node(val);
        newnode.next=head;
        if(head ==null){
            head= newnode;
        } else{
           Node t=head;
            while(t.next!=null){
                t=t.next;
            }  
            t.next=newnode;
        }   
    }
    void deleteFirst(){
        if(head==null){
        System.out.println("List is Empty");
    }
    }

    void display(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node t =head;
            while(t!=null){
                System.out.print(t.data+" ");
                t=t.next;
            }
        }
    }
    public static void main(String[] args){
            int ch;
            Singlylinkedlist7 s=new Singlylinkedlist7();
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Insert at first");
        System.out.println("2.Insert at last");
        System.out.println("3.Delete at first");
        System.out.println("4.Delete at Last");
        System.out.println("5.Exit");
        System.out.println("Enter your Choice:");
         ch=sc.nextInt();
        switch(ch){
            case 1 :
                s.insertAtFirst(sc);
                break;
            case 2 :
                s.insertAtLast(sc);
                break;
            case 3 :
                s.deleteFirst();
                break;
            case 4 :
                break;
            case 5 :
                System.out.print("Existing program....");
                break;
            default:
                System.out.print("Invalid Choice");
            }
        }while(ch!=5);
    }
    // sc.close();
}
