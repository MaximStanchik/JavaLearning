package org.Stanchik;

public class DayOfWeek {
    private String title;
    private DayOfWeek(String title) {
        this.title = title;
    }

    public enum DayOfWeekEnum {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
