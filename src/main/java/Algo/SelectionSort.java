package Algo;

import java.util.List;

public class SelectionSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(List<T> elements) {
		for (int i = 0 ; i < elements.size() - 1; i++) {
			int min = i;
			for (int j = i + 1 ; j < elements.size(); j++) {
				if (less(elements.get(j), elements.get(min))) {
					min = j;
				}
			}
			T temp = elements.get(min);
			elements.set(min, elements.get(i));
			elements.set(i, temp);
		}
	}

	private boolean less(T k1, T k2) {
		return k1.compareTo(k2) < 0;
	}
}
