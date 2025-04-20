package org.Stanchik;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App
{
    public static void main( String[] args )
    {
        //Пример 1: вывод текущей даты и времени, високосный год

        String months[] = {"Янв", "Фев", "Мар", "Апр", "Май", "Июн", "Июл", "Авг", "Сен",
                "Окт", "Ноя", "Дек"};
        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();

        System.out.print("Дата: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // Тест если текущий год является високосным
        if(gcalendar.isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        }else {
            System.out.println(year + " - не високосный год");
        }

        //Пример 2: получить день недели по дате

        String date = "17.06.2020";
        SimpleDateFormat format = new SimpleDateFormat("DD.MM.YYYY");
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));

    }
}
