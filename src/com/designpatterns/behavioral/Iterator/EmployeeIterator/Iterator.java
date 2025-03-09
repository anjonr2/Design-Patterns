package com.designpatterns.behavioral.Iterator.EmployeeIterator;

//defined methods to access and traverse the collection
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
