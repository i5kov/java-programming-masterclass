package coding_exercises.coding_exercise_42_MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int sizeOfArray = readInteger();
        int[] numbers = readElements(sizeOfArray);
        int minNumber = findMin(numbers);
        System.out.println("In array: " + Arrays.toString(numbers) + ", Min number = " + minNumber);
    }

    private static int readInteger() {
        return SCANNER.nextInt();
    }

    private static int[] readElements(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = SCANNER.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        for (int element : array) {
            if (element <= minNumber) {
                minNumber = element;
            }
        }
        return minNumber;
    }
}
