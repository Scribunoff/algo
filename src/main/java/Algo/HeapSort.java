package Algo;

public class HeapSort {
	
	public static void heapsort(int[] array) {
		heap(array, array.length);
		for (int i = array.length - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapify(array, i, 0);
		}
	}
	
	private static void heap(int[] array, int n) {
		for (int i = (n / 2 - 1); i >= 0; i--) {
			heapify(array, array.length, i);
		}
	}
		
	private static void heapify(int[] array, int n, int i) {
		int left_child = 2 * i + 1;
		int right_child = 2 * i + 2;
		int largest = i;
		
		if (left_child < n && array[left_child] >array[i]) {
			largest = left_child;
		}
		if (right_child < n && array[right_child] > array[largest]) {
			largest = right_child;
		}
		if (largest != i) {
			int temp = array[largest];
			array[largest] = array[i];
			array[i] = temp;
			heapify(array, n, largest);
		}
	}
}
