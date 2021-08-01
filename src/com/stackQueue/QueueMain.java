package com.stackQueue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue((56));
		queue.enqueue((70));
		queue.enqueue((30));
		System.out.println("Before dequeue");
		queue.show();
		System.out.println();
		queue.dequeue();
		queue.dequeue();
		System.out.println("After dequeue");
		queue.show();

	}

}
