package org.Stanchik;

import java.util.BitSet;

public class App
{
    public static void main( String[] args )
    {
        BitSet firstBitSet = new BitSet(16);
        BitSet secondBitSet = new BitSet(32);

        System.out.println("Создал первый битсет размером 16 битов. Он ничего не содержит: " + firstBitSet);
        System.out.println("Создал второй битсет размером 32 битов. Он ничего не содержит: " + secondBitSet);

        for(int i = 0; i < 16; i++) {
            if((i % 2) == 0) {
                firstBitSet.set(i);
            }
            else if((i % 5) != 0) {
                secondBitSet.set(i);
            }
        }

        System.out.println("Исходная закономерность в firstBitSet: ");
        System.out.println(firstBitSet);
        System.out.println("\nИсходная закономерность в secondBitSet: ");
        System.out.println(secondBitSet);

        firstBitSet.and(secondBitSet);
        System.out.println("\nfirstBitSet AND secondBitSet: ");
        System.out.println(firstBitSet);

        firstBitSet.or(secondBitSet);
        System.out.println("\nfirstBitSet OR secondBitSet: ");
        System.out.println(firstBitSet);

        firstBitSet.xor(secondBitSet);
        System.out.println("\nfirstBitSet XOR secondBitSet: ");
        System.out.println(firstBitSet);

    }
}
