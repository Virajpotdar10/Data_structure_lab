import java.util.Scanner;

public class Hashing_5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of keys: ");
        int n = sc.nextInt();
        System.out.print("Enter table size: ");
        int m = sc.nextInt();

        int[] keys = new int[n];
        int[] hashTable = new int[m];
        for (int i = 0; i < m; i++) {
            hashTable[i] = -1;
        }

        System.out.println("Enter keys:");
        for (int i = 0; i < n; i++) {
            keys[i] = sc.nextInt();
        }

        System.out.println("\nHash Table:");
        System.out.println("Key\tk mod " + m);
        for (int i = 0; i < n; i++) {
            int mod = keys[i] % m;
            System.out.println(keys[i] + "\t" + mod);
            hashTable[mod] = keys[i];
        }
        System.out.println("\nIndex\tValue");
        for (int i = 0; i < m; i++) {
            if (hashTable[i] != -1)
                System.out.println(i + "\t" + hashTable[i]);
            else
                System.out.println(i + "\t" + "empty");
        }
        sc.close();
    }
}