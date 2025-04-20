package org.Stanchik.Examples;

import org.Stanchik.Employee;

import java.lang.reflect.Field;

public class Example_3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zaur", "IT");
        Class emlpoyeeClass = employee.getClass();
        Field field = emlpoyeeClass.getDeclaredField("salary");

        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);



    }
}
