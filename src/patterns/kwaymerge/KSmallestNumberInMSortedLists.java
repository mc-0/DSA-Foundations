package patterns.kwaymerge;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
// Time: O(K∗logM) - going through at least K elements of all lists, & add + remove 1 elem. from heap each step
// Space: O(M) - storing 1 element from each M input list
public class KSmallestNumberInMSortedLists {
    class Node {
        int elementIndex;
        int arrayIndex;

        Node(int elementIndex, int arrayIndex) {
            this.elementIndex = elementIndex;
            this.arrayIndex = arrayIndex;
        }
    }

    public int findKthSmallest(List<List<Integer>> lists, int k) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(a -> lists.get(a.arrayIndex).get(a.elementIndex))
        );

        // insert 1st element of each list:
        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                minHeap.add(new Node(0, i));
            }
        }

        int numCount = 0, result = 0;
        while (!minHeap.isEmpty()) {
            Node node = minHeap.poll();
            result =lists.get(node.arrayIndex).get(node.elementIndex);
            if (++numCount == k) {
                break;
            }
            node.elementIndex++; // point to the next index in the array
            if (node.elementIndex < lists.get(node.arrayIndex).size()) {
                minHeap.add(node);
            }
        }
        return result;
    }

}
