package Algo;

public class QuickSort {
	
	public static void quicksort(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		sort(arr, low, high);
	}

	private static void sort(int[] array, int low, int high) {
		if (low > high) {
			return;
		}
		int left = low;
		int right = high;
		int middle = (left + right)/2;
		
		while (low <= high) {
			if (array[low] <= array[middle]) {
				if (low > middle) {
					int temp = array[low];
					array[low] = array[middle];
					array[middle] = temp;
					middle = low;
				}
				low++;
			} else if (array[high] >= array[middle]) {
				if (high < middle) {
					int temp = array[high];
					array[high] = array[middle];
					array[middle] = temp;
					middle = high;
				}
				high--;
			} else {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			low++;
			high--;
			}
		}
		sort(array, left, middle-1);
		sort(array, middle + 1, right);
	}
}

