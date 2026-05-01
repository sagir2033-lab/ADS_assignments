Data Processing Tasks 
1) Which sorting algorithm performed faster? Why?
Merge Sort performed significantly faster on large datasets. This is because Merge Sort has a time complexity of O(n log n), while Bubble Sort has O(n²). As the input size increases, the difference becomes much more noticeable.

2) How does performance change with input size?
As the array size increases, Bubble Sort becomes dramatically slower and Merge Sort scales efficiently

3) How does sorted vs unsorted data affect performance?
Bubble Sort is much faster on sorted arrays, because it stops early when no swaps are needed (best case O(n)) and Merge Sort shows almost no improvement, because it always divides and merges regardless of input

4) Do the results match expected Big-O complexity?
Yes, the results match theoretical expectations, Bubble Sort behaves like O(n²) on random data, Bubble Sort improves to O(n) on sorted data, Merge Sort consistently behaves like O(n log n)

5) Which searching algorithm is more efficient? Why?
Binary Search is highly efficient, with time complexity O(log n). It reduces the search space by half at each step, making it extremely fast even for large arrays.

6) Why does Binary Search require a sorted array?
Binary Search depends on the order of elements. It decides whether to go left or right based on comparison with the middle element. Without a sorted array, this decision would not be valid, and the algorithm would fail.

Report Requirements:
A. Project Overview:
This project focuses on implementing and analyzing fundamental sorting and searching algorithms in Java. Selected algorithms are:
Bubble Sort (Basic Sorting)
Merge Sort (Advanced Sorting)
Binary Search (Searching)
The purpose of this experiment is to compare the performance of different algorithms under different conditions, including varying input sizes and data types (random and sorted arrays).
Additionally, this project demonstrates how theoretical time complexity (Big-O notation) relates to actual execution time measured using System.nanoTime().

B. Algorithm Descriptions:
Bubble Sort:
- Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly traverses the array, compares adjacent elements, and swaps them if they are in the wrong order.
An optimization is used to stop early if no swaps occur during a pass, making it efficient for already sorted arrays.
Merge Sort:
- Merge Sort is an efficient divide-and-conquer algorithm. It splits the array into smaller subarrays, recursively sorts them, and then merges them back together in sorted order.
It provides consistent performance regardless of input type.
Binary search:
- Binary Search is an efficient searching algorithm that works only on sorted arrays. It repeatedly divides the search space in half by comparing the target value to the middle element.

C. Experimental Results:
Size	 Type	    Bubble	  Merge	  Binary
10	  Random	   4800	    4400	   2100
10	  Sorted	   800	    3200	   2100
100	  Random	  116100	  43200	   1200
100	  Sorted	   2500	    29900	   1200
1000	Random	  2871200	  127600	 1300
1000	Sorted	   5500	    125000	 1300
Different input sizes:
- As the array size increases, Bubble Sort becomes significantly slower due to its O(n²) complexity, while Merge Sort scales efficiently with O(n log n).
Sorted vs unsorted arrays:
- Bubble Sort performs much faster on already sorted arrays due to early stopping optimization. Merge Sort performance remains consistent regardless of input type.

D. Screenshots:
Array size: 10
Random array:
Bubble: 4800 ns
Merge: 4400 ns
Sorted array:
Bubble: 800 ns
Merge: 3200 ns
Search (Binary): 2100 ns

Array size: 100
Random array:
Bubble: 116100 ns
Merge: 43200 ns
Sorted array:
Bubble: 2500 ns
Merge: 29900 ns
Search (Binary): 1200 ns

Array size: 1000
Random array:
Bubble: 2871200 ns
Merge: 127600 ns
Sorted array:
Bubble: 5500 ns
Merge: 125000 ns
Search (Binary): 1300 ns

E. Reflection Section:
- During this assignment, I learned how different algorithms behave in real-world scenarios. While theoretical complexity (Big-O notation) provides a general understanding, actual performance depends on input size and data structure.
One interesting observation is that Bubble Sort, despite being inefficient in general, can outperform Merge Sort on already sorted arrays due to its early termination optimization.
A challenge faced during this project was correctly measuring execution time and ensuring fair comparisons between algorithms. However, this helped deepen my understanding of algorithm efficiency and performance trade-offs.
