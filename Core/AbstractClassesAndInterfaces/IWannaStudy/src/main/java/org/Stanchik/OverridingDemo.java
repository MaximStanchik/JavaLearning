package org.Stanchik;

public class OverridingDemo {
    public static void main( String[] args )
    {
        JavaChallenger javaChallenger = new JavaChallenger(); // можно вызывать только методы, которые определены в классе JavaChallenger
        javaChallenger.doChallenge();
        javaChallenger.doSomething();

        Challenger challenger = new JavaChallenger(); // можно вызывать только те методы, которые определены в интерфейсе Challenger
        challenger.doChallenge();

        JavaChallenger_1 javaChallenger_1 = new JavaChallenger_1(); // в интерфейсе, помимо неявно абстрактных методов, можно писать еще переменные, в классе, который имплеменитрует интерфейс, можно менять значения переменных
        System.out.println(javaChallenger_1.oldName);
        System.out.println(javaChallenger_1.number_1);
        System.out.println(javaChallenger_1.name_2);

        Challenger_1 challenger_1 = new JavaChallenger_1(); // экземпляр класса JavaChallenger_1 создается и присваивается переменной типа Challenger_!
        //challenger_1.number = 3; // а тут нельзя менять (((

        AbstractClassMutation abstractClassMutation = new AbstractClassImpl();
        abstractClassMutation.doSomethingElse();

    }
}
