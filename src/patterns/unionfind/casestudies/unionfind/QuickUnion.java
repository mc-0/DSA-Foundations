package patterns.unionfind.casestudies.unionfind;

public class QuickUnion implements UF {

    private int[] id;
    private int count;

    public QuickUnion(int n) {
        this.count = n;
        this.id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int find(int p) {
        // Travels the array to find the root
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);

        if (i == j) return;

        id[i] = j;

        count--;
    }
}
