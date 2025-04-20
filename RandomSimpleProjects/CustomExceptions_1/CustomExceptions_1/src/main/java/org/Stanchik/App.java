package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        try {
            int result = Factorial.getFactorial(-6);
            System.out.println(result);
        }
        catch(FactorialException ex) {
            System.out.println(ex.getNumber());
            System.out.println(ex.getMessage());
        }
    }
}
