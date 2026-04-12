/**
 * Class GraphApp demonstrate how to use the Graph data structure 
 * which is implemented using an adjacency matrix or adjacency list. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

public class GraphApp {
  public GraphApp() {
  }

  public static void main(String[] args) {
    // Initialize an undirected unweighted graph using adjacency matrix representation
    GraphM<String> graph1 = new GraphM<String>(false, false);
    VertexM<String> v0 = new VertexM<String>(0, "0");
    VertexM<String> v1 = new VertexM<String>(1, "1");
    VertexM<String> v2 = new VertexM<String>(2, "2");
    VertexM<String> v3 = new VertexM<String>(3, "3");
    
    graph1.addVertex(v0);
    graph1.addVertex(v1);
    graph1.addVertex(v2);
    graph1.addVertex(v3);
    graph1.addEdge(v0, v1);
    graph1.addEdge(v0, v3);
    graph1.addEdge(v0, v2);
    graph1.addEdge(v1, v2);

    System.out.println("An undirected unweighted graph with adjacency matrix representaion:");
    System.out.println(graph1);

    // Initialize a directed unweighted graph using adjacency list representation
    GraphL<String> graph2 = new GraphL<String>(true, false);
    VertexL<String> v20 = new VertexL<String>(0, "0");
    VertexL<String> v21 = new VertexL<String>(1, "1");
    VertexL<String> v22 = new VertexL<String>(2, "2");
    VertexL<String> v23 = new VertexL<String>(3, "3");
    VertexL<String> v24 = new VertexL<String>(4, "4");
    graph2.addVertex(v20);
    graph2.addVertex(v21);
    graph2.addVertex(v22);
    graph2.addVertex(v23);
    graph2.addVertex(v24);
    graph2.addEdge(v20, v21);
    graph2.addEdge(v20, v23);
    graph2.addEdge(v21, v22);
    graph2.addEdge(v22, v20);
    graph2.addEdge(v23, v22);
    graph2.addEdge(v24, v20);
    graph2.addEdge(v24, v21);
    graph2.addEdge(v24, v22);    

    System.out.println("An directed unweighted graph with adjacency list representaion:");
    System.out.println(graph2);

  }
}