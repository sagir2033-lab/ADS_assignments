- Description

This project implements Dijkstra’s Algorithm to find the shortest path from a starting vertex to all other vertices in a weighted graph.

The algorithm calculates the minimum distance from the source vertex to every other vertex using a simple array-based approach (no priority queue is used, as allowed in the task requirements).

- Features :

Weighted graph implementation

Edge class with weight support

Adjacency list representation of graph
 
Dijkstra’s shortest path algorithm

Outputs shortest distances from a given source vertex

- How it works

1.The graph is represented using an adjacency list.

2.Each edge stores: destination vertex (to) and weight of the edge (weight)

3.Dijkstra’s algorithm:
    
Initializes all distances as infinity

Sets starting vertex distance to 0
    
Repeatedly selects the unvisited vertex with the smallest distance
    
Updates neighboring vertices if a shorter path is found

- How to run

1.Open the project in IntelliJ IDEA (or any Java IDE)

2.Run Main.java

3.The program will print the shortest distances from the source vertex

- Example Output

0 -> 0

1 -> 3

2 -> 1

3 -> 4

4 -> 7

- Files structure 

Main.java – runs the program

Graph.java – contains graph and Dijkstra implementation 

Edge.java – represents weighted edges

- Notes

No priority queue is used (simple implementation with arrays)

Works with undirected weighted graphs

Vertices are indexed starting from 0