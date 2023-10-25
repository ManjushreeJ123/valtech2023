package com.valtech.training;

public class ArrayMountain {
	public static void main(String[] args) {
		int[] array= {4,5,1,2,3};
		if(isAscending(array)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
	
		public static boolean isAscending(int[] array) {
			for(int i=1;i<array.length;i++) {
				if (array[i]<array[i-1]) {
					return true;
					
				}
		}
			return false;
		
		
	}
		public static boolean isDescening(int[] array) {
			for(int i =1;i<array.length;i++) {
				if(array[i]>array[i-1]) {
					return true;
				}
			}
			return false;
		}
	


}
