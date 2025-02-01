![search1](https://github.com/user-attachments/assets/a4fdc05a-efee-44ac-88b8-ab3099090f43)

# Attributes
A Trie (also known as a prefix-tree) is a [[Trees|tree]]-like data structure that stores a dynamic set of strings, where the keys are usually strings. Tries are a powerful tool for problems involving strings or prefix-based queries. The core attributes of a Trie are:
   - **Root Node**: The starting point of the Trie, which doesn't contain a character but points to the first level of characters.
   - **Children**: Each node (except the root) contains a letter and has pointers to its children (next letters in possible strings).
   - **End of Word Marker**: Some nodes in the Trie are marked to indicate that they complete a valid word (commonly represented as a boolean flag).
   - **Alphabet Size**: A node can have multiple children, with the number of children typically determined by the size of the alphabet (e.g., 26 for lowercase English letters).

# Operations
| **Operation**          | **Time Complexity** |
|------------------------|---------------------|
| Insertion of a word     | O(m)                |
| Search for a word       | O(m)                |
| Delete a word           | O(m)                |
| Prefix search           | O(m)                |
| Count Words of Given Prefix | O(m + k) |
| Auto-Completion | O(m + k * n) |

- __m__: the length
- __k__: the number of strings with that prefix
- __n__: the average length of the strings


# Trade Offs
| **PRO**                                                | **CON**                                                |
|--------------------------------------------------------|--------------------------------------------------------|
| Efficient prefix searching (e.g., for autocomplete).   | High memory usage, especially for large alphabets.      |
| Can search and insert in O(m) time regardless of input size. | More complex implementation compared to hash-based approaches. |
| Handles prefixes better than hash maps.                | Difficult to use for non-string data types.             |
| Can be used for dynamic datasets with changing word sets. | Space overhead can grow large if words share few prefixes. |

# Common Uses
1. **Autocomplete Systems**: Tries are frequently used in search engines and text editors for word autocompletion, where users type part of a word and the system suggests completions.
2. **Spell Checkers**: Tries help efficiently search for words and find the closest match for misspelled words.
3. **IP Routing (Longest Prefix Matching)**: Tries are used in network routers to find the longest prefix that matches an IP address.
4. **Dictionary/Prefix Search Applications**: Any application that requires efficient prefix searching or starts with a common prefix.
5. **DNA Sequence Matching**: Tries are used in bioinformatics to search for patterns in DNA sequences.

# Implementations
[Trie Implementation](https://github.com/mc-0/DSA/tree/main/src/datastructures/tries)

