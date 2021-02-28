package coding_exercises.coding_exercise_15_NumberPalindrome;

public class NumberPalindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(-1221);
        System.out.println(palindrome);
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int checkNumber = Math.abs(number);
        int sum = 0;

        while (checkNumber > 0) {
            int lastDigit = checkNumber % 10;
            sum = (sum * 10) + lastDigit;
            checkNumber /= 10;
        }
        return sum == Math.abs(number);
    }
}
