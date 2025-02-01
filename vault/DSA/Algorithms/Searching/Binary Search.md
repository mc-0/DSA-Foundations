![binary-search-algo-01](https://github.com/user-attachments/assets/59ce8712-f7fb-428e-a381-4b54b34ab78c)

# Overview
* `Binary Search` serves as an efficient algorithm for finding the position of an element in a sorted [[Arrays|array]].
* Applies a _divide & conquer_ approach by removing half of the total search space to focus only on the portion where the element could be found.
* Requires the input to be sorted, but modifications can be made to apply it to various problems
* Is also limited to data structures with random access (i.e., cannot work on linked lists)
* Other applications of binary search include:
   * Searching databases / index systems
   * Finding fist / last occurrences of an element

### Complexity
***
**Time Complexity:**
```
Best Case: O(1) (if the middle element is the target on the first attempt).
Worst/Average Case: O(log⁡n), as the search space is halved at each step.
```
**Space Complexity:**
```
Iterative Version: O(1), as it uses only a few variables.
Recursive Version: O(log⁡n), due to the recursion stack in the worst case.
```
***

### Iterative Binary Search
[Iterative Binary Search Implementation](https://github.com/mc-0/DSA/blob/main/src/patterns/modifiedbinarysearch/casestudies/searching/BinarySearch.java#L22)
```
binarySearch(array, target):
    Initialize low = 0
    Initialize high = array.length - 1

    while low <= high:
        mid = low + (high - low) / 2  // Calculate the middle index

        if array[mid] == target:
            return mid              // Target found
        else if array[mid] < target:
            low = mid + 1           // Search the right half
        else:
            high = mid - 1          // Search the left half

    return -1  // Target not found
```

### Recursive Binary Search
[Recursive Binary Search Implementation](https://github.com/mc-0/DSA/blob/main/src/patterns/modifiedbinarysearch/casestudies/searching/BinarySearch.java#L5)
```
binarySearch(array, target, low, high):
    if low > high:
        return -1  // Base case: Target not found

    mid = (low + high) // 2  // Calculate the middle index

    if array[mid] == target:
        return mid           // Target found
    else if array[mid] < target:
        return binarySearch(array, target, mid + 1, high)  // Search right half
    else:
        return binarySearch(array, target, low, mid - 1)   // Search left half
```

_____
### Binary Search Template 1:
```java
int binarySearch(int[] nums, int target){
  if(nums == null || nums.length == 0)
    return -1;

  int left = 0, right = nums.length - 1;
  while(left <= right){
    // Prevent (left + right) overflow
    int mid = left + (right - left) / 2;
    if(nums[mid] == target){ return mid; }
    else if(nums[mid] < target) { left = mid + 1; }
    else { right = mid - 1; }
  }

  // End Condition: left > right
  return -1;
}
```

- Most basic and elementary form of Binary Search
- Search Condition can be determined without comparing to the element's neighbors (or use specific elements around it)
- No post-processing required because at each step, you are checking to see if the element has been found. If you reach the end, then you know the element is not found
- --------
### Binary Search Template 2:
```java
int binarySearch(int[] nums, int target){
  if(nums == null || nums.length == 0)
    return -1;

  int left = 0, right = nums.length - 1;
  while(left < right){
    // Prevent (left + right) overflow
    int mid = left + (right - left) / 2;
    if(nums[mid] == target){ return mid; }
    else if(nums[mid] < target) { left = mid + 1; }
    else { right = mid; }
  }

  // Post-processing:
  // End Condition: left == right
  if(nums[left] == target) return left;
  return -1;
}
```
- An advanced way to implement Binary Search.
- Use the element's right neighbor to determine if the condition is met and decide whether to go left or right
- Guarantees Search Space is at least 2 in size at each step
- Post-processing required. Loop/Recursion ends when you have 1 element left. Need to assess if the remaining element meets the condition.
--------------
### Binary Search Template 3:
```java
int binarySearch(int[] nums, int target) {
    if (nums == null || nums.length == 0)
        return -1;

    int left = 0, right = nums.length - 1;
    while (left + 1 < right){
        // Prevent (left + right) overflow
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid;
        } else {
            right = mid;
        }
    }

    // Post-processing:
    // End Condition: left + 1 == right
    if(nums[left] == target) return left;
    if(nums[right] == target) return right;
    return -1;
}
```
- An alternative way to implement Binary Search
- Use the element's neighbors to determine if the condition is met and decide whether to go left or right
- Guarantees Search Space is at least 3 in size at each step
- Post-processing required. Loop/Recursion ends when you have 2 elements left. Need to assess if the remaining elements meet the condition.

**Distinguishing Syntax:**

---

- Initial Condition: `left = 0, right = length-1`
- Termination: `left + 1 == right`
- Searching Left: `right = mid`
- Searching Right: `left = mid`