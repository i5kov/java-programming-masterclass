package coding_exercises.coding_exercise_17;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int evenDigitSum = -1;

        if (number >= 0) {
            evenDigitSum = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenDigitSum += digit;
                }
                number /= 10;
            }
        }
        return evenDigitSum;
    }
}
