
![Quick_Sort_0](https://github.com/user-attachments/assets/e64f003f-7137-4d72-a932-e223b2e048ae)

# Quick Sort

Quick Sort is a **divide-and-conquer** algorithm used to sort an [[Arrays|array]] or list of elements. It works by selecting a "pivot" element and partitioning the array such that elements less than the pivot are on one side, and elements greater than the pivot are on the other side. The subarrays are then sorted recursively.

# Key Characteristics

- **Divide and Conquer**:
  - The array is divided into smaller subarrays based on the pivot element, and then recursively sorted.

- **In-place Sorting**:
  - Quick Sort sorts the array in place, meaning it does not require additional memory allocation for another array.

- **Not Stable**:
  - Quick Sort is not a stable sort, as it may change the relative order of equal elements.

- **Time Complexity**:
  - Best and Average Case: \(O(n \log n)\)
  - Worst Case: \(O(n^2)\), which occurs when the pivot element is the smallest or largest in the array, leading to unbalanced partitions.

- **Space Complexity**:
  - \(O(\log n)\) for the recursion stack in the average case.
  - \(O(n)\) in the worst case if the recursion is not optimized (e.g., using tail recursion or random pivot selection).

---

# General Pseudocode

```plaintext
quickSort(arr, low, high):
    if low < high:
        pivotIndex = partition(arr, low, high)   // Find the pivot element such that arr[pivotIndex] is in the correct position
        quickSort(arr, low, pivotIndex - 1)      // Recursively sort the left subarray
        quickSort(arr, pivotIndex + 1, high)     // Recursively sort the right subarray

partition(arr, low, high):
    pivot = arr[high]   // Choose the last element as the pivot
    i = low - 1
    for j = low to high - 1:
        if arr[j] < pivot:
            i = i + 1
            swap arr[i] and arr[j]
    swap arr[i + 1] and arr[high]   // Place the pivot in its correct position
    return i + 1
```

# Explanation of Steps

1. **Choose a Pivot**:
   - Select an element from the array to be the pivot. A common choice is the last element, but other methods can be used, such as choosing the first element, middle element, or a random element.

2. **Partition**:
   - Rearrange the array by comparing each element with the pivot:
     - Move elements smaller than the pivot to the left.
     - Move elements greater than the pivot to the right.
   - After this step, the pivot is in its correct sorted position in the array.

3. **Recursively Apply**:
   - Recursively apply the quick sort algorithm to the subarrays formed by partitioning the array. These subarrays are the elements to the left and right of the pivot.

4. **Base Case**:
   - The recursion terminates when the subarray has fewer than two elements, meaning the array is already sorted.

---

# Complexity

- **Time Complexity**:
  - **Best and Average Case**: \(O(n \log n)\) when the pivot divides the array into two roughly equal parts.
  - **Worst Case**: \(O(n^2)\) occurs when the pivot is always the smallest or largest element (e.g., if the array is already sorted or reverse sorted).

- **Space Complexity**:
  - **Best and Average Case**: \(O(\log n)\) due to the recursion stack.
  - **Worst Case**: \(O(n)\) if the recursion is deep (which occurs with unbalanced partitions).

---

## Key Characteristics

- **In-place Sorting**:
  - Quick sort is efficient in terms of memory usage as it sorts the array in place without needing additional storage.

- **Not Stable**:
  - Quick sort is not stable because it might change the relative order of equal elements. Stability can be achieved with modifications to the partition process but it requires more space.

- **Efficiency**:
  - Quick Sort is very efficient for large datasets and often outperforms other algorithms like Merge Sort and Heap Sort in practice, especially when the pivot selection is optimized.

- **Randomized Quick Sort**:
  - The worst-case time complexity can be avoided by randomizing the pivot selection. This ensures that the array is more likely to be divided evenly, leading to better performance in practice.

---

# Use Cases

- **Sorting Large Arrays**:
  - Quick Sort is commonly used in situations where large datasets need to be sorted efficiently. Its average-case time complexity of \(O(n \log n)\) makes it an ideal choice for many real-world applications.

- **In-place Sorting**:
  - Because Quick Sort is an in-place algorithm, it is particularly useful when memory is limited, or the sorting needs to be done with minimal space overhead.

- **Efficient Sorting of Random Data**:
  - Quick Sort works very well when the data is randomly distributed, as the pivot selection can efficiently divide the array into smaller subarrays.

---

# Summary

Quick Sort is a highly efficient, divide-and-conquer sorting algorithm with an average time complexity of \(O(n \log n)\). Though it has a worst-case time complexity of \(O(n^2)\), this can be avoided through techniques like randomized pivot selection. It is an in-place sorting algorithm and is generally faster than other algorithms like Merge Sort and Heap Sort for random data. However, it is not stable, which may be a consideration for certain use cases where stability is important.

# Implementations
[Quick Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/QuickSort.java)