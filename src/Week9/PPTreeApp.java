/**
 * Class PPTreeApp contains the driver code to demonstrates how to use 
 * the general tree objects derived from the class PPTree.
 * Please refer to Topic 7 for the PPTree ADT in detail.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week9;

public class PPTreeApp {
  /**
   * Constructor for objects of class PPTreeApp
   */
  public PPTreeApp() {
  
  }
  
  public static void main(String[] args) {
    PPTree<String> T = new PPTree<String>();
    // QUESTION 1
    // Write java code to create a general Tree T
    T.addNode("A", -1);  // A
    T.addNode("B", 0);   // B
    T.addNode("C", 0);   // C
    T.addNode("D", 1);   // D
    T.addNode("E", 1);   // E
    T.addNode("F", 2);   // F
    T.addNode("G", 2);   // G
    // End of the question    
  
    // Code for testing addtional operators
    // QUESTION 2:
    System.out.println("The degree of node 'J' is: " + T.getDegree(3));  //4
    System.out.println("The degree of node 'M' is: " + T.getDegree(3));  //2

    // QUESTION 3:
//    System.out.println("Is node 'F' a leaf: " + T.isLeaf(2));  //false
//    System.out.println("Is node 'K' a leaf: " + T.isLeaf(9));  //true
//
//    // QUESTION 4:
//    System.out.println("The total leaves of the Tree is: " + T.countLeaves());  //10
//
//    // QUESTION 5:
//    System.out.println("The level of node 'A' is: " + T.getLevel(0));  //0
//    System.out.println("The level of node 'J' is: " + T.getLevel(3));  //1
//    System.out.println("The level of node 'L' is: " + T.getLevel(10));  //2
//    System.out.println("The level of node 'P' is: " + T.getLevel(13));  //3
//
//    // QUESTION 6:
//    System.out.println("The depth of the Tree is: " + T.getDepth());  //3
//
//    // QUESTION 7:
//    System.out.println("Search for node data 'G'. The result is: " + T.search("G"));  //7
//    System.out.println("Search for node data 'X'. The result is: " + T.search("X"));  //-1
  }  
}
