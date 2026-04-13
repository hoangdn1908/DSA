/**
 * Class ArrayBTree implements Binary Tree data structure using an array. 
 * Binary Tree's nodes are indexed using the numbering scheme introduced in Topic 07.
 * Node has an data of generic type T that is stored in the data array.
 * Please refer to Topic 7 for the Binary Tree ADT in detail.
 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week9;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayBTree<T> {
  private static final int maxSize = 100; // Maximum possible number of nodes in the tree
  private Object[] data;
  private int length;

  /**
   * Constructor for objects of class ArrayBTree
   * Create an empty Binary Tree
   */
  public ArrayBTree() {
    data = new Object[maxSize];
    length = 0;
    Arrays.fill(data, null);
  }

  // Returns true if the current Tree is empty, otherwise returns false
  public boolean isEmpty() {
    return (length == 0);
  }

  // Add the root (with nodeData) to an empty binary tree
  public void addRoot(T nodeData) {
    if (isEmpty()) {
      data[0] = nodeData;
      length++;
    } else
      throw new NoSuchElementException("Binary Tree is not empty");
  }

  // Returns the left child of current node
  public int getLeftChild(int nodeIndex) {
    return 2 * nodeIndex + 1;
  }

  // Returns the right child of current node
  public int getRightChild(int nodeIndex) {
    return 2 * nodeIndex + 2;
  }

  // Returns the parent of current node
  public int getParent(int nodeIndex) {
    return (int) Math.floor((nodeIndex - 1) / 2);
  }

  // Returns the data of current node
  @SuppressWarnings("unchecked")
  public T getNodeData(int nodeIndex) {
    if (!isEmpty()) {
      return (T) data[nodeIndex]; // cast the return object to type T
    } else
      throw new NoSuchElementException();
  }

  // Set node’s data to the nodeData argument.
  public void setNodeData(T nodeData, int nodeIndex) {
    data[nodeIndex] = nodeData;
  }

  // Add a node(with data) as the left child of current node
  public void addLeftChild(T nodeData, int nodeIndex) {
    setNodeData(nodeData, getLeftChild(nodeIndex));
    length++;
  }

  // Add a node (with data) as the right chld of current node
  public void addRightChild(T nodeData, int nodeIndex) {
    setNodeData(nodeData, getRightChild(nodeIndex));
    length++;
  }

  // Perform Tree traversal in pre-order starting from current node.
  // Visit a node means print out the node's data
  public void preOrderTraversal(int nodeIndex) {
    if (data[nodeIndex] != null) {
      System.out.print(data[nodeIndex] + " ");
      preOrderTraversal(getLeftChild(nodeIndex));
      preOrderTraversal(getRightChild(nodeIndex));
    }
  }

  // Returns true if current node is a leaf of the tree,
  // otherwise the method returns false. A leaf node is
  // the node which has no children.
  public boolean isLeaf(int nodeIndex) {
    boolean leaf = true;
    // QUESTION 9
    // Write java code to implement this method

    
    // End of the method

    return leaf;
  }

  // Returns the total number of leaves in the tree
  public int countLeaves() {
    int count = 0;

    // QUESTION 10
    // Write java code to implement this method

    
    // End of the method

    return count;
  }
  
  // Returns the level of current node. The level of a node
  // is the distance from this node to the root of the tree.
  public int getLevel(int nodeIndex) {
    int level = 0;

    // QUESTION 11
    // Write java code to implement this method
        

    // End of the method
    
    return level;
  }

  // Returns the depth of the tree which is the maximum level of all leaves
  // of the tree.
  public int getDepth() {
    int depth = 0;

    // QUESTION 12
    // Write java code to implement this method

    
    // End of the method

    return depth;
  }

  // Perform Tree traversal in in-order starting from current node.
  // Visit a node means print out the node's label
  public void inOrderTraversal(int nodeIndex) {
    // QUESTION 13
    // Write java code to implement this method


    // End of the method    
  }

  // Perform Tree traversal in post-order starting from current node.
  // Visit a node means print out the node's label
  public void postOrderTraversal(int nodeIndex) {
    // QUESTION 14
    // Write java code to implement this method
    

    // End of the method    
    
  }

  // Returns the position (index) of the first node which has data as the nodeData value. 
  // The method will return -1 if the node is not found.
  public int search(T nodeData) {
    // QUESTION 15
    // Write java code to implement this method

    
    // End of the method
    
    return -1;
  }
}
