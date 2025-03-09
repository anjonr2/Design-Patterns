package com.designpatterns.behavioral.Iterator.EmployeeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String []args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("test",5000));
        employees.add(new Employee("Alice",70000));
        employees.add(new Employee("Charl",60000));

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()){
            totalSalary+=iterator.next().getSalary();
        }
    }
}
