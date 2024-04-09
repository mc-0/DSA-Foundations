package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorting.ElementarySortUtil;

import static org.junit.jupiter.api.Assertions.*;

class ElementarySortUtilTest {

    // Test cases primarily rely on simple array basic sorting
    // Need to account for object comparison
    int[] input;
    int[] result;

    @BeforeEach
    void setup() {
        input = new int[]{11, 3, 2, 5, 9, 7, 1, 0, 6, 8, 10, 12};
        result = new int[]{0,1,2,3,5,6,7,8,9,10,11,12};
    }

    @Test
    void bubbleSort() {
        ElementarySortUtil.bubbleSort(input);
        assertEquals(input, result);

    }

    @Test
    void insertionSort() {
    }

    @Test
    void selectionSort() {
    }
}