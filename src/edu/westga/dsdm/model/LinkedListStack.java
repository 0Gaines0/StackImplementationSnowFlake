package edu.westga.dsdm.model;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack<T> implements IterableStack<T> {
	private LinkedList<T> elements;
	
	/**
	 * Instantiates a new linked list stack.
	 */
	public LinkedListStack() {
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
	public void push(T newValue) {
		this.elements.addFirst(newValue);
	}
	
	@Override 
	public T peek() {
		return this.elements.getFirst();
	}
	
	@Override
	public T pop() {
		return this.elements.removeFirst();
	}
}
