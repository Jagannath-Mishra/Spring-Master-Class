package com.spring.indepth.SpringDemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	// What are the beans ??
	// Beans are nothing but simple instance of a class and we can define beans by providing 
	// @Component annotation.
	
	// What are the Dependency of a bean?
	// We can wired dependency Z=of a bean by @ Autowired annotation.
	
	// Where to search beans --> in Spring boot no need 
	// Because com.spring.indepth.SpringDemo and its sub-packages will automatically scanned in spring boot.
	public static void main(String[] args) {
		
		//New Way of writing the code for dependency injection.
	
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringDemoApplication.class, args);
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
		
	}
}
