package sorting;

import java.util.Arrays;

public class SortingClient {

    public static void main(String[] args) {
        int[] input = {8, 3, 7, 1, 9, 4, 2, 5, 10, 6};
        ShellSort.sort(input);

        System.out.println(Arrays.toString(input));
    }
}
