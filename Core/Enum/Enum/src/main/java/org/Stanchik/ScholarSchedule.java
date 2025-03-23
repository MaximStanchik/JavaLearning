package org.Stanchik;

public class ScholarSchedule {
    private DayOfWeek.DayOfWeekEnum dayOfWeek;

    public ScholarSchedule(DayOfWeek.DayOfWeekEnum dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public DayOfWeek.DayOfWeekEnum getDayOfWeek() {
        return dayOfWeek;
    }
}
