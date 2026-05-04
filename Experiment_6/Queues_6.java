
import java.util.*;

class Queues_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Queue:");
        int size = sc.nextInt();
        int queue[] = new int[size];
        int front = -1, rear = -1;

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (rear == size - 1) {
                        System.out.println("Queue is full !");
                    } else {
                        System.out.print("Enter number: ");
                        int num = sc.nextInt();
                        if (front == -1)
                            front = 0;
                        rear++;
                        queue[rear] = num;
                        System.out.println("Inserted: " + num);
                    }
                    break;

                case 2:
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Removed: " + queue[front]);
                        front++;
                    }
                    break;

                case 3:
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.print("Queue: ");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
