package Algo;

public class MergeSort {
	
	public static void mergesort(int[] array) {
		if (array.length < 2) {
				return;
			}
			
			int middle = array.length / 2 ;
			int[] left = new int[middle];
			int[] right = new int[array.length - middle];
			
			for (int i = 0; i < middle; i++) {
				left[i] = array[i];
			}
			
			for (int i = 0; i < array.length - middle; i++) {
				right[i] = array[i + middle];
			}
			
			mergesort(left);
			mergesort(right);
			merge(array, left, right);
	}
	
	public static void merge (int[] array, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int ind = 0;
		
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				array[ind++] = left[i++];
			} else {
				array[ind++] = right[j++];
			}
		}
		
		for (int left_index = i; left_index < left.length; left_index++) {
			array[ind++] = left[left_index];
		}
		
		for (int right_index = j; right_index < right.length; right_index++) {
			array[ind++] = right[right_index];
		}
	}
}
 