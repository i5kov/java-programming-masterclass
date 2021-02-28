package coding_exercises.coding_exercise_12_NumbersInWord;

public class NumberInWord {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            printNumberInWord(i);
        }
    }

    public static void printNumberInWord(int number) {
        String numberAsText;
        switch (number) {
            case 0:
                numberAsText = "ZERO";
                break;
            case 1:
                numberAsText = "ONE";
                break;
            case 2:
                numberAsText = "TWO";
                break;
            case 3:
                numberAsText = "THREE";
                break;
            case 4:
                numberAsText = "FOUR";
                break;
            case 5:
                numberAsText = "FIVE";
                break;
            case 6:
                numberAsText = "SIX";
                break;
            case 7:
                numberAsText = "SEVEN";
                break;
            case 8:
                numberAsText = "EIGHT";
                break;
            case 9:
                numberAsText = "NINE";
                break;
            default:
                numberAsText = "other";
        }
        System.out.println(numberAsText);
    }
}
