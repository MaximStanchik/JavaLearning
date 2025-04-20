package org.Stanchik;

@FunctionalInterface
public interface Converter<T, N> {
    N convert (T t);

    static <T> boolean isNotNull(T t) {
        return t != null;
    }

    default void writeToConsole(T t) {
        System.out.println("Текущий объект - " + t.toString());
    }

    boolean equals(Object obj);
}
