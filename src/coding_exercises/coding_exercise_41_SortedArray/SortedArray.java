package coding_exercises.coding_exercise_41_SortedArray;

import java.util.Scanner;

public class SortedArray {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int arraySize = Integer.parseInt(SCANNER.nextLine());
        int[] array = getIntegers(arraySize);
        int[] sortedArray = sortIntegers(array);
        SCANNER.close();
        printArray(sortedArray);
    }
    
    public static int[] getIntegers(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = SCANNER.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", (i), array[i]);
        }
    }
}
