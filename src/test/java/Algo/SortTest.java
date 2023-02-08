package Algo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SortTest {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    Integer[] elements = new Integer[]{5,8,2,5,7,8,1,3,79,2};
    @Test
    public void bubbleSortTesting() {
        List<Integer> expected = Stream.of(elements).sorted().toList();
        List<Integer> actual = new ArrayList<>(Arrays.stream(elements).toList());
        bubbleSort.sort(actual);
        assertEquals(expected, actual);
    }
}