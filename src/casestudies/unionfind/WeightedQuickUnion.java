package casestudies.unionfind;

public class WeightedQuickUnion implements UF{

    private int[] id;
    private int[] sz;
    private int count;

    public WeightedQuickUnion(int n) {
        this.count = n;
        this.id = new int[n];
        this.sz = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }

        for (int i = 0; i < n; i++) {
            sz[i] = 1;
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

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}
