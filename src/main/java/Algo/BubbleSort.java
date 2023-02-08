package Algo;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sorting<T>{

	@Override
	public void sort(List<T> elements) {
		T temp;
		for (int i = 0 ; i < elements.size() - 1; i++) {
			for (int j = 0 ; j < elements.size() - i - 1; j++) {
				if (!less(elements.get(j), elements.get(j + 1))) {
					temp = elements.get(j);
					elements.set(j, elements.get(j+1));
					elements.set(j+1, temp);
				}
			}
		}
	}

	private boolean less(T k1, T k2) {
		return k1.compareTo(k2) < 0;
	}


}
 