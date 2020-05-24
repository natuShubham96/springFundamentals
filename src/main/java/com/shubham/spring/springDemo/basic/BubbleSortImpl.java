package com.shubham.spring.springDemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortImpl implements SortingAlgorithm {
    public int[] sort(int[] numbers) {
        System.out.println("Bubble Sort");
        return numbers;
    }
}
