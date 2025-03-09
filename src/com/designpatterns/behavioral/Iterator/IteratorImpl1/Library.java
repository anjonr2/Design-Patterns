package com.designpatterns.behavioral.Iterator.IteratorImpl1;

import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books){
        this.books=books;
    }

    public Iterator createIterator(){
        return (Iterator) new BookIterator(books);
    }
}
