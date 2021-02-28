package coding_exercises.coding_exercise_09_MinutesToYearsAndDaysCalculator;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long day = remainingMinutes / 1440;

            System.out.println(minutes + " min = " + years + " y and " + day + " d");
        }
    }
}
