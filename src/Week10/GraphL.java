/**
 * Class GraphL implements a graph data structure using adjacency list. A graph contains a list of vertices.
 * Please refer to Topic 08 for graph implementation in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

import java.util.ArrayList;

public class GraphL<T> {
  protected ArrayList<VertexL<T>> vertices;
  protected boolean directed;
  protected boolean weighted;

  /**
   * Constructor for objects of class GraphL
   * This constructor creates an empty graph.
   */
  public GraphL(boolean directed, boolean weighted) {
    this.directed = directed;
    this.weighted = weighted;
    vertices = new ArrayList<VertexL<T>>();
  }

  // Add a vertex to the graph by providing a vertex instance
  public void addVertex(VertexL<T> v) {
    vertices.add(v);
  }

  // Create a new vertex with data and add it to the graph
  public void addVertex(T data) {
    VertexL<T> v = new VertexL<T>(vertices.size() + 1, data);
    addVertex(v);
  }

  // Get a vertex with provided id
  public VertexL<T> getVertex(int id) {
    return vertices.get(id);
  }

  // Get all vertices of the graph
  public ArrayList<VertexL<T>> getVertices() {
    return vertices;
  }

  // Add an edge to the graph by providing the id of two vertices
  // The graph and edge are unweighted
  public void addEdge(int id1, int id2) {
    VertexL<T> v1 = getVertex(id1);
    VertexL<T> v2 = getVertex(id2);
    v1.addAdj(id2, 1);
    if (!directed) {
      v2.addAdj(id1, 1);
    }
  }
  // Add an edge to the graph by providing the id of two vertices
  // The edge is weighted
  public void addEdge(int id1, int id2, int weight) {
    int w = weighted ? weight : 1; // if graph is unweighted, set weight to 1
    VertexL<T> v1 = getVertex(id1);
    VertexL<T> v2 = getVertex(id2);
    v1.addAdj(id2, w);
    if (!directed) {
      v2.addAdj(id1, w);
    }
  }

  // Add an edge to the graph by providing two vertex objects
  // The graph and edge are unweighted
  public void addEdge(VertexL<T> v1, VertexL<T> v2) {
    addEdge(v1.getId(), v2.getId());
  }

  // Add an edge to the graph by providing two vertex objects
  // The edge is weighted
  public void addEdge(VertexL<T> v1, VertexL<T> v2, int weight) {
    addEdge(v1.getId(), v2.getId(), weight);
  }

  // Remove an edge from the graph by providing the ids of two vertices
  public void removeEdge(int id1, int id2) {
    VertexL<T> v1 = getVertex(id1);
    VertexL<T> v2 = getVertex(id2);
    v1.removeAdj(id2);
    if (!directed) {
      v2.removeAdj(id1);
    }
  }

  // Remove an edge from the graph by providing two vertex objects
  public void removeEdge(VertexL<T> v1, VertexL<T> v2) {
    removeEdge(v1.getId(), v1.getId());
  }

  // Get weight of an edge by providing the ids of two vertices
  public int getWeight(int id1, int id2) {
    VertexL<T> v1 = getVertex(id1);
    return v1.getWeight(id2);
  }

  // Get weight of an edge by providing two vertex objects
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
    VertexL<T> v1 = getVertex(id1);
    return v1.inAdjList(id2);
  }

  // Check if there is an edge connecting two vertex instances
  public boolean hasEdge(VertexL<T> v1, VertexL<T> v2) {
    return hasEdge(v1.getId(), v2.getId());
  }

  // Get the number of vertices in the graph
  public int getNumVertices() {
    return vertices.size();
  }

  //Get the number of edges in the graph
  public int getNumEdges() {
    // This method isn't implemented yet

    return 0;
  }

  // Traversing the graph using BFS algorithm, starting from a vertex instance
  public void bfsTraversing(VertexL<T> u) {
    // This method isn't implemented yet
  }

  // Traversing the graph using BFS algorithm, starting from a vertex
  // The vertex id is provided
  public void bfsTraversing(int id) {
    VertexL<T> u = vertices.get(id);
    bfsTraversing(u);
  }

  // Traversing the graph using DFS algorithm, starting from a vertex instance
  // The DFS implementation is non-recursive
  public void dfsTraversing(VertexL<T> u) {
    // This method isn't implemented yet    
  }

  // Traversing the graph using DFS algorithm, starting from a vertex
  // The DFS implementation is non-recursive. The vertex id is provided
  public void dfsTraversing(int id) {
    VertexL<T> u = vertices.get(id);
    dfsTraversing(u);
  }

  // Traversing the graph using DFS algorithm, starting from a vertex instance
  // The DFS implementation is recursive
  public void dfsRecurTraversing(VertexL<T> u, boolean[] visited) {
    // This method isn't implemented yet    
    
  }

  // Traversing the graph using DFS algorithm, starting from a vertex
  // The DFS implementation is recursive. The vertex id is provided
  public void dfsRecurTraversing(int id, boolean[] visited) {
    VertexL<T> u = vertices.get(id);
    dfsRecurTraversing(u, visited);
  }
  
  // Returns a string representation of the graph
  public String toString() {
    String outTxt = "Graph[\n";
    for (VertexL<T> v : vertices) {
      outTxt += v.toString() + "\n";
    }
    return outTxt + "]";
  }
}