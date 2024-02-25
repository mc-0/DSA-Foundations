package datastructures.tries;

public class TrieNode {

    TrieNode[] children = new TrieNode[26]; // Array to store children nodes for each character
    boolean isEndOfWord; // Flag to indicate if this node is the end of a word

    public TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }

}
