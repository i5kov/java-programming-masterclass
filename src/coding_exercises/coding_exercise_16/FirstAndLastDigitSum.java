package coding_exercises.coding_exercise_16;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = -1;

        if (number >= 0) {
            if (number >= 0 && number <= 9) {
                sum = number + number;
            } else {
                int lastDigit = number % 10;
                int firstDigit = number;

                while (firstDigit > 9) {
                    firstDigit /= 10;
                }
                sum = firstDigit + lastDigit;
            }
        }
        return sum;
    }
}
