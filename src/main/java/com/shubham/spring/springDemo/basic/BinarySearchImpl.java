package com.shubham.spring.springDemo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")  //to change the scope of bean from default singleton to prototype
//passing scope hardcoaded like above, is not a good practice hence we use ConfigurableBeanFactory
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

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
}
