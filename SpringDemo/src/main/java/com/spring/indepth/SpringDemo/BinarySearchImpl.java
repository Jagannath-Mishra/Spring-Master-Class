package com.spring.indepth.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
		@Autowired
		private SortAlgorithm sortAlgorithm;
		
		BinarySearchImpl(SortAlgorithm sortAlgorithm){
			
			this.sortAlgorithm = sortAlgorithm;
		}

		public int binarySearch(int[] numbers, int numberToSearchFor) {
			
			int[] sortedNumber = sortAlgorithm.sort(numbers);
			System.out.println(sortAlgorithm);
			return 3;
		}
		// Sorting an array
		// Search the arrya
		// Return result
}
