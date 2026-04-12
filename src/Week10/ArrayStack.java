/**
 * Class ArrayStack implements an array-based stack data structure. Each element of the stack is a generic type T.
 * Please refer to Topic 05 for the array-based stack ADT in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week10;

import java.util.NoSuchElementException;

public class ArrayStack<T> {
  // we use an array of Object to store items in the ArrayStack class
  // then we cast any return values to type T in accessor methods
  private Object[] stack;
  private int maxSize = 100;
  private int top;

  /**
   * Constructor for objects of class ArrayStack.
   * This constructor creates an empty stack.
   */
  public ArrayStack() {
    stack = new Object[maxSize];
    top = -1;
  }

  /**
   * This operation returns true if the stack is empty, otherwise it returns false
   */
  public boolean isEmpty() {
    if (top == -1)
      return true;
    else
      return false;
  }

  /**
   * This operation returns true if the stack is full, otherwise it returns false
   */
  public boolean isFull() {
    if (top == maxSize - 1)
      return true;
    else
      return false;
  }

  /**
   * This operation adds a new item to the stack
   */
  public void push(T item) {
    if (!isFull()) {
      top++;
      stack[top] = item;
    }
  }

  /**
   * This operation returns the item at the top position of the stack and deletes
   * this item.
   */
  @SuppressWarnings("unchecked")
  public T pop() {
    if (!isEmpty()) {
      return (T) stack[top--]; // cast the return object to type T
    } else
      throw new NoSuchElementException();
  }

  /**
   * This operation returns an item at the top position of the stack. This item
   * will not be deleted.
   */
  @SuppressWarnings("unchecked")
  public T peek() {
    if (!isEmpty())
      return (T) stack[top]; // cast the return object to type T
    else
      throw new NoSuchElementException();
  }

  /**
   * This operation returns the current length of the stack.
   */
  public int getLength() {
    return top + 1;
  }

  /**
   * This operation remove all items from the stack.
   */
  public void removeAll() {
    top = -1;
  }

  /**
   * This method returns a String representation of the stack.
   */
  public String toString() {
    if (isEmpty())
      return "[]";
    String outTxt = "[" + stack[0];
    for (int i = 1; i <= top; i++)
      outTxt = outTxt + ", " + stack[i];
    outTxt += "]";
    return outTxt;
  }
}