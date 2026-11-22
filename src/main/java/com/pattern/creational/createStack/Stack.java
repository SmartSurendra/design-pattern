package com.pattern.creational.createStack;

import java.util.Arrays;

public class Stack<T>{

    private Object[] elements;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    // Default constructor
    public Stack() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.top = -1; // -1 indicates an empty stack
    }

    public void push(T item) {
        if (top == elements.length - 1) {
            resize(); // Double the array size if full
        }
        elements[++top] = item;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {

        return "Sushil's Daughter is Samaira Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", top=" + top +
                "Hello Hey"+
                '}';
    }
}
