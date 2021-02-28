package coding_exercises.coding_exercise_01_SpeedConverter;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        double kmPerHour = 1.609;
        long result = -1;

        if (kilometersPerHour >= 0) {
            result = Math.round(kilometersPerHour / kmPerHour);
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
