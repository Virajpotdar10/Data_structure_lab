import java.util.Scanner;
class Array{
    int []a=new int [20];
    int n;

    void insert(Scanner sc){
        System.out.print("Enter value to insert:");
        int v =sc.nextInt();
        a[n++]=v;
    }

    void display(){
        System.out.print("Array Consist of :");
            for(int i=0; i< n;i++){
                System.out.print(a[i]+" ");
            }
        System.out.println();
    } 

    void sort(){
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
}
}

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        int ch;

        do {
        System.out.println("\n1.Insert 2.Display 3.Sort");
        System.out.println("\nChoice:");
            ch = sc.nextInt();  
            switch (ch) {
                case 1:
                    arr.insert(sc);
                    break;
                case 2:
                    arr.display();
                    break;
                case 3:
                    arr.sort();
                    break;
            }

        } while (ch != 4);
        sc.close();

    }

}
