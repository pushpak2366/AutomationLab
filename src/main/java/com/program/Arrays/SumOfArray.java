package com.program.Arrays;

public class SumOfArray {
	
	
	public static void main(String[] args) {
		int[] arr= {1,2};
		
		int sum = 0;
		
		for (int i : arr) {
			
			sum+=i;
			
		}
		System.out.println("Sum of total array is"+" "+sum);
		
	}

}
