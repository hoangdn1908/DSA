/**
 * Class Node implement an elements (a node) of a linked-list.
 * Each element of the list has an item of generic type T and a reference variable named next.
 * Please refer to Topic 5 exercises for the Node class in detail.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week7;

public class Node<T> {
  // QUESTION 1
  // Write java code to implement this class
  
    public T val;
    public Node<T> next;

    public Node(T getVal)
    {
        this.val = getVal;
        this.next = null;
    }

    public Node(T getVal, Node<T> next)
    {
        this.val = getVal;
        this.next = next;
    }

    public T getData()
    {
        return this.val;
    }

    public Node<T> getNext()
    {
        return next;
    }

    public void setNext(Node<T> node)
    {
        this.next = node;
    }
  // End of the class  
}