package patterns.orderedset;

import java.util.Comparator;
import java.util.TreeSet;

// Time: O(logN) - on operations due to implementing with TreeSet
// Space: O(N)
public class OrderedSet {
    private TreeSet<Integer> set;

    public OrderedSet(Comparator<Integer> comparator) {
        set = new TreeSet<>(comparator);
    }

    public void add(int element) {
        set.add(element);
    }

    public Integer find_by_order(int k) {
        if (k < 0 || k >= set.size()) return null;
        return (Integer)set.toArray()[k];
    }

    public int order_of_key(int element) {
        return set.headSet(element, true).size();
    }
}
