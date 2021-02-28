package coding_exercises.coding_exercise_06_EqualSumChecker;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        return (firstNum + secondNum) == thirdNum;
    }
}
