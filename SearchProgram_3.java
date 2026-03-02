// import java.util.*;

// public class SearchProgram_3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         while (true) {
//             System.out.println("\nList: " + Arrays.toString(arr));
//             System.out.println("1. Linear Search");
//             System.out.println("2. Binary Search");
//             System.out.println("3. Exit");
//             System.out.print("Enter choice: ");
//             int ch = sc.nextInt();

//             switch (ch) {
//                 case 1:
//                     System.out.print("Enter element to search: ");
//                     int value = sc.nextInt();
//                     boolean found = false;

//                     for (int i = 0; i < n; i++) {
//                         if (arr[i] == value) {
//                             System.out.println("Element found at position " + (i + 1));
//                             found = true;
//                             break;
//                         }
//                     }

//                     if (!found) {
//                         System.out.println("Element not found");
//                     }
//                     break;

//                 case 2:
//                     System.out.print("Enter element to search: ");
//                     value = sc.nextInt();
//                     Arrays.sort(arr);
//                     System.out.println("Sorted List: " + Arrays.toString(arr));
//                     found = false;
//                     for (int low = 0, high = arr.length - 1; low <= high;) {
//                          int mid = (low + high) / 2;
//                         if (arr[mid] == value) {
//                             System.out.println("Element found at position " + (mid + 1));
//                             found = true;
//                             break;
//                         } else if (value < arr[mid]) {
//                             high = mid - 1;
//                         } else {
//                             low = mid + 1;
//                         }
//                     }

//                     if (!found) {
//                         System.out.println("Element not found");
//                     }

//                 case 3:
//                     System.out.println("Exiting program...");
//                     sc.close();
//                     System.exit(0);

//                 default:
//                     System.out.println("Invalid choice!");
//             }
//         }
//     }
// }

import java.util.*;

class SearchingProgram_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        while (true){
            System.out.println("1.Binary Search");
            System.out.println("2.Linear Search");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("-------Binary Search---------");
                Arrays.sort(arr);
                System.out.println("Sorted array:" + Arrays.toString(arr) + " ");
                System.out.println("Enter the element to find:");
                int value = sc.nextInt();
                boolean found = true;
                for (int low = 0, high = arr.length - 1;low<=high;){
                    int mid=(low+high)/2;
                    if (arr[mid]==value){
                        System.out.println("Element Found at location "+(mid+1));
                        break;
                    }
                    else if (value < arr[mid]) {
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                    break;
                }
                if(!found){
                    System.out.println("Element Not foound ");
                    break;
                }
            case 2:
                

            case 3:
                System.out.println("Exiting Program....");
                break;
            
            default :
                System.out.println("Invalid Number");
                break;
                
            }
            sc.close();
        }
    }
}
