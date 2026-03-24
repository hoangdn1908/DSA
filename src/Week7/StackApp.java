/**
 * Class StackApp demonstrate how to use the Stack ADT including 
 * two implementation versions: array-based stack and list-based stack
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week7;

public class StackApp {
  /**
   * Constructor for objects of class StackApp
   */
  public StackApp() {
  }

  public static void main(String[]args) {
    // Initialize an list-based stack with integer items
    ListBasedStack<Integer> listStack1 = new ListBasedStack<Integer>();

    System.out.println("Push three items into the stack of integers:");                
    listStack1.push(100);
    listStack1.push(200);
    listStack1.push(300);
    System.out.println(listStack1.toString());    

    // Initialize an list-based stack with Book items
    ListBasedStack<Book> listStack2 = new ListBasedStack<Book>();
    Book book1 = new Book("Java for Dummies","Barry A. Burd");
    Book book2 = new Book("Java: A Beginner’s Guide","Herbert Schildt");
    Book book3 = new Book("Head First Java","Kathy Sierra");

    System.out.println("Push three books into the stack of Books:");       
    listStack2.push(book1);
    listStack2.push(book2);
    listStack2.push(book3);
    System.out.println(listStack2.toString());  
    
    Book book4 = listStack2.pop();
    System.out.println("Pop one item from the stack. Returned item is: " + book4);
  }
}
