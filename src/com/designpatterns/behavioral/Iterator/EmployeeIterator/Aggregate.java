package com.designpatterns.behavioral.Iterator.EmployeeIterator;

//defines the method for creating iterator
public interface Aggregate <T>{
    Iterator<T> createIterator();
}
