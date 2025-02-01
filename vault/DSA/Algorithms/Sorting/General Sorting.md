
![image](https://github.com/user-attachments/assets/a85fbc3d-7086-424b-86c4-6768898f628a)
# Properties of Sorting Algorithms
1. __Stability__: A stable sort maintains the relative order of equal elements. For example, if two equal elements appear in the order A, B, a stable sort will keep A before B.
2. __In-Place vs. Out-of-Place__: In-Place Sorting requires a small, constant amount of additional memory (e.g., Quick Sort). Whereas Out-of-Place Sorting requires additional space proportional to the size of the input (e.g., Merge Sort).
# Notes on Sorting
 __Computation Complexity__: Evaluating algorithms focuses on identifying the _upper bound_ which provides a cost guarantee in the worst case and a _lower bound_ which provides a proven limit (i.e., none else can do better). The goal is to find an _optimal algorithm_ in which both the lower & upper bounds are the same (i.e., you are getting the best possible performance for your particular use case).

Be mindful of the how the language your working with handles sorting. In _Java_ for example `Arrays.sort()` maintains a method for various data types. `Merge Sort` is typically applied to objects & `Quick Sort` is used for primitives.

# Sorting Considerations
The choice in sorting will be specific to the task at handle & its requirements. A few elements that might be considered are:
- Stability
- Parallelism
- Deterministic
- Distinct Keys
- Multiple Key Types
- Arrays vs. Linked Lists
- Item Size
- Need for Guaranteed Performance
- Is Input Randomly Ordered

# Elementary Sorts
- [Bubble Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/ElementarySortUtil.java#L10)
- [Insertion Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/ElementarySortUtil.java#L24)
- [Selection Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/ElementarySortUtil.java#L40)

# Divide & Conquer
- [Merge Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/MergeSort.java)
- [Quick Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/QuickSort.java)

# Other Sorts & Related Algorithms
- [Shell Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/ShellSort.java)
- [Quick Select](https://github.com/mc-0/DSA/blob/main/src/sorting/QuickSelect.java)
- [Heap Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/HeapSort.java)
- [Radix Sort]()

![image](https://github.com/user-attachments/assets/aee6dbfc-9081-4c2f-83c9-8fd40d4c541c)

[[Selection Sort]]
[[Insertion Sort]]
[[Quick Sort]]
[[Merge Sort]]
[[Algorithms/Sorting/Topological Sort]]
