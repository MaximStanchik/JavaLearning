package org.Stanchik;

//Перечисление сортов яблока
enum Apple {
    Jonathan, //константа перечисления
    GoldenDel, // константа перечисления
    RedDel, // константа перечисления
    Winesap, // константа перечисления
    CortLand // константа перечисления
}

public class App 
{
    public static void main( String[] args )
    {
        ScholarSchedule schedule = new ScholarSchedule(DayOfWeek.DayOfWeekEnum.MONDAY);
        Scholar scholar = new Scholar(schedule);
        scholar.wakeUp();

        ScholarSchedule weekendSchedule = new ScholarSchedule(DayOfWeek.DayOfWeekEnum.SUNDAY);
        Scholar weekendScholar = new Scholar(weekendSchedule);
        weekendScholar.wakeUp();
    }
}
