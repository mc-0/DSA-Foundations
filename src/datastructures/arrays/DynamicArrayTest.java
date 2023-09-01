package datastructures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    DynamicArray<Integer> testArray = new DynamicArray<>();

    @BeforeEach
    void setUp() {
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
    }

    @Test
    void sizeTest() {
        int expected = 3;
        int actual = testArray.size();

        assertEquals(expected, actual);

    }

    @Test
    void isActuallyEmpty() {
        DynamicArray<Integer> emptyArray = new DynamicArray<>();

        boolean expected = true;
        boolean actual = emptyArray.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    void isNotEmpty() {
        boolean expected = false;
        boolean actual = testArray.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    void clear() {
        testArray.clear();
        int expected = 0;
        int actual = testArray.size();

        assertEquals(expected, actual);
    }

    @Test
    void get() {
        int expected = 1;
        int actual = testArray.get(0);

        assertEquals(expected, actual);
    }

    @Test
    void set() {
        testArray.set(0, 100);

        int expected = 100;
        int actual = testArray.get(0);

        assertEquals(expected, actual);
    }

    @Test
    void indexOfExists() {
        int expected = 2;
        int actual = testArray.indexOf(3);

        assertEquals(expected, actual);
    }

    @Test
    void indexOfDoesNotExist() {
        int expected = -1;
        int actual = testArray.indexOf(75);

        assertEquals(expected, actual);
    }

    @Test
    void containsValueTrue() {
        boolean expected = true;
        boolean actual = testArray.contains(3);

        assertEquals(expected, actual);
    }

    @Test
    void containsValueFalse() {
        boolean expected = false;
        boolean actual = testArray.contains(300);

        assertEquals(expected, actual);
    }

    @Test
    void removeAtSuccess() {
        int expected = 2;
        int actual = testArray.removeAt(1);

        assertEquals(expected, actual);
    }

    @Test
    void removeSuccess() {
        boolean actual = testArray.remove(1);
        assertTrue(actual);
    }

    @Test
    void removeFailure() {
        boolean actual = testArray.remove(1000);
        assertFalse(actual);
    }

}