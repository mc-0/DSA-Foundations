package casestudies;

public class UnionFind {

    private int[] id;
    private int count;

    public UnionFind(int n) {
        this.count = n;
        this.id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public void union(int p, int q) {
        // add connection from p -> q
    }

    public int find(int p) {
        // find index of where p exists?
        return 0;
    }

    public boolean isConnected(int p, int q) {
        // return whether two points are connected
        return false;
    }


}
