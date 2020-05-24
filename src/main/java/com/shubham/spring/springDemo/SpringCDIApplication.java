package com.shubham.spring.springDemo;

import com.shubham.spring.springDemo.CDI.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
public class SpringCDIApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringCDIApplication.class);  //Used for printing output instead of system.out

    public static void main(String[] args) {


        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

        SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);


        logger.info("{}",business);

    }

}
