package sort;

import java.util.List;

public class InsertSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(List<T> elements) {
		if (elements == null) {
			throw new IllegalArgumentException("Array mustn't be null");
		}

		if (elements.size() < 2) {
			return;
		}

		for (int i = 1 ; i < elements.size() ; i++) {
			T point = elements.get(i);
			int j = i;

			while (j > 0 && less(point, elements.get(j - 1))) {
				elements.set(j, elements.get(j - 1));
				j--;
			}
			elements.set(j, point);
		}
	}
}
