// Queue using Linked List
import java.util.*;

public class Queueusinginkedlist_8_b{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front,rear=null;

    void insert(Scanner sc){
        System.out.print("Enter data: ");
        int val=sc.nextInt();

        Node newnode=new Node(val);

        if(rear==null){
            front=rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }

    void delete(){
        if(front==null){
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted from queue");

        front=front.next;

        if(front==null){
            rear=null;
        }
    }

    void display(){
        if(front==null){
            System.out.println("Queue Empty");
            return;
        }

        Node temp=front;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        Queueusinginkedlist_8_b q=new Queueusinginkedlist_8_b();

        int ch;

        do{
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");

            ch=sc.nextInt();

            switch(ch){
                case 1:
                    q.insert(sc);
                    break;

                case 2:
                    q.delete();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(ch!=4);

        sc.close();
    }
}