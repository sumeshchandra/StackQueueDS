package com.stackQueue;

public class Stack<T> {

    LinkedList<T> numberList = new LinkedList<T>();

    /**
     * This method is used to add elements to the stack
     *
     * @param data element passed
     */
    public void push(T data) {
        numberList.addAtStart(data);
    }

    /**
     * Method to find the first element in the stack
     *
     * @return first element
     */
    public T peek() {
        return numberList.peek();
    }

    /**
     * Method to remove top most element from Stack
     */
    public void pop() {
        numberList.pop();
    }

    /**
     * This method prints all the elements
     * Here Traverse till the null and
     * print till the last node's next element is null
     */
    public void show() {
        numberList.show();
    }
}
