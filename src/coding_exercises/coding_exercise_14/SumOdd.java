package coding_exercises.coding_exercise_14;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;
        if (number >= 0) {
            isOdd = number % 2 != 0;
        }
        return isOdd;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start >= 0 && end >= 0) {
            if (start > end) {
                sum = -1;
            } else {
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
