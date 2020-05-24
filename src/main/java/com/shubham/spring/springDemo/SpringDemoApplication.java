package com.shubham.spring.springDemo;

import com.shubham.spring.springDemo.basic.BinarySearchImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
@Configuration  // For using spring core replace @SpringBootApplication with this
@ComponentScan("com.shubham.spring.springDemo") //@SpringBootApplication was doing component scan for us, but not @Configuration hence we need to specify @ComponentScan
public class SpringDemoApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortImpl()); // Tightly Coupled

//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoApplication.class); //SpringApplication was present in spring Boot hence replacing it with AnnotationConfigApplicationContext

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class); //refers to same instance as binarySearch

		System.out.println("binary Search"+binarySearch);

		System.out.println("binary serach 1"+binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12,4,3,2},2);
		System.out.println("Result="+result);
	}

}
