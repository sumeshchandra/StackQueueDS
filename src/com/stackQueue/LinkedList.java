package com.stackQueue;

public class LinkedList<T> {

	Node<T> head;

	/**
	 * Appends elements at the end of the list
	 *
	 * @param data elements passed
	 */
	public void add(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}

	/**
	 * Appends elements at the start of list
	 *
	 * @param data elements passed
	 */
	public void addAtStart(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Used to insert elements at a particular index
	 *
	 * @param index at which you want to insert element
	 * @param data  elements passed
	 */
	public void add(int index, T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;

		if (index == 0) {
			addAtStart(data);
		} else {
			Node<T> node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			newNode.next = node.next;
			node.next = newNode;
		}
	}

	/**
	 * This method pops the first element
	 */
	public void popFirst() {
		if (head == null) {
			return;
		} else {
			Node<T> newHead = head.next;
			head = newHead;
		}
	}

	/**
	 * This method pops the last element
	 */
	public void popLast() {
		Node<T> previousNode = head;
		Node<T> currentNode = head;

		while (currentNode.next != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = null;
	}

	/**
	 * This method is used to search where the element is present
	 *
	 * @param data the element to be searched. i = index
	 * @return Index at which th element is present in the list.
	 */
	public int search(T data) {
		Node<T> currentNode = head;
		int i = 0;

		while (currentNode.next != null) {
			if (currentNode.data == data) {
				break;
			}
			currentNode = currentNode.next;
			if (currentNode == null) {
				return -1;
			}
			i++;
		}
		return i;
	}

	/**
	 * This method is used to delete element at particular index
	 *
	 * @param index
	 */
	public void delete(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> node = head;
			Node<T> node1 = null;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			node1 = node.next;
			node.next = node1.next;
		}
	}

	/**
	 * This method is used to find the size of list
	 *
	 * @return count ie.size
	 */
	public int size() {
		Node<T> currentNode = head;
		int count = 0;
		while (currentNode != null) {
			currentNode = currentNode.next;
			count++;
		}
		return count;
	}
	
	 /**
     * Method to find the first element in the stack
     *
     * @return first element
     */
    public T peek() {
        Node<T> first = head;
        //return(first == null) ? null : first.data;

        if (first == null) {
            return null;
        } else {
            return (first.data);
        }
    }

    /**
     * Method to remove top most element from Stack
     */
    public int pop() {
        if (head != null) {
            System.out.println("Pop Operation...");
            int size = 0;
            int temp = (int) head.data;
            head = head.next;
            size--;
            return temp;
        } else {
            System.out.println("Empty list");
            return -1;
        }
    }
    
	/**
	 * This method prints all the elements Here Traverse till the null and print
	 * till the last node's next element is null
	 */

	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
