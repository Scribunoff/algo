package sort;

import java.util.List;

public interface Sorting<T extends Comparable<T>>{
    void sort(List<T> elements);

    default boolean less(T first, T second) {
        return first.compareTo(second) < 0;
    }

    default boolean lessOrEquals(T first, T second) {
        return first.compareTo(second) <= 0;
    }

    default void swap(List<T> elements, int first, int second) {
        T temp = elements.get(first);
        elements.set(first, elements.get(second));
        elements.set(second, temp);
    }
}
