package com.example.demo.services;

import java.util.Comparator;

import com.example.demo.models.FlowerModelGet;

public class FlowerComparator implements Comparator<FlowerModelGet>{
    
    @Override
    public int compare(FlowerModelGet flowerNameOne, FlowerModelGet flowerNameTwo) {
        return flowerNameOne.getName().compareTo(flowerNameTwo.getName());
    }
}
