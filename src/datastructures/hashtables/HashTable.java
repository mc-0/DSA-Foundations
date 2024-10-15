package datastructures.hashtables;

public interface HashTable<K, V> {

    // Inserts a key-value pair into the hash table
    void put(K key, V value);

    // Retrieves the value associated with the given key
    V get(K key);

    // Removes the key-value pair from the hash table
    void remove(K key);

    // Returns the number of key-value pairs in the hash table
    int size();

    // Checks if the hash table contains a key
    boolean containsKey(K key);

    // Clears the hash table, removing all key-value pairs
    void clear();
}

