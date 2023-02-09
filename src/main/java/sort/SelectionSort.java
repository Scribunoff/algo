package sort;

import java.util.List;

public class SelectionSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(List<T> elements) {
		if (elements == null) {
			throw new IllegalArgumentException("Array mustn't be null");
		}

		if (elements.size() < 2) {
			return;
		}

		for (int i = 0 ; i < elements.size() - 1; i++) {
			int min = i;
			for (int j = i + 1 ; j < elements.size(); j++) {
				if (less(elements.get(j), elements.get(min))) {
					min = j;
				}
			}
			swap(elements, min, i);
		}
	}
}
