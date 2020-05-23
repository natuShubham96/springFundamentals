package com.shubham.spring.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
public class SpringDemoApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortImpl()); // Tightly Coupled

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {12,4,3,2},2);
		System.out.println("Result="+result);
	}

}
