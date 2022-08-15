package com.bridgelabz.data_structure;

import java.util.LinkedList;

public class Deque<T> {
	LinkedList<T> linkedList = new LinkedList<T>();

	public void addFront(T item) {
		linkedList.add(0, item);
	}

	public void addRear(T item) {
		linkedList.addLast(item);
	}

	public T removeFront() {
		return linkedList.remove(0);
	}

	public T removeRear() {
		return linkedList.removeLast();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	public int size() {
		return linkedList.size();
	}
}