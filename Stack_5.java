import java.util.Scanner;

public class Stack_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Stack:");
        int size =sc.nextInt();
        int stack[] = new int[size];
        int top = -1;
        int ch;
        do {
            System.out.println("\n--- Stack Operation ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch(ch){
                case 1: 
                    if(top == stack.length-1){
                        System.out.println("Stack Overflow");
                    } 
                    else{
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        stack[++top] = value;
                        System.out.println("Value Pushed");
                    }
                    break;
                case 2: 
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } 
                    else{
                        System.out.println("Popped: " + stack[top--]);
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack Elements:");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch!= 4);
        sc.close();
    }
}