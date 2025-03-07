package com.designpatterns.behavioral.Strategy.SortingStrategyImpl;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using Bubble sort algorithm");
    }
}
