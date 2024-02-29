package patterns.unionfind;

public class UnionFind {
    private final int[] rank;
    private final int[] parent;
    private int N;

    // Constructor to create and initialize sets of n items
    public UnionFind(int n) {
        rank = new int[n];
        parent = new int[n];
        this.N = n;
        makeSet();
    }

    // Creates n single item sets
    public void makeSet() {
        for (int i = 0; i < N; i++) {
            // Initially, all elements are in their own set.
            parent[i] = i;
            // All ranks are initially 1.
            rank[i] = 1;
        }
    }

    // Finds the representative of the set that x is an element of
    public int find(int x) {
        if (parent[x] != x) {
            // If x is not the parent of itself,
            // Then x is not the representative of his set.
            parent[x] = find(parent[x]);

            // so we recursively call Find on its parent
            // and move i's node directly under the representative of this set
        }
        return parent[x];
    }

    // Unites the set that includes x and the set that includes y
    public void union(int x, int y) {
        // Find the representatives (or the root nodes) for x and y
        int xSet = find(x);
        int ySet = find(y);

        // If they are already in the same set, return
        if (xSet == ySet)
            return;

        // Put smaller ranked item under bigger ranked item if ranks are different
        if (rank[xSet] < rank[ySet]) {
            parent[xSet] = ySet;
        } else if (rank[xSet] > rank[ySet]) {
            parent[ySet] = xSet;
        } else {
            // If ranks are the same, then move y under x (doesn't matter which one goes where)
            // and increment the result tree's rank by 1
            parent[ySet] = xSet;
            rank[xSet]++;
        }
    }
}
