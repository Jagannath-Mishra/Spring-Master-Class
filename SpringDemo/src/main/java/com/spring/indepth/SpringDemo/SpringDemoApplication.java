package com.spring.indepth.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	
	public static void main(String[] args) {
		
		//Old Way or writing the code for dependency injection.
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
		int result = binarySearch.binarySearch(new int[] {10, 2, 3}, 2);
		
		System.out.println(result);
		
		

		BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgo());
		
		result = binarySearch2.binarySearch(new int[] {10, 2, 3}, 2);
		
		
		System.out.println(result);
		//SpringApplication.run(SpringDemoApplication.class, args);
	}
}
