package s05_switch_statement_loops.challenge_day_of_week;

public class DayOfTheWeek {

    public static void main(String[] args) {
        printDayOTheWeek(0);
        printDayOTheWeek(1);
        printDayOTheWeek(2);
        printDayOTheWeek(3);
        printDayOTheWeek(4);
        printDayOTheWeek(5);
        printDayOTheWeek(6);
        printDayOTheWeek(7);
        printDayOTheWeek(8);
    }

    public static void printDayOTheWeek(int day) {
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day";
        }
        System.out.println(dayOfWeek);
    }
}
