package org.Stanchik;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        Date date = new Date();
        System.out.println("Текущая дата и время: " + date);

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        System.out.println("Текущая дата и время: " + formatForDateNow.format(date));

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = args.length == 0 ? "2011-11-11" : args[0];
        System.out.println("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // Разница между датами:
        long start = System.currentTimeMillis();
        System.out.println(new Date() + "\n");

        Thread.sleep(10000);
        System.out.println(new Date() + "\n");

        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("разница между датами: " + diff + " миллисекунд");

        //Количество дней между датами:
        String date1 = "01.03.2016";
        String date2 = "01.02.2016";

        SimpleDateFormat format = new SimpleDateFormat("DD.MM.YYYY");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }

        long difference = dateOne.getTime() - dateTwo.getTime();
        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        System.out.println(days + " дн.");

    }
}
