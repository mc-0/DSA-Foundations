package main.patterns.unionfind.casestudies.unionfind;

public interface UF {
//    Fields to exist within an implementation
//    int[] id;
//    int count;

    int getCount();
    boolean isConnected(int p, int q);
    int find(int p);
    void union(int p, int q);
}
