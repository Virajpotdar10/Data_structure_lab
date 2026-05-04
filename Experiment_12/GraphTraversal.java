// implement BFS and DFS code

import java.util.*;

public class GraphTraversal {

    // DFS function
    static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;
        System.out.print(node + " ");

        for(int x : adj.get(node)){
            if(!visited[x]){
                dfs(x, visited, adj);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter edges (u v): ");
        for(int i = 0; i < E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);   // for undirected graph
        }

        while(true){

            System.out.println("\n1. BFS");
            System.out.println("2. DFS");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    boolean visited1[] = new boolean[V];
                    Queue<Integer> q = new LinkedList<>();

                    System.out.print("Enter starting node: ");
                    int start = sc.nextInt();

                    visited1[start] = true;
                    q.add(start);

                    System.out.print("BFS: ");

                    while(!q.isEmpty()){
                        int node = q.poll();
                        System.out.print(node + " ");

                        for(int x : adj.get(node)){
                            if(!visited1[x]){
                                visited1[x] = true;
                                q.add(x);
                            }
                        }
                    }
                    break;

                case 2:
                    boolean visited2[] = new boolean[V];

                    System.out.print("Enter starting node: ");
                    int start2 = sc.nextInt();

                    System.out.print("DFS: ");
                    dfs(start2, visited2, adj);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}