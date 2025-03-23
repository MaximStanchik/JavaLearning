package org.Stanchik.Examples;

import org.Stanchik.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example_1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass_0 = Class.forName("org.Stanchik.Employee");
        //Class employeeClass_1 = Employee.class;
        //Employee emp = new Employee();
        //Class employeeClass_3 = emp.getClass();

        Field someField = employeeClass_0.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("************************************************************");

        Field [] fields = employeeClass_0.getFields();
        for (Field field:fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("************************************************************");

        Field [] allFields = employeeClass_0.getDeclaredFields();
        for (Field field:allFields) {
            System.out.println("Type of " + field.getName() + ": " + field.getType());
        }
        System.out.println("************************************************************");

        Method someMethod_0 = employeeClass_0.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod_0.getReturnType() + ", " +
                "parameter types: " +
                Arrays.toString(someMethod_0.getParameterTypes()));
        System.out.println("************************************************************");

        Method someMethod_01 = employeeClass_0.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " +
                someMethod_01.getReturnType() + ", " +
                "parameter types: " +
                Arrays.toString(someMethod_01.getParameterTypes()));
        System.out.println("************************************************************");

        Method[] declaredMethods = employeeClass_0.getDeclaredMethods(); // получем только объявленные методы в классе
        for (Method method : declaredMethods) {
            System.out.println("Name of declared method = " + method.getName() + ", return type  = " + method.getReturnType() +
                    "parameter types: " +
                    Arrays.toString(someMethod_01.getParameterTypes()));
        }
        System.out.println("************************************************************");

        Method[] methods = employeeClass_0.getMethods(); // получаем все методы в классе, в том числе и унаследованные
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() + ", return type  = " + method.getReturnType() +
                    "parameter types: " +
                    Arrays.toString(someMethod_01.getParameterTypes()));
        }
        System.out.println("************************************************************");

        for (Method method : declaredMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of public declared method = " + method.getName() + ", return type  = " + method.getReturnType() +
                        "parameter types: " +
                        Arrays.toString(someMethod_01.getParameterTypes()));
            }
        }
        System.out.println("************************************************************");

        Constructor constructor_1 = employeeClass_0.getConstructor();
        System.out.println("Constructor 1 has " + constructor_1.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor_1.getParameterTypes()) );
        System.out.println("************************************************************");

        Constructor constructor_2 = employeeClass_0.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor 2 has " + constructor_2.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor_2.getParameterTypes()) );
        System.out.println("************************************************************");

        Constructor [] constructors = employeeClass_0.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() + " has " + constructor_2.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor_2.getParameterTypes()) );
        }
        System.out.println("************************************************************");

    }
}
