package patterns.trie;

import datastructures.tries.Trie;
import datastructures.tries.TrieNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
***TIME***
    Building the Trie: O(N * L), where N is the number of words and L is the average length of these words.
    Finding Index Pairs: O(T^2 * L), where T is the length of the text string and L is the length of the longest word.
    Overall: O(N * L + T^2 * L)

***SPACE***
    Trie Storage: O(N * L), for storing N words each of average length L.
    Overall: O(N * L), dominated by the Trie storage.
 */
public class IndexStrings {

    public static List<List<Integer>> indexPairs(String text, List<String> words) {
        Trie trie = new Trie();
        // Populate the trie with the list of words
        for (String word : words) {
            trie.insert(word);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            TrieNode p = trie.root;
            for (int j = i; j < text.length(); j++) {
                char currentChar = text.charAt(j);
                if (p.children[currentChar - 'a'] == null) {
                    break; // Break if the character is not in the trie
                }
                p = p.children[currentChar - 'a'];
                if (p.isEnd) {
                    result.add(Arrays.asList(i, j)); // Add index pair if word found as a list
                }
            }
        }

        return result; // Return a list of lists containing index pairs
    }



}
