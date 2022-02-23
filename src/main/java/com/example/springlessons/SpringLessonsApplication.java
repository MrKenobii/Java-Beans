package com.example.springlessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLessonsApplication {

    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());


        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringLessonsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch.binarySearch(new int[] {12,4,6}, 3));

    }

}
