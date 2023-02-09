package sort;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sorting<T>{

	@Override
	public void sort(List<T> elements) {
		if (elements == null) {
			throw new IllegalArgumentException("Array mustn't be null");
		}

		if (elements.size() < 2) {return;}

		for (int i = 0 ; i < elements.size() - 1; i++) {
			for (int j = 0 ; j < elements.size() - i - 1; j++) {
				if (lessOrEquals(elements.get(j + 1), elements.get(j))) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
}
 