package datastructures.heaps;

import sorting.QuickSort;

public class Heap {

    private class HeapNode {
        HeapNode left;
        HeapNode right;

        private int value;

        HeapNode(int val) {
            this.value = val;
        }
    }

    private HeapNode root;
    private int depth;

    public HeapNode minHeapify(Integer[] a) {
        Integer[] sorted = a;
        QuickSort<Integer> qs = new QuickSort();
        qs.sort(sorted, 0, a.length-1);

        HeapNode node = new HeapNode(sorted[0]);
        root = node;
        HeapNode currentNode = root;

        for (int i = 1; i < sorted.length; i++) {

            if (i % 2 == 0) {
                currentNode.right = new HeapNode(a[i]);
                currentNode = currentNode.left;
            }
            else {
                currentNode.left = new HeapNode(a[i]);
            }
        }
        return null;
    }


}
