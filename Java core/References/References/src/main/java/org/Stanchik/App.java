package org.Stanchik;

import java.lang.ref.SoftReference;

public class App
{
    public static void main( String[] args )
    {
        StringBuilder builder = new StringBuilder(); // builder -- strong-ссылка на объект StringBuilder
        SoftReference<StringBuilder> softBuilder = new SoftReference<StringBuilder>(builder); // strong-ссылка на soft-ссылку

    }
}
