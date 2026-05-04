import java.util.*;

// Class representing a node in the BST
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree{
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node
    void insert(int data) {
        root = insertRecursive(root, data);
    }

    Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRecursive(root.left, data);
        else if (data > root.data)
            root.right = insertRecursive(root.right, data);

        return root;
    }

    // 1. Inorder Traversal (Left, Root, Right)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // 2. Preorder Traversal (Root, Left, Right)
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // 3. Postorder Traversal (Left, Right, Root)
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes you want to insert:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        System.out.println("\n--- Traversals ---");
        System.out.print("Inorder (Sorted Order): ");
        tree.inorder(tree.root);
        System.out.print("\nPreorder (Root First): ");
        tree.preorder(tree.root);
        System.out.print("\nPostorder (Children First): ");
        tree.postorder(tree.root);

        sc.close();
    }
}