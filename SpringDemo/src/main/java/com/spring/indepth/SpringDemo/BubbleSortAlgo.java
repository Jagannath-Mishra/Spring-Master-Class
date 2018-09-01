package com.spring.indepth.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortAlgorithm {

	public int[] sort(int [] numbers) {
		//return new int[] {1,2,3,4,5};
		System.out.println("Bubble Sort Algo is running");
		return numbers;
	}
}
