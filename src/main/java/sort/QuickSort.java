package sort;

import java.util.List;

public class QuickSort<T extends Comparable<T>> implements Sorting<T>{

    @Override
    public void sort(List<T> elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Array mustn't be null");
        }

        if (elements.size() < 2) {
            return;
        }

        sort(elements, 0, elements.size() - 1);
    }

    private void sort(List<T> elements, int start, int end) {
        if (end > start) {
            int pivotIndex = partition(elements, start, end);
            sort(elements, start, pivotIndex - 1);
            sort(elements, pivotIndex + 1, end);
        }
    }

    private int partition(List<T> elements, int start, int end) {
        T pivot = elements.get(end);
        int i = start - 1;
        for (int j = start ; j < end; j++) {
            if (less(elements.get(j), pivot)) {
                i++;
                if (less(elements.get(j), elements.get(i))) {
                    swap(elements, i, j);
                }
            }
        }
        i++;
        //end - index of pivot
        swap(elements, i, end);
        return i;
    }

}
