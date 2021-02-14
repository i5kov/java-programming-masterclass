package section04.challenge_seconds_and_minutes;

public class SecondsAndMinutesChallenge {

    public static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(-1, 30));
        System.out.println(getDurationString(30, 50));
        System.out.println(getDurationString(3945));
    }

    static String getDurationString(int minutes, int seconds) {
        boolean validTime = isValidTime(minutes, seconds);
        String durationString;

        if (validTime) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            durationString = hours + "h " + remainingMinutes + "m " + seconds + "s";
        } else {
            durationString = INVALID_VALUE;
        }

        return durationString;
    }

    static String getDurationString(int seconds) {
        String durationString;
        if (seconds < 0) {
            durationString = INVALID_VALUE;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            durationString = getDurationString(minutes, remainingSeconds);
        }
        return durationString;
    }

    static boolean isValidTime(int minutes, int seconds) {
        return minutes >= 0 && (seconds >= 0 && seconds <= 59);
    }
}
