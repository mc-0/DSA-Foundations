package datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumVerticesToReachAllNodes {

    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        boolean[] hasIncomingEdge = new boolean[n];

        for (List<Integer> edge : edges) {
            hasIncomingEdge[edge.get(1)] = true;
        }

        for (int i = 0; i < hasIncomingEdge.length; i++) {
            if (!hasIncomingEdge[i]) {
                result.add(i);
            }
        }
        return result;
    }

}
