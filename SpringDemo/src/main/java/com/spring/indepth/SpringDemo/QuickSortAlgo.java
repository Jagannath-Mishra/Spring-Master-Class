package com.spring.indepth.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgorithm{

	public int[] sort(int [] numbers) {
		//return new int[] {1,2,3,4,5};
		
		System.out.println("Running Quick Sort algo");
		return numbers;
	}
}
