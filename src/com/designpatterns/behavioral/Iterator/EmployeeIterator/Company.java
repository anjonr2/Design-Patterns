package com.designpatterns.behavioral.Iterator.EmployeeIterator;

import java.util.List;

public class Company implements Aggregate<Employee>{
    List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator<>(employees);
    }
}
