package casestudies.unionfind;

public class QuickFind implements UF{

    private int[] id;
    private int count;

    public QuickFind(int n) {
        this.count = n;
        this.id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public int checkIdStatus() {
        return id.length;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        // add connection from p -> q (add to same component)
        int pId = find(p);
        int qId = find(q);

        if (pId == qId) {
            return;
        }

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
        count--;
    }

    public int find(int p) {
        return id[p];
    }

}
