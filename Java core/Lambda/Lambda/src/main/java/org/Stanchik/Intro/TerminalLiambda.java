package org.Stanchik.Intro;

public class TerminalLiambda {
    public static void main(String[] args) {
        Printable printer = s->System.out.println(s);
        printer.print("Hello Java!");
    }
}
interface Printable {
    void print(String s);
}
