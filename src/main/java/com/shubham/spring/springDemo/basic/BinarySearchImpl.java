package com.shubham.spring.springDemo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")  //to change the scope of bean from default singleton to prototype
//passing scope hardcoaded like above, is not a good practice hence we use ConfigurableBeanFactory
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")  // Multiple candidates for AutoWire issue can be resolved via this
    private SortingAlgorithm sortingAlgo; //AutoWiring By type

    //Can also be done via AutoWiring by Name

//    public void setSortingAlgo(SortingAlgorithm sortingAlgo) {
//        this.sortingAlgo = sortingAlgo;
//    } Not using setter and constructor will work

//    public BinarySearchImpl(SortingAlgorithm sortingAlgo) {
//        this.sortingAlgo = sortingAlgo;
//    } We can use a setter instead of constructor

    public int binarySearch(int[] arr,int number) {

//        BubbleSortImpl bubbleSort = new BubbleSortImpl(); //Tightly Coupled
        int[] sorted = sortingAlgo.sort(arr); //Loosely coupled through interface
        return 3;
    }

    @PostConstruct  //Method containing this annotation will be called just after the bean is created
    public void postConstruct() {
        logger.info("postConstruct is called just after bean is created");
    }

    @PostConstruct
    public void called() {
        logger.info("Bean created");
    }

   @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy is called just before the instance is removed");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Bean getting destroyed");
    }
}
