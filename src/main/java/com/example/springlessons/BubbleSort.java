package com.example.springlessons;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm{
    public int [] sort(int [] arr){
        return arr;
    }
}
