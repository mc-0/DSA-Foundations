package main.patterns.mergeintervals;

public class Interval {
    int start;
    int end;

    public Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
