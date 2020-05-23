package com.shubham.spring.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
