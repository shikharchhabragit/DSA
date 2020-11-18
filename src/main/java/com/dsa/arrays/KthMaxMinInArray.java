package com.dsa.arrays;

import java.util.Arrays;
import java.util.Collections;

public class KthMaxMinInArray {
	
	public void findKthMin(int [] arr , int k) {
		arr= Arrays.stream(arr).sorted().toArray();
		Arrays.stream(arr).forEach(x -> {
			System.out.print(x+ " ");
		});
		System.out.println();
		System.out.println(k+"th min "+arr[k-1]);
	}
	
	public void findKthMax(int []arr , int k) {
		arr= Arrays.stream(arr).sorted().toArray();
		Arrays.stream(arr).forEach(x -> {
			System.out.print(x+ " ");
		});
		System.out.println();
		System.out.println(k+"th max "+ arr[arr.length-k]);
	}
	
	public static void main(String[] args) {
		int arr [] = new int [] {10,2,13,14,6,7};
		KthMaxMinInArray arrayOperation = new KthMaxMinInArray();
		arrayOperation.findKthMin(arr, 3);
		arrayOperation.findKthMax(arr, 3);
	}
}
