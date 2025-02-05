package main.patterns.stacks;

public class TwoStackArray {

    int[] arr;
    int top1;
    int top2;

    public TwoStackArray(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = arr.length;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
    }
    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }
    public int pop1() {
        if (top1 >= 0) {
            int y = arr[top1];
            top1--;
            return y;
        }
        return -1;
    }
    public int pop2() {
        if (top2 < arr.length) {
            int y = arr[top2];
            top2++;
            return y;
        }
        return -1;
    }
}
