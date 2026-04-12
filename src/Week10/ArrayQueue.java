/**
 * Class ArrayQueue implements an array-based queue data structure. Each element of the queue is a generic type T.
 * Please refer to Topic 05 for the array-based queue in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week10;

import java.util.NoSuchElementException;

public class ArrayQueue<T> {
  // we use an array of Object to store items in the ArrayQueue class
  // then we cast any return values to type T in accessor methods  
  private Object[] queue;
  private int maxSize=100;
  private int front;
  private int rear;
  private int length;
  /**
   * Constructor for objects of class ArrayQueue.
   * This constructor creates an empty queue.
   */
  public ArrayQueue() {
    queue = new Object[maxSize];
    front = 0;
    rear = 0;
    length = 0;
  }
  /**
   * This operation returns true if the queue is empty, otherwise it returns false
   */    
  public boolean isEmpty() {
    if (front == rear)
      return true;
    else
      return false;
  }
  /**
   * This operation returns true if the queue is full, otherwise it returns false
   */    
  public boolean isFull() {
    if (front == (rear+1) % maxSize)
      return true;
    else
      return false;
  }  
  /**
   * This operation adds a new item to the queue.
   */        
  public void enqueue(T item) {
    if (!isFull()) {
      queue[rear] = item;
      rear = (rear+1) % maxSize;
      length++;
    }
  }
  /**
   * This operation returns the item at the front position of the queue and deletes this item.
   */  
  @SuppressWarnings("unchecked")
  public T dequeue() {
    if (!isEmpty()) {
      T item = (T)queue[front]; // cast the return object to type T
      front = (front+1) % maxSize;
      length--;
      return item;
    } else
      throw new NoSuchElementException();
  }  
  /**
   * This operation returns an item at the front position of the queue. This item will not be deleted.
   */
  @SuppressWarnings("unchecked")
  public T peek() {
    if (!isEmpty())
      return (T)queue[front];
    else
      throw new NoSuchElementException();
  }

  /**
   * This operation returns the current length of the queue. 
   */        
  public int getLength() {
    return length;
  }

  /**
   * This operation remove all items from the queue.
   */        
  public void removeAll() {
    front = 0;
    rear = 0;
    length = 0;
  }    
  
  public String toString() {
    if (isEmpty())
      return "[]";

    int itemCount = 1;
    int index = front;
    String outTxt="[" + queue[index];
    while (itemCount < length) {
      itemCount++;
      index = (index + 1) % maxSize;
      outTxt = outTxt + ", " + queue[index];
    }
    outTxt+="]";
    return outTxt;    
  }    
}
