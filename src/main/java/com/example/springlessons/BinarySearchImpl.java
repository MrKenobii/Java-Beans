package com.example.springlessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl  {
    @Autowired
	private SortAlgorithm sortAlgorithm;



    public int binarySearch(int [] arr, int number){
        int [] sortedNumbers = this.sortAlgorithm.sort(arr);
        System.out.println(sortAlgorithm);
        return 1;
    }
}
