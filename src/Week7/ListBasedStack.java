/**
 * Class ListBasedStack implement a stack using linked-list data structure. Each item of the stack has a generic type T.
 * Please refer to Topic 05, exercise 1 for the detail of list-based stack.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week7;

public class ListBasedStack<T> {
  private Node<T> top;
  private int length;

  /**
   * Constructor for objects of class ListBasedStack.
   * This constructor creates an empty stack.
   */
  public ListBasedStack() {
    top = null;
    length = 0;
  }

  /**
   * This operation returns true if the stack is empty, otherwise it returns false
   */    
  public boolean isEmpty() {
    if (top == null)
      return true;
    else
      return false;
  }

  /**
   * This operation returns true if the stack is full, otherwise it returns false
   */    
  public boolean isFull() {
    return false;
  }  
  
  /**
   * This operation adds a new item to the stack.
   */
  public void push(T item) {
  // QUESTION 2
  // Write java code to implement this method    
     Node<T> newNode = new Node<>(item, top);
     top = newNode;
     length++;
  // End of the method    
  }

  /**
   * This operation returns the node at the top position of the stack and deletes this node.
   */    
  // QUESTION 3
  // Write java code to implement pop() and peek() methods      
  public T pop() {    
    T item = null;
    // QUESTION 3 p1
    // Write java code to implement pop() method     
    if(!isEmpty())
    {
      item = top.val;
      top = top.next;
      length--;
    }
    // End of the method
    return item;
  }
  
  /**
   * This operation returns a node at the top position of the Stack. This node will not be deleted.
   */        
  public T peek() {
    T item = null;
    // QUESTION 3 p2
    // Write java code to implement peek() method 
    if(!isEmpty())
    {
      item = top.val;
    }
    // End of the method
    return item;
  }  
  // End of QUESTION 3
  
   /**
   * This operation returns the current length of the stack. 
   */        
  public int getLength() {
    return length;
  }
  /**
   * This operation remove all items from the stack.
   */        
  public void removeAll() {
    top = null;
    length = 0;
  }   
  
  public String toString() {
    if (isEmpty())
      return "[]";
    Node<T> current = top;
    String outTxt="[" + current.getData();
    for (int i=1; i<length; i++) {
      current = current.getNext();
      outTxt = outTxt + " --> " + current.getData();
    }
    outTxt+="]";
    return outTxt;
  }
}