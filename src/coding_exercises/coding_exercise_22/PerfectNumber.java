package coding_exercises.coding_exercise_22;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        boolean isPerfectNumber = false;
        int sumOfProperDivisors = 0;

        if (number >= 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfProperDivisors += i;
                }
            }
            isPerfectNumber = sumOfProperDivisors == number;
        }
        return isPerfectNumber;
    }
}
