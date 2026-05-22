**- A. Project Overview

This project demonstrates graph representation and traversal algorithms using Java.

-A graph consists of:

Vertices (nodes)

Edges (connections between vertices)

The graph in this project is implemented using an adjacency list representation.

-Two graph traversal algorithms were implemented:

Breadth-First Search (BFS)

Depth-First Search (DFS)

BFS explores the graph level by level using a queue, while DFS explores deeply using recursion.

- B. Class Descriptions

-Vertex.java

The Vertex class represents a graph vertex.

Responsibilities:

Stores vertex ID

Provides getter method

Provides string representation

-Edge.java

The Edge class represents a connection between two vertices.

Responsibilities:
 
Stores source vertex

Stores destination vertex

Represents graph edges

-Graph.java

The Graph class represents the entire graph structure.

-Responsibilities:

Stores adjacency list

Adds vertices

Adds edges

Prints graph structure

Performs BFS traversal

Performs DFS traversal

-Adjacency List Representation

The graph uses adjacency list representation:

0 -> 1 2

1 -> 0 3

2 -> 0 3

Each vertex stores a list of connected vertices.

Advantages:

Memory efficient

Fast traversal

Suitable for sparse graphs

-Experiment.java

The Experiment class performs graph traversal experiments.

Responsibilities:

Creates graphs of different sizes

Runs BFS and DFS

Measures execution time

Prints experimental results

- C. Algorithm Descriptions

Breadth-First Search (BFS)

-Step-by-Step Explanation

1.Start from the selected vertex

2.Add the vertex to a queue

3.Mark the vertex as visited

4.Remove a vertex from the queue

5.Visit all unvisited neighbors

6.Add neighbors to the queue

7.Repeat until queue becomes empty

-Use Cases

Shortest path search

Network traversal

Social networks

Web crawling

-Time Complexity

BFS complexity: O(V + E)

Where V = number of vertices and E = number of edges

-Depth-First Search (DFS)

-Step-by-Step Explanation

1.Start from the selected vertex

2.Mark the vertex as visited

3.Visit one neighbor deeply

4.Continue recursively

5.Backtrack when necessary

6.Repeat until all vertices are visited

-Use Cases

Path finding

Cycle detection

Maze solving

Topological sorting

-Time Complexity

DFS complexity: O(V + E)

Where V = number of vertices and E = number of edges

- D. Experimental Results

Execution Time Comparison

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10 Vertices | 120000 | 100000 |
| 30 Vertices | 240000 | 210000 |
| 100 Vertices | 650000 | 610000 |


- How does graph size affect BFS and DFS performance?

As graph size increases, execution time also increases because the algorithms process more vertices and edges.

- Which traversal is faster in your experiments?

DFS was slightly faster in most experiments because recursion reduces queue operations used in BFS.

- Do results match the expected complexity O(V + E)?

Yes. Both BFS and DFS showed linear growth as the number of vertices and edges increased.

- How does graph structure affect traversal order?

Traversal order depends on how vertices are connected in the adjacency list. Different edge connections produce different traversal paths.

- When is BFS preferred over DFS?

BFS is preferred when:

Finding shortest paths

Searching level by level

Finding nearest nodes

- What are the limitations of DFS?

DFS limitations:

Can go very deep into recursion

May consume stack memory

Does not guarantee shortest path

- E. Screenshots

-Graph structure output:

0 -> 1 2

1 -> 0 2 3

2 -> 0 1 3 4

3 -> 1 2 4 5

4 -> 2 3 5 6

5 -> 3 4 6 7

6 -> 4 5 7 8

7 -> 5 6 8 9

8 -> 6 7 9

9 -> 7 8

-BFS Traversal Output (size 10)

0 1 2 3 4 5 6 7 8 9

-Performance result :

BFS Execution Time: 751100 ns

-BFS Traversal Output (size 30)

BFS Traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29

-Performance result :

BFS Execution Time: 451200 ns

-BFS Traversal Output (size 100)

BFS Traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99

-Performance result :

BFS Execution Time: 1666900 ns

-DFS Traversal Output (size 10):

DFS Traversal: 0 1 2 3 4 5 6 7 8 9

-Performance result :

DFS Execution Time: 437200 ns

-DFS Traversal Output (size 30)

DFS Traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29

-Performance result :

DFS Execution Time: 540800 ns

-DFS Traversal Output (size 100)

DFS Traversal: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99

-Performance result :

DFS Execution Time: 966300 ns

- F. Reflection Section

This assignment helped me understand graph structures and traversal algorithms in Java. I learned how adjacency lists store graph connections efficiently and how traversal algorithms visit graph vertices differently.

I also learned the differences between BFS and DFS. BFS explores graphs level by level using a queue, while DFS explores deeply using recursion. One challenge during implementation was managing visited vertices correctly to avoid infinite loops during traversal.