package homeworkLesson13;

// 1. Create an enum called Weekday representing the days of the week (Monday, Tuesday, ..., Sunday).
// 2. Improve the Weekday enum and add a method called isWeekend into it.
// 4. Write a method called getDayType that takes a
// Weekday enum as a parameter and returns a string indicating whether it's a "Weekday" or "Weekend."

public enum Weekday {

    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false),
    FRIDAY(false), SATURDAY(true), SUNDAY(true);

    private final boolean isWeekendValue;

    Weekday(boolean isWeekendValue) {
        this.isWeekendValue = isWeekendValue;
    }

    public boolean isWeekend() {
        return isWeekendValue;
    }

    public static String getDayType(Weekday day){
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return "Weekday";
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                return "Invalid day";
        }
    }
}
