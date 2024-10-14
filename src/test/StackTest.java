package test;

import datastructures.stacks.ArrayBasedStack;
import org.junit.Test;

public class StackTest {

    @Test
    public void testPeek() {
        ArrayBasedStack<Integer> abs = new ArrayBasedStack<>();
        abs.push(5);
        assert(abs.peek() == 5);
    }
}
