package coding_exercises.coding_exercise_19;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        boolean hasSameLastDigit = false;

        if (isValid(firstNum) && isValid(secondNum) && isValid(thirdNum)) {
            int firstNumLastDigit = firstNum % 10;
            int secondNumLastDigit = secondNum % 10;
            int thirdNumLastDigit = thirdNum % 10;

            if (firstNumLastDigit == secondNumLastDigit || secondNumLastDigit == thirdNumLastDigit || firstNumLastDigit == thirdNumLastDigit) {
                hasSameLastDigit = true;
            } else if (firstNumLastDigit == secondNumLastDigit && firstNumLastDigit == thirdNumLastDigit) {
                hasSameLastDigit = true;
            }
        }

        return hasSameLastDigit;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
