package coding_exercises.coding_exercise_11;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimitTemperature = 35;
        int summerUpperLimitTemperature = 45;

        int temperatureUpperLimit = summer ? summerUpperLimitTemperature : upperLimitTemperature;
        return temperature >= 25 && temperature <= temperatureUpperLimit;
    }
}
