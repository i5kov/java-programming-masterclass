package coding_exercises.coding_exercise_10;

public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum) {
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
            System.out.println("Invalid Value");
        } else {
            if (secondNum == thirdNum && firstNum == thirdNum) {
                System.out.println("All numbers are equal");
            } else if (firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
