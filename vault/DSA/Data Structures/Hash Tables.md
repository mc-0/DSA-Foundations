<img width="584" alt="hash-table" src="https://github.com/user-attachments/assets/1a427e26-78a8-45ca-bb87-9dc1f9d331b6">

# Attributes
1. *Key-Value Pair Storage*: Hash tables store data in pairs of keys and values, where each key is unique.
2. *Hash Function*: A hash function is used to compute an index (hash code) from the key, determining where the key-value pair should be stored in the table.
3. *Collision Handling*: Since multiple keys can generate the same hash index, hash tables use techniques like chaining or open addressing to handle collisions.
4. *Fast Lookups*: Average-case time complexity for lookups, insertions, and deletions is O(1), due to direct index access provided by the hash function.
5. *Dynamic Size*: Hash tables resize dynamically (typically doubling the size) when the load factor (number of elements/size of table) crosses a threshold, ensuring efficient space usage.
6. *Load Factor*: This represents the level of fullness of the hash table and is crucial in deciding when to resize the table.

# Operations
| **Operation**    | **Description**                                          | **Time Complexity** |
|------------------|----------------------------------------------------------|---------------------|
| **Insert**       | Adds a key-value pair to the table                        | O(1) average, O(n) worst case |
| **Search**       | Finds the value associated with a given key               | O(1) average, O(n) worst case |
| **Delete**       | Removes a key-value pair from the table                   | O(1) average, O(n) worst case |
| **Update**       | Changes the value of an existing key                      | O(1) average, O(n) worst case |
| **Resize/Rehash**| Increases the table size when the load factor is too high | O(n) when rehashing |
| **Collision Handling** | Handles conflicts caused by multiple keys hashing to the same index | O(1) with effective collision resolution |



# Trade Offs
| **Pros**                                           | **Cons**                                            |
|----------------------------------------------------|-----------------------------------------------------|
| Average O(1) time complexity for insert, search, and delete | Worst-case time complexity is O(n) due to collisions |
| Efficient memory usage with dynamic resizing       | Requires a good hash function to minimize collisions |
| Supports fast lookups for large datasets           | Resizing and rehashing can be expensive (O(n))       |
| Simple to implement for common operations          | Not suitable for ordered data (cannot traverse in order) |
| Useful in various applications like caching, dictionaries | Inefficient for small datasets compared to simpler data structures like arrays or linked lists |
| Flexible storage of diverse types of data (key-value pairs) | Poor memory locality due to potential collisions and chaining |
| No need to maintain sorted data                    | Susceptible to clustering in some probing methods (e.g., linear probing) |



# Common Uses
1. *Databases (Indexing)*: Hash tables are widely used in databases to index records for fast lookups of data.
2. *Caching*: Hash tables are used in caches to store frequently accessed data with quick access times (e.g., LRU Cache).
3. *Dictionaries/Maps*: They are the underlying data structure for implementing associative arrays (dictionaries in Python, HashMap in Java, etc.).
4. *Symbol Tables*: In compilers or interpreters, hash tables are used to store variable bindings.
5. *Routing Tables*: Hash tables are used in networking to store and retrieve routes efficiently.
6. *Sets*: In some programming languages, hash tables are used to implement sets, which support fast membership tests.
7. *Counting Frequencies*: Hash tables can be used to count occurrences of items, such as words in a document.

# Implementations
[Hash Tables](https://github.com/mc-0/DSA/tree/main/src/datastructures/hashtables)

