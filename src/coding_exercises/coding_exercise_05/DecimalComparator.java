package coding_exercises.coding_exercise_05;

public class DecimalComparator {

    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        boolean isEqual = false;

        if ((int)firstNumber == (int)secondNumber) {
            if ((int)(firstNumber * 1000 % 1000) == ((int)(secondNumber * 1000 % 1000))) {
                isEqual = true;
            }
        }
        return isEqual;
    }
}
