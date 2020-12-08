package inditex.kata;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise10 {

    public Map<Integer, Integer> nextGreaterNumber(int[] array) {

        Map<Integer, Integer> result = new LinkedHashMap<>();

        if (array != null) {

            for (int i = 0; i < array.length; i++) {
                int nextElement = -1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        nextElement = array[j];
                        break;
                    }
                }
                result.put(array[i], nextElement);
            }

            return result;
        }

        return result;
    }
}
