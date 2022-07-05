package com.stack;

public class MinStack {
	NodeL head;

	public MinStack() {
		head = null;
	}

	public void push(int val) {
		if(head==null) {
			head = new NodeL(val, val, null);
		}else {
			head = new NodeL(val, Math.min(val, head.min), head);
		}

	}

	public void pop() {
		head = head.next;

	}

	public int top() {
		return head.data;
	}

	public int getMin() {
		return head.min;
	}

	private class NodeL {
		NodeL next;
		int data;
		int min;

		public NodeL() {

		}

		public NodeL(int data, int min, NodeL next) {
			this.data = data;
			this.min = min;
			this.next = next;
		}

	}

	public static void main(String[] args) {
		MinStack ms = new MinStack();
		ms.push(-4);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getMin());
		System.out.println(ms.top());
	}

}
