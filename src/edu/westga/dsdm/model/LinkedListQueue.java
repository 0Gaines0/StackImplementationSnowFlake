package edu.westga.dsdm.model;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedListQueue - implements the Queue interface
 *
 * @author CS3151
 * @version Spring 2023
 * @param <T> the type of the queue elements
 */
public class LinkedListQueue<T> implements IterableQueue<T> {
	private LinkedList<T> elements;

	/**
	 * Initialize newly created queue
	 */
	public LinkedListQueue() {
		this.elements = new LinkedList<T>();
	}

	@Override
	public boolean isEmpty() {
		return this.elements.isEmpty();
	}

	@Override
	public int size() {
		return this.elements.size();
	}

	@Override
	public Iterator<T> iterator() {
		return this.elements.iterator();
	}

	@Override
	public void enqueue(T newValue) {
		this.elements.addLast(newValue);
	}

	@Override
	public T peek() {
		return this.elements.getFirst();
	}

	@Override
	public T dequeue() {
		return this.elements.removeFirst();
	}
}
