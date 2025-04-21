package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        String str1 = "TopJava";
        String str2 = "TopJava";

        String str3 = (new String("TopJava").intern());
        String str4 = (new String("TopJava").intern());

        System.out.println("Строка 1 равна строке 2? " + (str1 == str2));
        System.out.println("Строка 2 равна строке 3? " + (str2 == str3));
        System.out.println("Строка 3 равна строке 4? " + (str3 == str4));

        String str5 = "interned TopJava";
        String str6 = "TopJava";
        String str7 = ("interned " + str2).intern();

        System.out.println("str7 равна str5 ?" + (str7 == str5));

        CHMInterner chmInterner = new CHMInterner();

        chmInterner.intern("TopJava_1");
        chmInterner.intern("TopJava_2");
        chmInterner.intern("TopJava_2");
        chmInterner.intern("TopJava_3");
        chmInterner.intern("TopJava_3");
        chmInterner.intern("TopJava_3");
        chmInterner.intern("TopJava_4");
        chmInterner.intern("TopJava_4");
        chmInterner.intern("TopJava_4");
        chmInterner.intern("TopJava_4");

        System.out.println("Размер пула строк равен: " + chmInterner.internSize());
    }
}
