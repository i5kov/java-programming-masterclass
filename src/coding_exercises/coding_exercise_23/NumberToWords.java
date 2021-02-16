package coding_exercises.coding_exercise_23;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(1000);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);
            int reversedNumber = reverse(number);

            while (digitCount > 0) {
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0: System.out.println("Zero"); break;
                    case 1: System.out.println("One"); break;
                    case 2: System.out.println("Two"); break;
                    case 3: System.out.println("Three"); break;
                    case 4: System.out.println("Four"); break;
                    case 5: System.out.println("Five"); break;
                    case 6: System.out.println("Six"); break;
                    case 7: System.out.println("Seven"); break;
                    case 8: System.out.println("Eight"); break;
                    case 9: System.out.println("Nine"); break;
                }
                reversedNumber /= 10;
                digitCount--;
            }
        }
    }

    public static int getDigitCount(int number) {
        return number < 0 ? -1 : ("" + number).length();
    }

    public static int reverse(int number) {
        String reversedNumber = number < 0 ? "-" : "";
        String numberForReverse = "" + Math.abs(number);


        for (int i = numberForReverse.length() - 1; i >= 0; i--) {
            reversedNumber += numberForReverse.charAt(i);
        }
        return Integer.parseInt(reversedNumber);
    }
}
