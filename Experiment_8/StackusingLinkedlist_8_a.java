import java.util.*;

public class StackusingLinkedlist_8_a {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    void push(Scanner sc){
        System.out.print("Enter Data: ");
        int val = sc.nextInt();

        Node newnode = new Node(val);
        newnode.next = top;
        top = newnode;

        System.out.println("Value " + val + " pushed into stack");
    }

    void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.data + " popped from stack");
        top = top.next;
    }

    void display(){
        if(top == null){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack: ");
        Node temp = top;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    public static void main(String args[]){

        StackusingLinkedlist_8_a s = new StackusingLinkedlist_8_a();
        Scanner sc = new Scanner(System.in);

        int ch;

        do{
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    s.push(sc);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(ch != 4);

        sc.close();
    }
}