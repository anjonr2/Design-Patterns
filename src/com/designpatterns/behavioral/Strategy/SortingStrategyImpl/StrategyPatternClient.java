package com.designpatterns.behavioral.Strategy.SortingStrategyImpl;

public class StrategyPatternClient {
    public static void main(String []args){
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int arr [] = {5,6,1,7,3};
        sortingContext.performSort(arr); // sorting using BubbleSort strategy

        //Changed sorting strategy to MergeSortContext
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSort(arr);
    }
}
