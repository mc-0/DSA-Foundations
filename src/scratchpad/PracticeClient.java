package scratchpad;

import patterns.orderedset.OrderedSet;

import java.util.Comparator;

public class PracticeClient {

    public static void main(String[] args) {
        OrderedSet os = new OrderedSet(Comparator.reverseOrder());

        os.add(5);
        os.add(1);
        os.add(2);

        System.out.println(os.find_by_order(1)); // Find 2nd element in reverse order
        System.out.println(os.order_of_key(3));

    }



    }

