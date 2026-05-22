package BonusTask;

import java.util.*;

public class GraphBonus {

    private int vertices;
    private List<List<EdgeBonus>> adjList;

    public GraphBonus(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to, int weight) {
        adjList.get(from).add(new EdgeBonus(to, weight));
        adjList.get(to).add(new EdgeBonus(from, weight)); // если граф неориентированный
    }

    public void dijkstra(int start) {

        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < vertices - 1; i++) {

            int u = getMinVertex(dist, visited);
            if (u == -1) break;

            visited[u] = true;

            for (EdgeBonus e : adjList.get(u)) {
                if (!visited[e.to] && dist[u] != Integer.MAX_VALUE
                        && dist[u] + e.weight < dist[e.to]) {

                    dist[e.to] = dist[u] + e.weight;
                }
            }
        }

        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    private int getMinVertex(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                index = i;
            }
        }

        return index;
    }
}