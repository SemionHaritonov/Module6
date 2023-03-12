package FindMinMax_6_4_2;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;


public class NewMain {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Pair<T> pair = new Pair<>(order);
        stream.forEach(pair::analyze);
        minMaxConsumer.accept(pair.minValue, pair.maxValue);
    }

    private static class Pair<T> {
        Comparator<? super T> order;
        T minValue = null;
        T maxValue = null;
        private Pair(Comparator<? super T> order) {
            this.order = order;
        }
        public void analyze(T t) {
            if (minValue == null || t != null && order.compare(t, minValue) < 0) {
                minValue = t;
            }
            if (maxValue == null || t != null && order.compare(t, maxValue) > 0) {
                maxValue = t;
            }
        }
    }

    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a > b ? a : b;
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.print(a.intValue() + " " + b.intValue());
        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2).limit(10);

        findMinMax(intStream, comparator, biConsumer);

    }
}
