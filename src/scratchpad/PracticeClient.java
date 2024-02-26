package scratchpad;

import patterns.trie.IndexStrings;

import java.util.ArrayList;
import java.util.List;

public class PracticeClient {

    public static void main(String[] args) {
        String s = "bluebirdskyscraper";
        String[] w = {"blue", "bird", "sky"};
        ArrayList<String> words = new ArrayList<>(List.of(w));

        System.out.println(IndexStrings.indexPairs(s, words));

    }



    }

