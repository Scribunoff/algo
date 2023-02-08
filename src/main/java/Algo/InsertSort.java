package Algo;

import java.util.List;

public class InsertSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(List<T> elements) {
		for (int i = 1 ; i < elements.size() ; i++) {
			T point = elements.get(i);
			int j = i;

			while (j > 0 && large(elements.get(j - 1), point)) {
				elements.set(j, elements.get(j - 1));
				j--;
			}
			elements.set(j, point);
		}
	}

	private boolean large(T k1, T k2) {
		return k1.compareTo(k2) > 0;
	}
}
