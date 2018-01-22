package com.amzn.utility;

public interface IOOperations<T> {
    
    void persistTo(T t);
    T fetchFrom();
}
