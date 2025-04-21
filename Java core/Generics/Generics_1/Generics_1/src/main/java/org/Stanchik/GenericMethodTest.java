package org.Stanchik;

public class GenericMethodTest
{
    private static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element + ",");
        }
        System.out.println();
    }
    public static void main( String[] args )
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'П', 'Р', 'И', 'В', 'Е', 'Т'};

        System.out.print("Массив intArray содержит: ");
        printArray(intArray);

        System.out.print("Массив doubleArray содержит: ");
        printArray(doubleArray);

        System.out.print("Массив charArray содержит: ");
        printArray(charArray);
    }
}
