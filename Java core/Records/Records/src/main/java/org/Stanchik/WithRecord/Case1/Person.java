package org.Stanchik.WithRecord.Case1;

record Person(String name, int age) {

    Person{

        if(age<1 || age > 110){
            age = 18;
        }
    }
}
