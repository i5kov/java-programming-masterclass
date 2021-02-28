package coding_exercises.coding_exercise_03_BarkingDog;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 44));
        System.out.println(shouldWakeUp(true, 0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        boolean shouldWakeUp = false;

        if (isBarking && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23)) {
            shouldWakeUp = true;
        }
        return shouldWakeUp;
    }
}
