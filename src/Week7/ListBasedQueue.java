/**
 * Class ListBasedQueue implement a queue using linked-list data structure. Each item of the stack has a generic type T.
 * Please refer to Topic 05, exercise 2 for the detail of list-based queue.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week7;

public class ListBasedQueue<T> {
  private Node<T> front;
  private Node<T> rear;
  private int length;

  /**
   * Constructor for objects of class ListBasedQueue.
   * This construtor creates an empty queue.
   */
  public ListBasedQueue() {
    front = null;
    rear = null;
    length = 0;
  }

  /**
   * This operation returns true if the queue is empty, otherwise it returns false
   */    
  public boolean isEmpty() {
    if ((front == null)&&(rear == null))
      return true;
    else
      return false;
  }

  /**
   * This operation returns true if the queue is full, otherwise it returns false
   */    
  public boolean isFull() {
    return false;
  }   
  
  /**
   * This operation adds a new item to the queue.
   */        
  public void enqueue(T item) {
  // QUESTION 4
  // Write java code to implement this method
    length++;
    if(isEmpty())
    {
      front = new Node<>(item);
      rear = front;
    }
    else
    {
       Node<T> node = new Node<>(item);
       rear.next = node;
       rear = node;
    }
  // End of the method
  }

  /**
   * This operation returns the node at the front position of the queue and deletes this node.
   */
  // QUESTION 5
  // Write java code to implement dequeue() and peek() methods   
  public T dequeue() {
    T item = null;
    // QUESTION 5 p1
    // Write java code to implement pop() method      
    if(!isEmpty())
    {
       length--;
       item = front.getData();
       front = front.next;
       if(front == null)
       {
        rear = null;
       }
    }
    // End of the method
    return item;
  }
  
  /**
   * This operation returns an item at the front position of the queue. This item will not be deleted.
   */        
  public T peek() {
    T item = null;
    // QUESTION 5 p2
    // Write java code to implement pop() method 
    if(!isEmpty())
    {
      item = front.getData();
    }
    // End of the method
    return item;
  }  

  // End of QUESTION 5

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
    front = null;
    rear = null;
    length = 0;
  }   

  public String toString() {
    if (isEmpty())
      return "[]";
    Node<T> current = front;
    String outTxt="[" + current.getData();
    for (int i=1; i<length; i++) {
      current = current.getNext();
      outTxt = outTxt + " --> " + current.getData();
    }  
    outTxt+="]";
    return outTxt;
  }  
}
