package Experiment_4;
import java.util.*;
public class Insertion_Merge {

    static void mergeSort(int arr[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    static void merge(int arr[], int l, int mid, int h) {
        int temp[] = new int[h - l + 1];
        int i = l, j = mid + 1;

        for (int k = 0; k < temp.length; k++) {

            if (i > mid) {
                temp[k] = arr[j++];
            } 
            else if (j > h) {
                temp[k] = arr[i++];
            } 
            else if (arr[i] <= arr[j]) {
                temp[k] = arr[i++];
            } 
            else {
                temp[k] = arr[j++];
            }
        }

        for (int k = 0; k < temp.length; k++) {
            arr[l + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter values:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("\n1. Insertion Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("\nList:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    for (int i = 1; i < size; i++) {
                        int value = arr[i];
                        for (int j = i - 1; j >= 0; j--) {
                            if (arr[j] > value) {
                                arr[j + 1] = arr[j];
                                arr[j] = value;
                            }
                        }
                    }

                    System.out.println("\nSorted using Insertion:");
                    for (int i = 0; i < size; i++)
                        System.out.print(arr[i] + " ");
                    break;

                case 2:
                    System.out.println("\nList:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    mergeSort(arr, 0, size - 1);

                    System.out.println("\nSorted using Merge:");
                    for (int i = 0; i < size; i++)
                        System.out.print(arr[i] + " ");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Wrong input!");
                    sc.close();
            }
        }
    }
}
