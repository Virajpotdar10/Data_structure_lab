// // Implement a binary tree and perform inorder, preorder, and postorder traversals.
// import java.util.*;

// public class BinaryTree {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     Node root;
//     void createTree() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter root value: ");
//         int val = sc.nextInt();
//         if (val == -1) return;

//         root = new Node(val);
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);

//         while (!q.isEmpty()) {
//             Node current = q.poll();

//             System.out.print("Enter left child of " + current.data + ": ");
//             int leftVal = sc.nextInt();
//             if (leftVal != -1) {
//                 current.left = new Node(leftVal);
//                 q.add(current.left);
//             }

//             System.out.print("Enter right child of " + current.data + ": ");
//             int rightVal = sc.nextInt();
//             if (rightVal != -1) {
//                 current.right = new Node(rightVal);
//                 q.add(current.right);
//             }
//         }
//     }

//     // Inorder
//     void inorder(Node node) {
//         if (node == null) return;
//         inorder(node.left);
//         System.out.print(node.data + " ");
//         inorder(node.right);
//     }

//     // Preorder
//     void preorder(Node node) {
//         if (node == null) return;
//         System.out.print(node.data + " ");
//         preorder(node.left);
//         preorder(node.right);
//     }

//     // Postorder
//     void postorder(Node node) {
//         if (node == null) return;
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.data + " ");
//     }

//     public static void main(String[] args) {
//     BinaryTree tree = new BinaryTree();
//     Scanner sc = new Scanner(System.in);

//     int choice;

//     do {
//         System.out.println("\n--- MENU ---");
//         System.out.println("1. Create Tree");
//         System.out.println("2. Inorder Traversal");
//         System.out.println("3. Preorder Traversal");
//         System.out.println("4. Postorder Traversal");
//         System.out.println("5. Exit");
//         System.out.print("Enter your choice: ");

//         choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 tree.createTree();
//                 break;

//             case 2:
//                 System.out.print("Inorder: ");
//                 tree.inorder(tree.root);
//                 if (tree.root==null)
//                     System.out.print("Create Tree First");
//                 break;

//             case 3:
//                 System.out.print("Preorder: ");
//                 tree.preorder(tree.root);
//                  if (tree.root==null)
//                     System.out.print("Create Tree First");
//                 break;

//             case 4:
//                 System.out.print("Postorder: ");
//                 tree.postorder(tree.root);
//                  if (tree.root==null)
//                     System.out.print("Create Tree First");
//                 break;

//             case 5:
//                 System.out.println("Exiting...");
//                 break;

//             default:
//                 System.out.println("Invalid choice!");
//         }

//     } while (choice != 5);
//     sc.close();
// }
// }



import java.util.*;

public class  BinaryTree{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }   
    }
    Node root=null;
    
    void createNode(Scanner sc){
        System.out.println("Enter root value");
        int val = sc.nextInt();
    }
    
    int ch;    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
    
do{
        System.out.println("1.create node");
        System.out.println("2.Inorder");
        System.out.println("3.Preorder");
        System.out.println("4.Postorder");
    }while(ch!=4);
}
}