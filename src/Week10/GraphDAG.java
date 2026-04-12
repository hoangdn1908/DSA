/**
 * Class GraphDAG implements a DAG graph using adjacency list. It is extended from GraphL class.
 * Please refer to Topic 08 for DAG graph in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

 import java.util.ArrayList;
 import java.util.HashMap;
 
 public class GraphDAG<T> extends GraphL<T> {
   private HashMap<Integer, Integer> inDegree;
   private ArrayList<Integer> topoOrder;
   /**
    * Constructor for objects of class GraphDAG
    * This constructor creates an empty graph.
    */
   public GraphDAG(boolean weighted) {
     super(true, weighted);
   }
 
   private void printTopoOrder() {
     // If the topoOrder list doesn't have all vertices, it means that there is a cycle in the graph
     if (topoOrder.size() != vertices.size()) {
       System.out.println("The graph has a cycle, and no topological ordering exists.");
     } else {
       System.out.println("The topological ordering is: ");
       for (int i = 0; i < topoOrder.size(); i++)
         System.out.print(getVertex(topoOrder.get(i)).getData() + " ");
       System.out.println();
     }
   }
   
   // Perform recursive DFS traversing starting from a vertex of the graph
   private void topoDFSTraversing(VertexL<T> u, boolean[] visited, ArrayStack<Integer> stack) {
     // This method isn't implemented yet
     
   }
   
   // Find a topological order of the graph using DFS
   public void topoSortDFS() {
     boolean[] visited = new boolean[getNumVertices()];
     ArrayStack<Integer> stack = new ArrayStack<Integer>();
 
     // Call the DFS traversing for all unvisited vertices
     for (VertexL<T> v : vertices) {
       if (!visited[v.getId()]) {
         topoDFSTraversing(v, visited, stack);
       }
     }
 
     // Pop the vertice ids from the stack and add them to the topological order
     topoOrder = new ArrayList<Integer>();
     while (!stack.isEmpty()) {
       topoOrder.add(stack.pop());
     }
     
     printTopoOrder();
   }
   
   // Count in-degree of all vertices in the graph
   public void findInDegree() {
     // Set in-degree of each vertex to zero
     for (VertexL<T> v : vertices) {
       inDegree.put(v.getId(), 0);
     }
 
     // Count in-degree of each vertex
     // Loop through every vertex and add 1 in-degree count to its neighbors
     for (VertexL<T> u : vertices) {
       // Get all adjacent vertices of the vertex u
       ArrayList<EdgeL> edges = u.getAdjList();
       for (EdgeL e : edges) {
         int vId = e.getEnd();  // Get the id of vertex v which is an adjacent vertex of u
         int currentInDegree = inDegree.get(vId);
         inDegree.put(vId, currentInDegree + 1);
       }
     }
   }
 
   // Find a topological order of the graph using BFS
   public void topoSortBFS() {
     inDegree = new HashMap<Integer, Integer>();
     topoOrder = new ArrayList<Integer>();
     ArrayQueue<Integer> queue = new ArrayQueue<Integer>();  // A queue contain vertices ids
     
     findInDegree();
     
     // Loop through all vertices and add any vertex that have 0 in-degree into queue
     for (VertexL<T> v : vertices) {
       int vId = v.getId();
       if (inDegree.get(vId) == 0) {
         queue.enqueue(vId); // Add vertex id to queue 
       }
     }
 
     while (!queue.isEmpty()) {
       // Get a vertex from the queue and add to the topological short list      
 
       // This piece of code isn't implemented yet
 
       // Get all adjacent vertices of the vertex frontVertex
       // Decrease the in-degree of every adjacent vertices by one
       // If in-degree of a vertex is now zero, add the vertex id to queue
 
       // This piece of code isn't implemented yet
     }
     
     printTopoOrder();
   }  
 }