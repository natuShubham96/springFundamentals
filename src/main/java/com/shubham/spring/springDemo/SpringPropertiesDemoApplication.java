package com.shubham.spring.springDemo;

import com.shubham.spring.springDemo.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
@Configuration  // For using spring core replace @SpringBootApplication with this
@ComponentScan("com.shubham.spring.springDemo") //@SpringBootApplication was doing component scan for us, but not @Configuration hence we need to specify @ComponentScan
@PropertySource("app.properties")  //To load & Configure the external properties from properties file
public class SpringPropertiesDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringPropertiesDemoApplication.class);

    public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortImpl()); // Tightly Coupled

//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

        try (
                AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoApplication.class); //SpringApplication was present in spring Boot hence replacing it with AnnotationConfigApplicationContext
        ) {
            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

           logger.info("{},{}",service,service.getUrl());
        }
    }
}
