package com.spring.indepth.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
		@Autowired
		private SortAlgorithm sortAlgorithm;
		
		
		//Constructor Injection ( For mandatory Dependency)
		/*BinarySearchImpl(SortAlgorithm sortAlgorithm){
			
			this.sortAlgorithm = sortAlgorithm;
		}*/
		//in debug log: Autowiring by type from bean name 'binarySearchImpl' via constructor

		//Setter Injection ( Optional dependency )
		/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
			this.sortAlgorithm = sortAlgorithm;
		}*/
		//In Debug Log: Autowiring by type from bean name 'binarySearchImpl' to bean named 'quickSortAlgo'
		
		
		// No constructor and no sertter
		//  log : Autowiring by type from bean name 'binarySearchImpl' to bean named 'quickSortAlgo'
		
		
		public int binarySearch(int[] numbers, int numberToSearchFor) {
			
			int[] sortedNumber = sortAlgorithm.sort(numbers);
			System.out.println(sortAlgorithm);
			return 3;
		}
		// Sorting an array
		// Search the arrya
		// Return result

		
}
