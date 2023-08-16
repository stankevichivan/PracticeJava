package main.java.com.stankevichivan.collections;

import com.stankevichivan.collections.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task1Test {

    @Test
    void getResult1() {
        int[] array = {3, 8, 15, 17};
        int number = 32;
        var expected = new int[]{2, 3};
        var actual = Task1.getResult(array, number);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getResult2() {
        int[] array = {3, 8, 15, 17};
        int number = 23;
        var expected = new int[]{1, 2};
        var actual = Task1.getResult(array, number);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getResult3() {
        int[] array = {3, 8, 15, 17};
        int number = 8;
        var expected = new int[]{1};
        var actual = Task1.getResult(array, number);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getResult4() {
        int[] array = {3, 8, 15, 17};
        int number = 17;
        var expected = new int[]{3};
        var actual = Task1.getResult(array, number);
        assertArrayEquals(expected, actual);
    }
}