package com.stackQueue;

public class Queue<T> {
	LinkedList<T> numberList = new LinkedList<T>();

	/**
	 * This method is used to add elements to the queue
	 *
	 * @param data elements passed
	 */
	public void enqueue(T data) {
		numberList.add(data);
	}

	/**
	 * This method prints all the elements Here Traverse till the null and print
	 * till the last node's next element is null
	 */
	public void show() {
		numberList.show();
	}
}
