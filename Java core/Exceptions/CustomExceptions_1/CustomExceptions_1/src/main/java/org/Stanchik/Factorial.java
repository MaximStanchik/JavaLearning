package org.Stanchik;

public class Factorial {
    public static int getFactorial(int num) throws FactorialException {
        int result = 1;
        if (num < 1) {
            throw new FactorialException("The number is less then 1!", num);
        }

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        return result;
    }
}

