package org.Stanchik;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentComparableMain
{
    public static void main( String[] args )
    {
        Student student = new Student(1,"John Doe","Java");
        Student student2 = new Student(2,"Jane Doe","React");
        Student student3 = new Student(3,"Mike","BA");

        List<Student> students = Arrays.asList(student, student2, student3);
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students,new StudentDeptComparator());
        System.out.println(students);

        Collections.sort(students,new StudentNameComparator());
        System.out.println(students);

        Collections.sort(students,new StudentNameComparator().thenComparing(new StudentDeptComparator()));
        System.out.println(students);
    }
}
