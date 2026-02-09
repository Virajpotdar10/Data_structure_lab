import java.util.*;

public class SearchProgram_3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\nList: " + Arrays.toString(arr));
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element to search: ");
                    int value = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == value) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found");
                    }
                    break;

                case 2:
                    System.out.print("Enter element to search: ");
                    value = sc.nextInt();

                    Arrays.sort(arr);
                    System.out.println("Sorted List: " + Arrays.toString(arr));

                    int low = 0;
                    int high = n - 1;
                    found = false;

                    while (low <= high) {
                        int mid = (low + high) / 2;

                        if (arr[mid] == value) {
                            System.out.println("Element found at position " + (mid + 1));
                            found = true;
                            break;
                        } else if (value < arr[mid]) {
                            high = mid - 1;
                        } else {
                            low = mid + 1;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found in given list");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
