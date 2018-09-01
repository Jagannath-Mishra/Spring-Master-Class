package com.spring.indepth.SpringDemo;



public class BinarySearchImpl {
	
		private SortAlgorithm sortAlgorithm;
		
		BinarySearchImpl(SortAlgorithm sortAlgorithm){
			
			this.sortAlgorithm = sortAlgorithm;
		}

		public int binarySearch(int[] numbers, int numberToSearchFor) {
			
			int[] sortedNumber = sortAlgorithm.sort(numbers);
			System.out.println("Sort algorithm running.");
			return 3;
		}
		// Sorting an array
		// Search the arrya
		// Return result
}
