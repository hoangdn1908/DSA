/**
 * Class GraphM implements a graph data structure using  adjacency matrix. A graph contains a list of vertices.
 * Please refer to Topic 08 for graph implementation in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

import java.util.Arrays;
import java.util.ArrayList;

public class GraphM<T> {
  private int maxSize = 100;
  private ArrayList<VertexM<T>> vertices;
  private int[][] adjMatrix;
  private boolean weighted;
  private boolean directed;

  /**
   * Constructor for objects of class GraphM.
   * This constructor will create an empty graph.
   */
  public GraphM(boolean directed, boolean weighted) {
    vertices = new ArrayList<VertexM<T>>();
    adjMatrix = new int[maxSize][maxSize];
    for (int i = 0; i < maxSize; i++)
      Arrays.fill(adjMatrix[i], 0);
    this.directed = directed;  
    this.weighted = weighted;
  }

  // Add a vertex to the graph by providing a vertex instance
  public void addVertex(VertexM<T> v) {
    vertices.add(v);
  }

  // Create a new vertex with data and add it to the graph
  public void addVertex(T data) {
    VertexM<T> v = new VertexM<T>(vertices.size() + 1, data);
    addVertex(v);
  }

  // Get a vertex with provided id
  public VertexM<T> getVertex(int id) {
    return vertices.get(id);
  }

  // Get all vertices of the graph
  public ArrayList<VertexM<T>> getVertices() {
    return vertices;
  }

  // Add an edge to the graph by providing the id of two vertices
  // The graph and edge are unweighted
  public void addEdge(int id1, int id2) {
    adjMatrix[id1][id2] = 1;
    if (!directed) {
      adjMatrix[id2][id1] = 1;
    }
  }

  // Add an edge to the graph by providing the ids of two vertices
  // The edge is weighted
  public void addEdge(int id1, int id2, int weight) {
    int w = weighted ? weight : 1; // if graph is unweighted, set weight to 1
    adjMatrix[id1][id2] = w;
    if (!directed) {
      adjMatrix[id2][id1] = w;
    }
  }

  // Add an edge to the graph by providing two vertex objects
  // The graph and edge are unweighed
  public void addEdge(VertexM<T> v1, VertexM<T> v2) {
    addEdge(v1.getId(), v2.getId());
  }

  // Add an edge to the graph by providing two vertex objects
  // The edge is weighed
  public void addEdge(VertexM<T> v1, VertexM<T> v2, int weight) {
    addEdge(v1.getId(), v2.getId(), weight);
  }

  // Remove an edge from the graph by providing the ids of two vertices
  public void removeEdge(int id1, int id2) {
    adjMatrix[id1][id2] = 0;
    if (!directed) {
      adjMatrix[id1][id2] = 0;
    }
  }

  // Remove an edge from the graph by providing two vertex objects
  public void removeEdge(VertexM<T> v1, VertexM<T> v2) {
    removeEdge(v1.getId(), v1.getId());
  }

  // Get the weight of an edge by providing the ids of two vertices
  public int getWeight(int id1, int id2) {
    return adjMatrix[id1][id2];
  }

  // Get the weight of an edge by providing two vertex objects
  public int getWeight(VertexM<T> v1, VertexM<T> v2) {
    return getWeight(v1.getId(), v2.getId());
  }

  // Check if the graph is weighted or unweighted
  public boolean isWeighted() {
    return weighted;
  }

  // Check if the graph is directed or undirected
  public boolean isDirected() {
    return directed;
  }

  // Check if there is an edge connecting two vertices
  // Ids of two vertices are provided
  public boolean hasEdge(int id1, int id2) {
    return adjMatrix[id1][id2] != 0;
  }

  // Check if there is an edge connecting two vertex instaces
  public boolean hasEdge(VertexM<T> v1, VertexM<T> v2) {
    return hasEdge(v1.getId(), v2.getId());
  }

  // Get the number of vertices of the graph
  public int getNumVertices() {
    return vertices.size();
  }


  //Get the number of edges of the graph
  public int getNumEdges() {
    // This method isn't implemented yet

    return 0;
  }


  // Helper method to get all adjacent vertices of a vertex in the graph
  // The vertex id is provided
  private ArrayList<VertexM<T>> getAdjacentVertices(int id) {
    ArrayList<VertexM<T>> adjacentVerties = new ArrayList<VertexM<T>>();
    for (VertexM<T> u : vertices) {
      if (hasEdge(id, u.getId())) {
        adjacentVerties.add(u);
      }
    }
    return adjacentVerties;
  }

  // Helper method to get all adjacent vertices of a vertex instance in the graph
  private ArrayList<VertexM<T>> getAdjacentVertices(VertexM<T> v) {
    return getAdjacentVertices(v.getId());
  }

  // Traversing the graph using BFS algorithm, starting from a vertex instance
  public void bfsTraversing(VertexM<T> u) {
    // This method isn't implemented yet

  }

  // Traversing the graph using BFS algorithm, starting from a vertex
  // The vertex id is provided
  public void bfsTraversing(int id) {
    VertexM<T> u = vertices.get(id);
    bfsTraversing(u);
  }

  // Traversing the graph using DFS algorithm, starting from a vertex instance
  // The DFS implementation is non-recursive
  public void dfsTraversing(VertexM<T> u) {
    // This method isn't implemented yet    
  }

  // Traversing the graph using DFS algorithm, starting from a vertex
  // The DFS implementation is non-recursive. The vertex id is provided
  public void dfsTraversing(int id) {
    VertexM<T> u = vertices.get(id);
    dfsTraversing(u);
  }

  // Traversing the graph using DFS algorithm, starting from a vertex instance
  // The DFS implementation is recursive
  public void dfsRecurTraversing(VertexM<T> u, boolean[] visited) {
    // This method isn't implemented yet    
  }

  // Traversing the graph using DFS algorithm, starting from a vertex
  // The DFS implementation is recursive. The vertex id is provided
  public void dfsRecurTraversing(int id, boolean[] visited) {
    VertexM<T> u = vertices.get(id);
    dfsRecurTraversing(u, visited);
  }

  // Returns a string representation of the graph
  public String toString() {
    String outTxt = "";
    for (VertexM<T> v : vertices) {
      outTxt += v.toString() + " ";
    }
    outTxt = "Graph[" + outTxt + "]\n";
    outTxt += "Adjacency matrix:\n";
    int n = getNumVertices();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        outTxt += adjMatrix[i][j] + " ";
      outTxt += "\n";
    }
    return outTxt;
  }
}