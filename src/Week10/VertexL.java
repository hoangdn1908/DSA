/**
 * Class VertexL implements a vertex of a graph data structure using adjacency list representation. 
 * Each vertex has an id, a data that is a generic type T, and a list that contains edges from this vertex to its adjecent vertices.
 * Please refer to Topic 08 for graph implementation in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

import java.util.ArrayList;

public class VertexL<T> {
  private int id;
  private T data;
  private ArrayList<EdgeL> adjList; // list of adjacent edges associated to the vertex

  /**
   * Constructor for objects of class VertexL.
   * This constructor will create a vertex with id, data, and an empty list of
   * adjacent edges.
   */
  public VertexL(int id, T data) {
    this.id = id;
    this.data = data;
    adjList = new ArrayList<EdgeL>();
  }

  public int getId() {
    return id;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void addAdj(int adjId, int weight) {
    EdgeL edge = new EdgeL(id, adjId, weight);
    adjList.add(edge);
  }

  public void removeAdj(int adjId) {
    adjList.removeIf(edge -> edge.getEnd() == adjId);
  }

  public ArrayList<EdgeL> getAdjList() {
    return adjList;
  }

  // Check whether a vertex id exists in the list of adjacent vertices
  public boolean inAdjList(int id) {
    return adjList.stream().anyMatch(edge -> edge.getEnd() == id);
  }

  // Get weight of an edge in the adjacent edges list
  public int getWeight(int adjId) {
    return adjList.stream().filter(edge -> edge.getEnd() == adjId).findFirst().get().getWeight();  
  }
  
  public String toString() {
    String outText = "Vertex[id=" + id + ", data=" + data + "] -> ";
    String adjTxt = "[";
    for (EdgeL edge : adjList) {
      adjTxt += edge.toString() + ",";
    }
    // Remove the ',' character in the end of the adjTxt
    if (adjTxt.charAt(adjTxt.length() - 1) == ',')
      adjTxt = adjTxt.substring(0, adjTxt.length() - 1);
    
    adjTxt += "]";
    return outText + adjTxt;
  }
}