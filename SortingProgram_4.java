// Program to Implement Sorting Techniques
// 1. Bubble sort & Selection Sort

import java.util.Scanner;

public class SortingProgram_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("\n1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int t = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = t;
                        }
                    }
                }

                System.out.println("Sorted array using Bubble Sort:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            case 2:
                for (int i = 0; i < size - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < size; j++) {
                        if (arr[j] < arr[minIndex]) {
                            minIndex = j;
                        }
                    }

                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }

                System.out.println("Sorted array using Selection Sort:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
        s.close();
    }
}
