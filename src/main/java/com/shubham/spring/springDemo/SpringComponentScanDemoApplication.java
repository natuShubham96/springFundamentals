package com.shubham.spring.springDemo;

import com.shubham.spring.ComponentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
@ComponentScan("com.shubham.spring.ComponentScan")  //Since the required beans are not present in the same pkg and it's sub pkgs, hence we need to give their pkg path here
public class SpringComponentScanDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringComponentScanDemoApplication.class);  //Used for printing output instead of system.out

    public static void main(String[] args) {


        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

       ComponentDAO componentdao = applicationContext.getBean(ComponentDAO.class);


        logger.info("{}",componentdao);

    }

}
