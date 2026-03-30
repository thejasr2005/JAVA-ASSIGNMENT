package MODULE14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDFSOperations {
    int V;
    LinkedList<Integer>[] adj;

    GraphDFSOperations(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : adj[node])
            if (!visited[n])
                DFSUtil(n, visited);
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal: ");
        DFSUtil(start, visited);
        System.out.println();
    }

    boolean hasCycleUtil(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int n : adj[node]) {
            if (!visited[n]) {
                if (hasCycleUtil(n, visited, node))
                    return true;
            } else if (n != parent)
                return true;
        }
        return false;
    }

    void detectCycle() {
        boolean[] visited = new boolean[V];
        boolean cycle = false;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (hasCycleUtil(i, visited, -1)) {
                    cycle = true;
                    break;
                }
            }
        }

        System.out.println("Cycle present: " + cycle);
    }

    void connectedComponents() {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                DFSUtil(i, visited);
                System.out.println();
            }
        }

        System.out.println("Connected Components: " + count);
    }

    void isBipartite() {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    for (int n : adj[node]) {
                        if (color[n] == -1) {
                            color[n] = 1 - color[node];
                            q.add(n);
                        } else if (color[n] == color[node]) {
                            System.out.println("Graph is NOT Bipartite");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Graph is Bipartite");
    }

    public static void main(String[] args) {
        GraphDFSOperations g = new GraphDFSOperations(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.DFS(0);
        g.detectCycle();
        g.connectedComponents();
        g.isBipartite();
    }
}
