package patterns.kwaymerge;
import java.util.PriorityQueue;
// Time: O(N*logK)
//Space: O(K)
public class KSortedLists {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode merge(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<ListNode>();

        // put the root of each list in the min heap
        for (ListNode root : lists)
            if (root != null)
                minHeap.add(root);

        // take the smallest (top) element from the min-heap and add it to the result;
        // if the top element has a next element add it to the heap
        ListNode resultHead = null, resultTail = null;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            if (resultHead == null) {
                resultHead = resultTail = node;
            } else {
                resultTail.next = node;
                resultTail = resultTail.next;
            }
            if (node.next != null)
                minHeap.add(node.next);
        }

        return resultHead;
    }

}
