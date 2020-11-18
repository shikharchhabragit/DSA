package com.dsa.arrays;

import java.util.Arrays;

public class ReverseTheArray {
	
	public void reverseArray(int [] arr ) {
		if(arr.length == 0) {
			System.out.println("Empty array");
			return;
		}
		int temp; 
		int begin =0;
		int end = arr.length-1;
		while(begin<end) {
			temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin ++;
			end --;
		}
		
	}
	
	public void printTheArray(int []arr ){
		if(arr.length> 0) {
			System.out.print("Array : ");
			Arrays.stream(arr).forEach(x -> {
				System.out.print(x+" ");
			});
			System.out.println();
		}
		else {
			System.out.println("Array size is empty");
		}
	}
	
	public static void main(String[] args) {
		int arr [] = new int [] {10,2,13,14,6,7};
		ReverseTheArray reverseArray = new ReverseTheArray();
		reverseArray.printTheArray(arr);
		reverseArray.reverseArray(arr);
		reverseArray.printTheArray(arr);
	}
}
