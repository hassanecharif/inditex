package inditex.kata;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10Test {

    private Exercise10 exercise10 = new Exercise10();

    @Test
    public void nextGreaterNumberSuccessfulTest() {
        int[] inputArray = {13, 7, 6, 12};

        Map<Integer, Integer> expectedResult = new LinkedHashMap<>();

        expectedResult.put(13, -1);
        expectedResult.put(7, 12);
        expectedResult.put(6, 12);
        expectedResult.put(12, -1);

        Map<Integer, Integer> result = exercise10.nextGreaterNumber(inputArray);

        assertEquals(expectedResult, result);
    }

    @Test
    public void nextGreaterNumberWithNegativeNumbersTest() {
        int[] inputArray = {-13, 7, 6, 12};

        Map<Integer, Integer> expectedResult = new LinkedHashMap<>();

        expectedResult.put(-13, 7);
        expectedResult.put(7, 12);
        expectedResult.put(6, 12);
        expectedResult.put(12, -1);

        Map<Integer, Integer> result = exercise10.nextGreaterNumber(inputArray);

        assertEquals(expectedResult, result);
    }

    @Test
    public void nextGreaterNumberEmptyInputTest() {
        int[] inputArray = {};

        Map<Integer, Integer> expectedResult = new LinkedHashMap<>();

        Map<Integer, Integer> result = exercise10.nextGreaterNumber(inputArray);

        assertEquals(expectedResult, result);
    }

    @Test
    public void nextGreaterNumberNullInputTest() {
        Map<Integer, Integer> expectedResult = new LinkedHashMap<>();

        Map<Integer, Integer> result = exercise10.nextGreaterNumber(null);

        assertEquals(expectedResult, result);
    }
}
