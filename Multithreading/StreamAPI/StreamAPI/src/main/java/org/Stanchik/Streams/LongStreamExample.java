package org.Stanchik.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        // до JDK8:
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;
        for (int i:numbers) {
            if (i > 0) {
                count++;
            }
        }
        System.out.println(count);

        //После JDK 8:
        System.out.println(IntStream.of(numbers).filter(w -> w > 0).count());

        //BaseStream -- базовый функционал с потоками

        //void close() (закрывает поток)
        //boolean isParallel() (если поток параллельный вернет true)
        //Iterator<T> iterator() (возвращает ссылку на итератор потока)
        //Spliterator<T> spliterator() (возвращает ссылку на сплитератор потока)
        //S parallel() (возвращает параллельный поток)
        //S sequential() (возвращает последовательный поток)
        //S unordered() (возвращает неупорядоченный поток)

        //Stream<T>  используется для потоков данных, представляющих любой ссылочный тип

        //boolean allMatch(Predicate<? super T> predicate):
        // возвращает true, если все элементы потока удовлетворяют условию в предикате. Терминальная операция

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        boolean allStartsWithA = names.stream().allMatch(name -> name.startsWith("A"));
        System.out.println("All names start with A: " + allStartsWithA);

        //boolean anyMatch(Predicate<? super T> predicate):
        // возвращает true, если хоть один элемент потока удовлетворяют условию в предикате. Терминальная операция

        boolean isAnyStartsB = names.stream().anyMatch(name -> name.startsWith("B"));
        System.out.println("Any name starts with B: " + isAnyStartsB);

        //<R,A> R collect(Collector<? super T,A,R> collector):
        // добавляет элементы в неизменяемый контейнер с типом R.
        // T представляет тип данных из вызывающего потока, а A - тип данных в контейнере. Терминальная операция
        List<String> collectedNames = names.stream().collect(Collectors.toList());
        System.out.println("Collected names: " + collectedNames);

        //long count(): возвращает количество элементов в потоке. Терминальная операция.

        long countOfNames = names.stream().count();
        System.out.println("Count of names: " + countOfNames);

        //Stream<T> concat​(Stream<? extends T> a, Stream<? extends T> b):
        // объединяет два потока. Промежуточная операция

        //Stream<T> distinct():
        // возвращает поток, в котором имеются только уникальные данные с типом T.
        // Промежуточная операция

        //Stream<T> dropWhile​(Predicate<? super T> predicate):
        // пропускает элементы, которые соответствуют условию в predicate, пока не попадется элемент, который не соответствует условию. Выбранные элементы возвращаются в виде потока. Промежуточная операция.

        //Stream<T> filter(Predicate<? super T> predicate): фильтрует элементы в соответствии с условием в предикате. Промежуточная операция

        //Optional<T> findFirst(): возвращает первый элемент из потока. Терминальная операция

        //Optional<T> findAny(): возвращает первый попавшийся элемент из потока. Терминальная операция

        //void forEach(Consumer<? super T> action): для каждого элемента выполняется действие action. Терминальная операция

        //Stream<T> limit(long maxSize): оставляет в потоке только maxSize элементов. Промежуточная операция

        //Optional<T> max(Comparator<? super T> comparator): возвращает максимальный элемент из потока. Для сравнения элементов применяется компаратор comparator. Терминальная операция

        //Optional<T> min(Comparator<? super T> comparator): возвращает минимальный элемент из потока. Для сравнения элементов применяется компаратор comparator. Терминальная операция

//<R> Stream<R> map(Function<? super T,? extends R> mapper): преобразует элементы типа T в элементы типа R и возвращает поток с элементами R. Промежуточная операция

//<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper): позволяет преобразовать элемент типа T в несколько элементов типа R и возвращает поток с элементами R. Промежуточная операция

        //boolean noneMatch(Predicate<? super T> predicate): возвращает true, если ни один из элементов в потоке не удовлетворяет условию в предикате. Терминальная операция

        //Stream<T> skip(long n): возвращает поток, в котором отсутствуют первые n элементов. Промежуточная операция.

        //Stream<T> sorted(): возвращает отсортированный поток. Промежуточная операция.

        //Stream<T> sorted(Comparator<? super T> comparator): возвращает отсортированный в соответствии с компаратором поток. Промежуточная операция.

        //Stream<T> takeWhile​(Predicate<? super T> predicate): выбирает из потока элементы, пока они соответствуют условию в predicate. Выбранные элементы возвращаются в виде потока. Промежуточная операция.

        //Object[] toArray(): возвращает массив из элементов потока. Терминальная операция.

    }

}
