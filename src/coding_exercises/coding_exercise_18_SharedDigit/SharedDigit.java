package coding_exercises.coding_exercise_18_SharedDigit;

public class SharedDigit {

    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(9, 99));
//        System.out.println(hasSharedDigit(15, 55));
        boolean b = hasSharedDigit(12, 13);
        System.out.println(b);
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        boolean hasSharedDigit = false;
        int tempNumber = secondNum;

        if (firstNum >= 10 && firstNum <= 99 && secondNum >= 10 && secondNum <= 99) {
            while (firstNum > 0) {
                int firstNumLastDigit = firstNum % 10;
                while (tempNumber > 0) {
                    int secondNumLastDigit = tempNumber % 10;
                    if (firstNumLastDigit == secondNumLastDigit) {
                        hasSharedDigit = true;
                        break;
                    }
                    tempNumber /= 10;
                }
                if (hasSharedDigit) {
                    break;
                }
                firstNum /= 10;
                tempNumber = secondNum;
            }
        }
        return hasSharedDigit;
    }
}
