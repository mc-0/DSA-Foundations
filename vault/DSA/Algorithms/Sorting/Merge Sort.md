
![0_uJMi6geAxKTZzLAr](https://github.com/user-attachments/assets/7ffb90ef-a7fc-40de-b11b-39e126f51c6c)


# Overview

Merge Sort is a **divide-and-conquer** algorithm used to sort an [[Arrays|array]] or list of elements. It works by recursively dividing the list into two halves, sorting each half, and then merging the sorted halves back together.

# Key Characteristics

- **Divide and Conquer**:
  - The list is split into smaller sublists, sorted, and then combined.
  
- **Stable Sort**:
  - Merge sort preserves the relative order of equal elements, making it a stable sorting algorithm.
  
- **Recursive**:
  - Merge sort is a recursive algorithm, continuously dividing the list until individual elements are reached.
  
- **Time Complexity**:
  - Merge sort has a consistent time complexity of \(O(n \log n)\) in the best, average, and worst cases.

- **Space Complexity**:
  - Merge sort requires extra space for the temporary sublists, resulting in a space complexity of \(O(n)\).

---

## General Pseudocode

```plaintext
mergeSort(arr):
    if length of arr > 1:
        mid = length of arr // 2
        leftHalf = arr[0:mid]   // Divide the list into two halves
        rightHalf = arr[mid:]   // Right half of the list
        
        mergeSort(leftHalf)     // Recursively sort the left half
        mergeSort(rightHalf)    // Recursively sort the right half
        
        merge(arr, leftHalf, rightHalf)  // Merge the sorted halves

merge(arr, leftHalf, rightHalf):
    i = 0
    j = 0
    k = 0
    while i < len(leftHalf) and j < len(rightHalf):
        if leftHalf[i] < rightHalf[j]:
            arr[k] = leftHalf[i]
            i += 1
        else:
            arr[k] = rightHalf[j]
            j += 1
        k += 1

    while i < len(leftHalf):
        arr[k] = leftHalf[i]
        i += 1
        k += 1

    while j < len(rightHalf):
        arr[k] = rightHalf[j]
        j += 1
        k += 1
```

## Explanation of Steps

1. **Divide**:
   - If the list has more than one element, divide it into two halves.
   - Recursively apply merge sort to each half until the sublists contain only one element.

2. **Conquer (Merge)**:
   - Merge the sorted sublists to produce a new sorted list.
   - Compare the elements of the two sublists and combine them in sorted order.
   - Repeat the merging process until all elements from both sublists are merged.

3. **Combine**:
   - Once all sublists are merged, the final result is a sorted list.

---

## Complexity

- **Time Complexity**:
  - **Divide Step**: The list is divided recursively until all sublists have one element, which takes \(O(\log n)\) time.
  - **Merge Step**: Each merge operation involves comparing and combining elements, which takes \(O(n)\) time.
  
  - **Overall**:
    - The time complexity of merge sort is \(O(n \log n)\) in all cases (best, average, and worst).
  
- **Space Complexity**:
  - Merge sort requires additional space for the temporary sublists. Hence, the space complexity is \(O(n)\), where \(n\) is the number of elements in the input list.

---

## Key Characteristics

- **Stable**:
  - Merge sort is a stable sort, meaning it preserves the relative order of elements with equal values.

- **Efficiency**:
  - Merge sort is efficient for large datasets and is preferred for external sorting (sorting data stored outside the computer's main memory, like on disk).

- **Comparison to Other Algorithms**:
  - Unlike **Quick Sort**, which has a worst-case time complexity of \(O(n^2)\), merge sort guarantees \(O(n \log n)\) time complexity.
  - **Insertion Sort** and **Bubble Sort** have a time complexity of \(O(n^2)\) in the worst case, making them inefficient for large datasets compared to merge sort.

---

## Use Cases

- **Sorting Large Datasets**:
  - Merge sort is well-suited for sorting large datasets, especially when data cannot be stored in memory all at once (external sorting).
  
- **Stable Sorting**:
  - It is used when the stability of the sorting algorithm is important (e.g., sorting a list of records where two records with the same key should remain in their original order).
  
- **Linked List Sorting**:
  - Merge sort can be used efficiently on linked lists, where the cost of splitting and merging is less than in array-based implementations.

---

# Summary

Merge Sort is a highly efficient sorting algorithm with a guaranteed time complexity of \(O(n \log n)\) in all cases. While it requires additional memory space for temporary sublists, it excels at sorting large datasets and maintaining stability. It is particularly useful in scenarios where data is too large to fit into memory and must be sorted from external storage.

# Implementations
* [Merge Sort](https://github.com/mc-0/DSA/blob/main/src/sorting/MergeSort.java)