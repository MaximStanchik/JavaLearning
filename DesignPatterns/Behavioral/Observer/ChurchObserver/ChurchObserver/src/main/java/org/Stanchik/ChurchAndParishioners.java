package org.Stanchik;

public class ChurchAndParishioners
{
    public static void main( String[] args )
    {
        CatholicChurch catholicChurch = new CatholicChurch();

        new Parishioner("Мартин Лютер", catholicChurch);
        new Parishioner("Жан Кальвин", catholicChurch);

        catholicChurch.setNewsChurch("Инквизиция была ошибкой... месса Mea Culpa 12 марта 2000 года");
    };
};



//TODO: остановился на "Давайте посмотрим как это будет:"
