package com.shubham.spring.springDemo;

import com.shubham.spring.springDemo.CDI.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages

@Configuration
@ComponentScan
public class SpringCDIApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringCDIApplication.class);  //Used for printing output instead of system.out

    public static void main(String[] args) {


        //ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoApplication.class);


        SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);


        logger.info("{}",business);

    }

}
