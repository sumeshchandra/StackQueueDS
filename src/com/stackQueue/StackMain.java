package com.stackQueue;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(70);
//		stack.push(30);
//		stack.push(56);
//		stack.show();
		try {
			stack.push(70);
			stack.push(30);
			stack.push(56);
			System.out.println("Stack list..");
			stack.show();

			while (stack.peek() != null) {
				System.out.println("First element is " + stack.peek());
				stack.pop();
				stack.show();
			}

		} catch (Exception e) {
			System.out.println("Empty Stack ");
		}
	}
}
