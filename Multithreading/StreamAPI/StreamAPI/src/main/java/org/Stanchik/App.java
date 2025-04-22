package org.Stanchik;

import java.util.stream.IntStream;

public class App
{
    public static void main( String[] args )
    {
        //Задача: найти в массиве количество всех чисел, которые больше 0:
        //(Без Stream API)
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;
        for (int i =0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                count = count + 1;
            }
        }
        System.out.println(count);

        //(С Stream API)
        long count_1 = IntStream.of(numbers).filter(w -> w>0).count();
        System.out.println(count_1);
    }
}
