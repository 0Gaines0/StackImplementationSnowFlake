package edu.westga.dsdm.model;

import java.util.Iterator;

/**
 * Stack Interface
 *
 * @author CS3151
 * @version Spring 2023
 * @param <T> the type of the stack elements
 */
public interface IterableStack<T> extends Iterable<T> {
	/**
	 * Determines whether the stack is empty
	 *
	 * @return true if the stack is empty
	 */
	boolean isEmpty();

	/**
	 * Determines number of elements in the stack
	 *
	 * @return number of elements in the stack as integer
	 */
	int size();

	/**
	 * Yields iterator for the stack
	 *
	 * @return an <code>Iterator</code> that will yield the elements of the stack
	 */
	Iterator<T> iterator();

	/**
	 * Adds a new value at the top of the stack
	 *
	 * @param newValue element to be inserted into the stack
	 */
	void push(T newValue);

	/**
	 * Access the value at the top of the stack
	 *
	 * @return element at the top of the stack
	 * @exception java.util.Exception no matching value
	 */
	T peek();

	/**
	 * Removes and returns the value at the top of the stack
	 *
	 * @return element at the top of the stack
	 * @exception java.util.Exception no matching value
	 */
	T pop();
}
