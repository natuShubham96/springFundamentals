package com.shubham.spring.springDemo;

import com.shubham.spring.springDemo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
@Configuration
@ComponentScan
public class SpringScopeDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringScopeDemoApplication.class);  //Used for printing output instead of system.out

    public static void main(String[] args) {


        //ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoApplication.class);

        PersonDAO persondao = applicationContext.getBean(PersonDAO.class);

        PersonDAO persondao2 = applicationContext.getBean(PersonDAO.class);

        logger.info("{}",persondao);
        logger.info("{}",persondao.getJdbcConnection());

        logger.info("{}",persondao2);
        logger.info("{}",persondao2.getJdbcConnection());


    }

}
