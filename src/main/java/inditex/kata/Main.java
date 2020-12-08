package inditex.kata;

public class Main {
    public static void main(String[] args) {
        int[] array = {13, 7, 6, 12};

        Exercise10 exercise10 = new Exercise10();

        exercise10.nextGreaterNumber(array).forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }

}