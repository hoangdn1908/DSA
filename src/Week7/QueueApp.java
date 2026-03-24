/**
 * Class QueueApp demonstrate how to use the Queue ADT including 
 * two implementation versions: array-based stack and list-based stack
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week7;

public class QueueApp {
  /**
   * Constructor for objects of class QueueApp
   */
  public QueueApp() {
  }

  public static void main(String[]args) {
    // Initialize an list-based queue with String items
    ListBasedQueue<String> listQueue1 = new ListBasedQueue<String>();

    System.out.println("Enqueue three items into the queue of Strings:");                
    listQueue1.enqueue("String 1");
    listQueue1.enqueue("String 2");
    listQueue1.enqueue("String 3");
    System.out.println(listQueue1.toString());    

    // Initialize an list-based queue with Student items
    ListBasedQueue<Student> listQueue2 = new ListBasedQueue<Student>();
    Student std1 = new Student("2101140005","Nguyen Van A");
    Student std2 = new Student("2101140006","Le Van B");
    Student std3 = new Student("2101140007","Tran Thi C");
    System.out.println("Enqueue three students into the queue of Students:");
    listQueue2.enqueue(std1);
    listQueue2.enqueue(std2);
    listQueue2.enqueue(std3);
    System.out.println(listQueue2.toString());
    
    Student std4 = listQueue2.dequeue();
    System.out.println("Dequeue one item from the queue. Returned item is: " + std4);
  }
}
