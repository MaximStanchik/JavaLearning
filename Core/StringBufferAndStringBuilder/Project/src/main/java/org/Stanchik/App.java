package org.Stanchik;

public class App 
{
    public static void main( String[] args ) {
        //---------- Использование StringBuffer ----------//

        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость: " + strBuffer.capacity()); //кол-во символов которые зарезервированы в памяти (20 -- строка состоит из 4 символов + 16 символов зарезервировано в памяти)
        strBuffer.ensureCapacity(32);
        System.out.println("Емкость: " + strBuffer.capacity());
        System.out.println("Длина: " + strBuffer.length()); //кол-во символов в строке
        System.out.println(strBuffer.toString());
        System.out.println(strBuffer);

        //---------- Получение и установка символов ----------//
        char c = strBuffer.charAt(0);
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer);

        StringBuffer strBuffer_1 = new StringBuffer("world");
        int startIndex = 1;
        int endIndex = 4;
        char[] buffer = new char[endIndex - startIndex];
        strBuffer_1.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer);

        //---------- Добавление в строку ----------//

        StringBuffer stringBuffer_2 = new StringBuffer("hello");
        stringBuffer_2.append(" world"); // добавляет подстроку в конец StringBuilder
        System.out.println(stringBuffer_2.toString());

        StringBuffer stringBuffer = new StringBuffer("word");
        stringBuffer.insert(3, 'l');
        System.out.println(stringBuffer);
        stringBuffer.insert(0, "s");
        System.out.println(stringBuffer);

        //---------- Удаление символов ----------//
        StringBuffer stringBuffer_9 = new StringBuffer("assembler");
        stringBuffer_9.delete(0, 2);
        System.out.println(stringBuffer_9.toString());

        stringBuffer_9 .deleteCharAt(6);
        System.out.println(stringBuffer_9.toString());

        //---------- Обрезка строки ----------//
        StringBuffer stringBuffer19 = new StringBuffer("hello java!");
        String strrring1 = stringBuffer19.substring(6);
        System.out.println(strrring1);

        String strrrring2 = stringBuffer19.substring(3, 9);
        System.out.println(strrrring2);

        //---------- Изменение длины ----------//
        StringBuffer stringBuffer20 = new StringBuffer("hello");
        stringBuffer20.setLength(10);
        System.out.println(stringBuffer20.toString());

        stringBuffer20.setLength(4);
        System.out.println(stringBuffer20.toString());

        //---------- Замена в строке ----------//
        StringBuffer stringBuffer111 = new StringBuffer("hello world!");
        stringBuffer111.replace(6, 11, "java");
        System.out.println(stringBuffer111.toString());

        //---------- Обратный порядок в строке ----------//
        StringBuffer stringBuffer1111 = new StringBuffer("assembler");
        stringBuffer1111.reverse();
        System.out.println(stringBuffer1111.toString());




    }
}
