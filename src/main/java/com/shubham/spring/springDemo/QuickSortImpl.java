package com.shubham.spring.springDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortImpl implements SortingAlgorithm{
    public int[] sort(int[] numbers) {
        System.out.println("Quick Sort");
        return numbers;
    }
}
