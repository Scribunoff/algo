package Algo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SortTest {
    Integer[] elements = new Integer[]{5,8,2,5,7,8,1,3,79,2};
    List<Integer> expected = Stream.of(elements).sorted().toList();
    @Test
    public void bubbleSortTesting() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> actual = new ArrayList<>(Arrays.stream(elements).toList());
        bubbleSort.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void insertSortTesting() {
        InsertSort<Integer> integerInsertSort = new InsertSort<>();
        List<Integer> actual = new ArrayList<>(Arrays.stream(elements).toList());
        integerInsertSort.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void selectionSortTesting() {
        SelectionSort<Integer> integerSelectionSort = new SelectionSort<>();
        List<Integer> actual = new ArrayList<>(Arrays.stream(elements).toList());
        integerSelectionSort.sort(actual);
        assertEquals(expected, actual);
    }
}