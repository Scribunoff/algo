package org.Algo;

import Algo.BubbleSort;
import Algo.InsertSort;
import Algo.MergeSort;
import Algo.QuickSort;
import Algo.SelectionSort;
import Algo.HeapSort;
import java.util.Scanner;
import java.util.Random;

public class Main {

	private static void elements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	private static void minimal(int[] array) {
		int min = array[0];
		int ind = 0;
		for (int i=1; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
				ind = i;
			}
		}
		System.out.println(min);
		System.out.println(ind);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		Random rd = new Random();
		int[] nums = new int[length];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(10000);
		}
		
		elements(nums);
		minimal(nums);
		Algo.HeapSort.heapsort(nums);
		elements(nums);
		
	}
}
