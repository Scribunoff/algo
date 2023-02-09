package Algo;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable<T>> implements Sorting<T>{
	private List<T> buffer;
	@Override
	public void sort(List<T> elements) {
		if (elements == null) {
			throw new IllegalArgumentException("Array mustn't be null");
		}

		if (elements.size() < 2) {return;}

		this.buffer = new ArrayList<>(elements.size());
		sort(elements, 0, elements.size() - 1);
		this.buffer = null;
	}

	private void sort(List<T> elements, int min, int max) {
		if (min == max) {return;}

		int mid = (min + max) >> 1;

		sort(elements, min, mid);
		sort(elements, mid + 1, max);

		merge(elements, min, mid, max);
	}

	private void merge(List<T> elements, int min, int mid, int max) {
		if (lessOrEquals(elements.get(mid), elements.get(mid + 1))) {
			return;
		}

		for (int k = min; k <= max; k++) {
			this.buffer.add(k, elements.get(k));
		}

		int left = min;
		int right = mid + 1;

		for (int k = min; k <= max; k++) {
			if (left > mid) {
				elements.set(k, this.buffer.get(right++));
			} else if (right > max) {
				elements.set(k, this.buffer.get(left++));
			} else if (less(this.buffer.get(left), this.buffer.get(right))) {
				elements.set(k, this.buffer.get(left++));
			} else {
				elements.set(k, this.buffer.get(right++));
			}
		}
	}
}
 