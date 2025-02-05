package test.datastructures;

import main.datastructures.stacks.ArrayBasedIStack;
import org.junit.Test;

public class IStackTest {

    @Test
    public void testPeek() {
        ArrayBasedIStack<Integer> abs = new ArrayBasedIStack<>();
        abs.push(5);
        assert(abs.peek() == 5);
    }
}
