package coding_exercises.coding_exercise_13_NumbersOfDaysInMonth;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year >= 1 && year <= 9999) {
            if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static int getDaysInMonth(int monthAsNumber, int year) {
        int days = -1;

        if (monthAsNumber >= 1 && monthAsNumber <= 12) {
            if (year >= 1 && year <= 9999) {
                int daysInFebruary = isLeapYear(year) ? 29 : 28;

                switch (monthAsNumber) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                    case 2:
                        days = daysInFebruary;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                }
            }
        }
        return days;
    }
}
