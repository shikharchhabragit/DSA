package com.dsa.arrays;

import java.util.Arrays;

public class FindMaxMinInArray {
	
	public void findMax(int [] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max Element "+ max);
	}
	
	public void findMin(int [] arr) {
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("Min Element "+ min);
	}
	
	public static void main(String[] args) {
		int arr [] = new int [] {10,-2,2,13,14,6,7};
		FindMaxMinInArray arrayOperations = new FindMaxMinInArray();
		arrayOperations.findMin(arr);
		arrayOperations.findMax(arr);
	}
}
