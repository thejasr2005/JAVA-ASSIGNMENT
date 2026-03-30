package MODULE14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSOperations {
    int V;
    LinkedList<Integer>[] adj;

    GraphBFSOperations(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    void printGraph() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++)
            System.out.println(i + " -> " + adj[i]);
    }

    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS Traversal: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int n : adj[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        System.out.println();
    }

    void shortestPath(int start) {
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj[node]) {
                if (dist[n] == -1) {
                    dist[n] = dist[node] + 1;
                    q.add(n);
                }
            }
        }

        System.out.println("Shortest distances from node " + start + ":");
        for (int i = 0; i < V; i++)
            System.out.println("To " + i + " = " + dist[i]);
    }

    void printNeighbors(int node) {
        System.out.println("Neighbors of " + node + ": " + adj[node]);
    }

    void countEdgesVertices() {
        int edges = 0;
        for (int i = 0; i < V; i++)
            edges += adj[i].size();

        edges = edges / 2;
        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges);
    }

    public static void main(String[] args) {
        GraphBFSOperations g = new GraphBFSOperations(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.printGraph();
        g.BFS(0);
        g.shortestPath(0);
        g.printNeighbors(1);
        g.countEdgesVertices();
    }
}
