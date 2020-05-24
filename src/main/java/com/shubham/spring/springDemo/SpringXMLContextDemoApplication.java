package com.shubham.spring.springDemo;

import com.shubham.spring.springDemo.xml.XMLPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication   //This annotation tells spring to search for beans in the package we are in and all its sub packages
// We will not use annotations here as application context is created using xml
public class SpringXMLContextDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringScopeDemoApplication.class);  //Used for printing output instead of system.out

    public static void main(String[] args) {


        //ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

        try (
                ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ) {

            logger.info("Beans loaded {}",(Object)applicationContext.getBeanDefinitionNames()); // This method of application context tells us which beans are loaded by this context
            XMLPersonDao xmlpersondao = applicationContext.getBean(XMLPersonDao.class);

            logger.info("{},{}",xmlpersondao,xmlpersondao.getXmljdbcConnection());
        }
    }
}
