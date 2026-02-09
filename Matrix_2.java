import java.util.Scanner;

class Matrix_2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        while (true) {
            System.out.println("\n1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Transpose");
            System.out.println("5.Exit");
            System.out.print("Choice: ");

            int ch = sc.nextInt();

            if (ch == 1) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++)
                        System.out.print(a[i][j] + b[i][j] + " ");
                    System.out.println();
                }

            } else if (ch == 2) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++)
                        System.out.print(a[i][j] - b[i][j] + " ");
                    System.out.println();
                }

            } else if (ch == 3) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        int sum = 0;
                        for (int k = 0; k < c; k++)
                            sum += a[i][k] * b[k][j];
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }

            } else if (ch == 4) {
                for (int i = 0; i < c; i++) {
                    for (int j = 0; j < r; j++)
                        System.out.print(a[j][i] + " ");
                    System.out.println();
                }

            } else if (ch == 5) {
                System.out.println("End");
                break;

            } else {
                System.out.println("Wrong choice");
            }
        }
        sc.close();
    }
}






