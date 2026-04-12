/**
 * Class ArrayBTreeApp contains the driver code to demonstrates how to use 
 * the general tree objects derived from the class PPTree.
 * Please refer to Topic 7 for the ArrayBTree ADT in detail.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week9;

public class ArrayBTreeApp {
  /**
   * Constructor for objects of class ArrayBTreeApp
   */
  public ArrayBTreeApp() {
  
  }
  
  public static void main(String[] args) {
    ArrayBTree<String> BT = new ArrayBTree<String>();

    // QUESTION 8
    // Write java code to create a Binary Tree BT


    // End of the question    
    
    // Code for testing addtional operators
    // QUESTION 9:
    System.out.println("Is node 'F' a leaf: " + BT.isLeaf(10));  //false
    System.out.println("Is node 'O' a leaf: " + BT.isLeaf(13));  //true    

    // QUESTION 10:
    System.out.println("The total leaves of the Binary Tree is: " + BT.countLeaves());  //6

    // QUESTION 11:
    System.out.println("The level of node 'A' is: " + BT.getLevel(0));  //0
    System.out.println("The level of node 'J' is: " + BT.getLevel(5));  //2
    System.out.println("The level of node 'F' is: " + BT.getLevel(10));  //3
    System.out.println("The level of node 'L' is: " + BT.getLevel(23));  //4    

    // QUESTION 12:
    System.out.println("The depth of the Binary Tree is: " + BT.getDepth());  //4    
  }
}
