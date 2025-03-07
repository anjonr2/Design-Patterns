package com.designpatterns.behavioral.Strategy.SortingStrategyImpl;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using Merge Sort Algorithm");
    }
}
