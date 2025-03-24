package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1.length());
        char[] helloArray = str1.toCharArray();
        System.out.println(helloArray);
        String emptyStr = "";
        if (emptyStr.isEmpty()) {
            System.out.println("Строка пустая");
        }

        String str1_1 = "Java";
        String str2_1 = "Hello";
        String str3_1 = str2.concat(str1_1); //соединяем две строки. К str2 присоединяем str1
        System.out.println(str3_1);

        String str3_2 = String.join(" ", str2_1, str1_1); // так тоже можно соединять, но первый параметр -- разделитель между сроками.
        System.out.println(str3_2);

        String somestring = "Java";
        char c = somestring.charAt(2); // с помощью charAt() можно извлекать символы из строк
        System.out.println(c);

        String strrr = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst = new char[end - start];
        strrr.getChars(start, end, dst, 0);
        System.out.println(dst);

        String string1 = "Hello";
        String string2 = "hello";
        System.out.println("Сравниваем строки с учетом регистра: " + string1.equals(string2));
        System.out.println("Сравниваем строки без учета регистра: " + string1.equalsIgnoreCase(string2));

        String firstString = "Hello world";
        String  secondString = "I work";
        boolean result = firstString.regionMatches(6, secondString, 2, 3);
        System.out.println(result);

        String sttr1 = "hello";
        String sttr2 = "world";
        String sttr3 = "hell";

        System.out.println(sttr1.compareTo(sttr3));
        System.out.println(sttr1.compareTo(sttr2));

        String SomeString = "Hello world";
        int index1 = SomeString.indexOf("l");
        int index2 = SomeString.indexOf("wo");
        int index3 = SomeString.lastIndexOf("l");

        boolean ssstart = SomeString.startsWith("Hel");
        boolean ssend = SomeString.endsWith("rld");

        String newString = SomeString.replace("l", "f");
        System.out.println(newString);
        String superNewString = SomeString.replace("Hello", "Bye");
        System.out.println(superNewString);

        System.out.println("             Hello");
        System.out.println("             Hello".trim());
        System.out.println(SomeString.substring(6));
        System.out.println(SomeString.substring(2, 7));

        System.out.println(SomeString.toLowerCase());
        System.out.println(SomeString.toUpperCase());

        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }


    }
}
