package s05_switch_statement_loops.challenge_digit_sum;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        int sumOfDigits = 0;

        if (number >= 10) {
            while (number > 0) {
                int lastDigit = number % 10;
                sumOfDigits += lastDigit;
                number /= 10;
            }
        } else {
            sumOfDigits = -1;
        }

        return sumOfDigits;
    }
}
