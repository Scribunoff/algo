package Algo;

public class InsertSort {
	public static void insertsort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int point = array[i];
			int j = i;
			
			while (j > 0 && array[j - 1] > point) {
				array[j] = array[j-1];
				j = j - 1;
			}
			array[j] = point;
		}
	}
}
