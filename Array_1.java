import java.util.Scanner;

class Array {
    int[] a = new int[20];
    int n;

    void insert(Scanner sc) {
        System.out.print("Enter value: ");
        int v = sc.nextInt();
        a[n++] = v;
    }

    void display() {
        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    void search(Scanner sc) {
        System.out.print("Enter the value to Search: ");
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                System.out.println("Element Found at position " + (i + 1));
                return;
            }
        }
        System.out.println("Element Not Found");
    }

    void delete(Scanner sc) {
        System.out.print("Enter the Position to delete: ");
        int p = sc.nextInt();

        if (p < 1 || p > n) {
            System.out.println("Invalid position!");
            return;
        }

        for (int i = p - 1; i < n - 1; i++)
            a[i] = a[i + 1];

        n--;
        System.out.println("Element Deleted Successfully.");
    }

    void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Array Sorted Successfully.");
    }
}

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        int ch;

        do {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Search 5.Sort 6.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    arr.insert(sc);
                    break;
                case 2:
                    arr.delete(sc);
                    break;
                case 3:
                    arr.display();
                    break;
                case 4:
                    arr.search(sc);
                    break;
                case 5:
                    arr.sort();
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (ch != 6);

        sc.close();
    }
}
