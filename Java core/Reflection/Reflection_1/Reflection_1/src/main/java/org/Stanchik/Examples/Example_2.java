package org.Stanchik.Examples;

import org.Stanchik.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example_2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Employee.class;

        Object o = (Employee) employeeClass.newInstance();
        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj = constructor1.newInstance();
        System.out.println(obj);

        Constructor constructor_2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor_2.newInstance(5, "Zaur", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);


    }
}
