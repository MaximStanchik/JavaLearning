package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        CatholicChurch observable = new CatholicChurch();

        observable.addPropertyChangeListener(new Parishioner("Мартин Лютер"));
        observable.addPropertyChangeListener(new Parishioner("Жан Кальвин"));

        observable.setNews("Дева Мария имеет непорочное зачатие... булла Ineffabilis Deus... 8 декабря 1854 года Папа Пий IX");
        observable.setNews("Папа непогрешим... не всегда конечно, а только когда транслирует учение церкви ex cathedra... Первый Ватиканский собор 1869 год");
    };
};
