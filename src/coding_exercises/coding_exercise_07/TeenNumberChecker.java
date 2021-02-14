package coding_exercises.coding_exercise_07;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 24));
    }

    public static boolean hasTeen(int firstPeronAge, int secondPersonAge, int thirdPersonAge) {
        return isTeen(firstPeronAge) || isTeen(secondPersonAge) || isTeen(thirdPersonAge);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
