package data;

public enum DaysOfWeek {

//    Create an enum representing the days of the week, and write a method to
//    return the number of the day.

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);


    private final String daysOfWeek;


    private final int numberOfDays;

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    DaysOfWeek(String daysOfWeek, int numberOfDays) {
        this.daysOfWeek = daysOfWeek;
        this.numberOfDays = numberOfDays;
    }


    public int getDayNumber(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
                return 1;
            case TUESDAY:
                return 2;
            case WEDNESDAY:
                return 3;
            case THURSDAY:
                return 4;
            case FRIDAY:
                return 5;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 7;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }

}
