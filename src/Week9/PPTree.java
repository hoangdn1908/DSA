/**
 * Class PPTree implement Tree data structure using parent pointer approach.
 * Tree's nodes are indexed using the numbering scheme introduced in Topic 7.
 * Node has an data of generic type T that is stored in the data array. 
 * parent array is used to store parent-child relationship.
 * Please refer to Topic 7 for the PPTree ADT in detail.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week9;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PPTree<T> {
  private static final int maxSize = 100;
  private Object[] data;
  private int[] parent;
  private int length;

  /**
   * Constructor for objects of class PPTree
   * This constructor create an empty Tree
   */
  public PPTree() {
    data = new Object[maxSize];
    length = 0;
    parent = new int[maxSize];
    Arrays.fill(parent, -2);
  }

  public boolean hasRoot() {
    for (int i = 0; i < length; i++) {
      if (parent[i] == -1) return true;
    }
    return false;
  }
  // Returns true if the current Tree is full, otherwise returns false
  public boolean isFull() {
    return (length == maxSize - 1);
  }

  // Returns true if the current Tree is empty, otherwise returns false
  public boolean isEmpty() {
    return (length == 0);
  }

  // Adds a new node into the current Tree as the child of the node parentIndex.
  // The argument nodeData contains the new node’s data.
  public void addNode(T nodeData, int parentIndex) {
    if (!isFull()) {
      length++;
      if (parentIndex == -1){
        if (hasRoot()) {
          throw new IllegalStateException("Tree already has a root!");
        }
        data[length - 1] = nodeData;
        parent[length - 1] = -1;
      }else {
        // Finding a correct position in the array for the new node
        int pos = parentIndex+1;
        while ((pos < length-1) && (getParent(pos) <= parentIndex)) {
          pos++;
        }
//        System.out.println("ParentIndex: " + parentIndex + " Pos: " + pos);
        // Shift all array elements from pos one slot to the right
        for (int i = length; i > pos; i--) {
          data[i] = data[i - 1];
          if (parent[i - 1] < pos)
            parent[i] = parent[i - 1];
          else
            parent[i] = parent[i - 1] + 1;
        }
        data[pos] = nodeData;
        parent[pos] = parentIndex;
      }
    }
  }

  // Returns the index of the parent of current node
  public int getParent(int nodeIndex) {
    return parent[nodeIndex];
  }
  
  public T getParentData(int nodeIndex) {
    if (getParent(nodeIndex) != -1)
      return getNodeData(getParent(nodeIndex));
    else
      throw new NoSuchElementException("The node has no parent");
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

  // Returns the left most child of the node. Returns -1 if
  // the node has no children.
  public int leftMostChild(int nodeIndex) {
    int i = nodeIndex + 1;

    // Find the first node i that i's parent is the node (parent[i] == nodeIndex).
    while ((i < length) && (getParent(i) != nodeIndex))
      i++;
    if (getParent(i) == nodeIndex)
      return i;
    else
      return -1;
  }

  // Returns the nearest right sibling node of the node. Returns -1 if
  // the node has no right sibling.
  public int rightSibling(int nodeIndex) {
    int i = nodeIndex + 1;
    // Find the first node i that i's parent is the node's parent
    while ((i < length) && (getParent(i) != getParent(nodeIndex)))
      i++;

    if (getParent(i) == getParent(nodeIndex))
      return i;
    else
      return -1;
  }

  // Returns the degree of a node in the tree. The degree of a
  // node is the numbers of its children.
  public int getDegree(int nodeIndex) {
    int degree = 0;
    // QUESTION 2
    // Write java code to implement this method
    for(int i = 0; i < this.length; i++)
    {
      if(getParent(i) == nodeIndex) degree++;
    }
    // End of the method
    return degree;
  }

  // Returns true if current node is a leaf of the tree,
  // otherwise the method returns false. A leaf node is
  // the node which has no children.
  public boolean isLeaf(int nodeIndex) {
    boolean leaf = true;
    // QUESTION 3
    // Write java code to implement this method
    for(int i = nodeIndex + 1; i < this.length; i++)
    {
     if(getParent(i) == nodeIndex) {
       leaf = false;
       break;
     }
    }
    // End of the method
    return leaf;
  }

  // Returns the total number of leaves in the tree
  public int countLeaves() {
    int count = 0;
    // QUESTION 4
    // Write java code to implement this method
    for(int i = 0; i < this.length; i++)
    {
      if(isLeaf(i)) count++;
    }
    // End of the method
    return count;
  }

  // Returns the level of current node. The level of a node
  // is the distance from this node to the root of the tree.
  public int getLevel(int nodeIndex) {
    int level = 0;
    // QUESTION 5
    // Write java code to implement this method
    while(getParent(nodeIndex) != -1)
    {
      nodeIndex = getParent(nodeIndex);
      level++;
    }
    // End of the method
    return level;
  }

  // Returns the depth of the tree which is the maximum level of all leaves
  // of the tree.
  public int getDepth() {
    int depth = 0;
    // QUESTION 6
    // Write java code to implement this method
    for(int i = 0; i < this.length;i++)
    {
      if(isLeaf(i)) {
        int level = getLevel(i);
        if (level > depth) depth = level;
      }
    }
    // End of the method
    return depth;
  }

  // Returns the position (index) of the first node which has data as the nodeData value. 
  // The method will return -1 if the node is not found.
  public int search(T nodeData) {
    // QUESTION 7
    // Write java code to implement this method
    if(nodeData == null) return -1;
    for(int i = 0; i < this.length;  i++)
    {
      if(nodeData.equals(getNodeData(i))) return i;
    }
    // End of the method
    return -1;
  }
}
