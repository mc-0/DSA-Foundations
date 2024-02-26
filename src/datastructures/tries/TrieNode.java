package datastructures.tries;

public class TrieNode {

    public TrieNode[] children = new TrieNode[26]; // Array to store children nodes for each character
    public boolean isEnd;

    public TrieNode() {
        isEnd = false;
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }

}
