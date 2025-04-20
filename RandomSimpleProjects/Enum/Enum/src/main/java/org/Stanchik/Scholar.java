package org.Stanchik;

public class Scholar {
    private ScholarSchedule schedule;
    private boolean goToSchool;

    public Scholar(ScholarSchedule schedule) {
        this.schedule = schedule;
    }

    public void wakeUp() {
        if (this.schedule.getDayOfWeek() == DayOfWeek.DayOfWeekEnum.SUNDAY) {
            System.out.println("Ура, можно поспать еще!");
        } else {
            System.out.println("Блин, опять в школу:(");
        }
    }
}