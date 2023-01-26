package edu.westga.dsdm.model;

/**
 * Queue Interface
 *
 * @author CS3151
 * @version Spring 2023
 * @param <T> the type of the queue elements
 */
public interface IterableQueue<T> extends Iterable<T> {
    /**
     * Determines whether the queue is empty
     *
     * @return true if the queue is empty
     */
    boolean isEmpty();
    
    /**
     * Determines number of elements in the queue
     *
     * @return number of elements in the queue as integer
     */
    int size();
    
    /**
     * Adds a new value at the tail of the queue
     *
     * @param newValue element to be inserted into the queue
     */
    void enqueue(T newValue);
    
    /**
     * Access the value at the head of the queue
     *
     * @return element at the head of the queue
     * @exception java.util.Exception no matching value
     */
    T peek();
    
    /**
     * Removes and returns the value at the head of the queue
     *
     * @return element at the head of the queue
     * @exception java.util.Exception no matching value
     */
    T dequeue();
}
