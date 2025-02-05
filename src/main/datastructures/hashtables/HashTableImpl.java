package main.datastructures.hashtables;

import java.util.LinkedList;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    // Each bucket will store a linked list of key-value pairs (in case of collisions)
    private LinkedList<Entry<K, V>>[] buckets;
    private int capacity = 10; // Default capacity
    private int size = 0; // Current number of elements
    private static final double LOAD_FACTOR = 0.75; // Threshold to resize

    // Entry class to store key-value pairs
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public HashTableImpl() {
        buckets = new LinkedList[capacity];
    }

    // Hash function to compute the index for the key
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Implements the put method to insert or update a key-value pair
    @Override
    public void put(K key, V value) {
        int index = hash(key);

        // Initialize bucket if it's null
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Check if the key already exists and update its value
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value
                return;
            }
        }

        // Add new key-value pair
        buckets[index].add(new Entry<>(key, value));
        size++;

        // Resize if load factor exceeds the threshold
        if ((double) size / capacity > LOAD_FACTOR) {
            resize();
        }
    }

    // Implements the get method to retrieve a value by key
    @Override
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // Key not found
    }

    // Implements the remove method to delete a key-value pair
    @Override
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    bucket.remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    // Checks if the hash table contains a key
    @Override
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Implements the size method to return the current size
    @Override
    public int size() {
        return size;
    }

    // Implements the clear method to empty the hash table
    @Override
    public void clear() {
        buckets = new LinkedList[capacity];
        size = 0;
    }

    // Resizes the hash table when the load factor threshold is exceeded
    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        LinkedList<Entry<K, V>>[] newBuckets = new LinkedList[capacity];

        // Rehash and transfer all entries to the new table
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    int newIndex = Math.abs(entry.key.hashCode()) % capacity;
                    if (newBuckets[newIndex] == null) {
                        newBuckets[newIndex] = new LinkedList<>();
                    }
                    newBuckets[newIndex].add(entry);
                }
            }
        }

        buckets = newBuckets;
    }
}

