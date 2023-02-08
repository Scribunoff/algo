package Algo;

import java.util.List;

public class QuickSort<T extends Comparable<T>> implements Sorting<T> {
	@Override
	public void sort(List<T> elements) {
		int low = 0;
		int high = elements.size() - 1;
		sort(elements, low, high);
	}

	private void sort(List<T> elements, int low, int high) {
		if (low > high) {
			return;
		}
		int left = low;
		int right = high;
		int middle = (left + right) / 2;

		while (low <= high) {
			if (!larger(elements.get(low), elements.get(middle))) {
				if (low > middle) {
					T temp = elements.get(low);
					elements.set(low, elements.get(middle));
					elements.set(middle, temp);
					middle = low;
				}
				low++;
				//elements.get(high) >= elements.get(middle)
			} else if (!larger(elements.get(middle), elements.get(high))) {
				if (middle > high) {
					T temp = elements.get(high);
					elements.set(high, elements.get(middle));
					elements.set(middle, temp);
					middle = high;
				}
				high--;
			} else {
				T temp = elements.get(low);
				elements.set(low, elements.get(high));
				elements.set(high, temp);
				low++;
				high--;
			}
		}
		sort(elements, left, middle - 1);
		sort(elements, middle + 1, right);
	}

	private boolean larger(T k1, T k2) {
		return k1.compareTo(k2) > 0;
	}


}

