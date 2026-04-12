/**
 * Class TopologicalApp demonstrate how to use the GraphDAG data structure 
 * which is implemented a DAG using adjacency list. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

public class TopologicalApp {
  public TopologicalApp() {
  }

  public static void main(String[] args) {
    // Initialize a DAG Graph
    GraphDAG<String> graph = new GraphDAG<String>(false);
    VertexL<String> v0 = new VertexL<String>(0, "0");
    VertexL<String> v1 = new VertexL<String>(1, "1");
    VertexL<String> v2 = new VertexL<String>(2, "2");
    VertexL<String> v3 = new VertexL<String>(3, "3");
    VertexL<String> v4 = new VertexL<String>(4, "4");
    VertexL<String> v5 = new VertexL<String>(5, "5");

    graph.addVertex(v0);
    graph.addVertex(v1);
    graph.addVertex(v2);
    graph.addVertex(v3);
    graph.addVertex(v4);
    graph.addVertex(v5);

    graph.addEdge(v4, v0);
    graph.addEdge(v5, v0);
    graph.addEdge(v4, v1);
    graph.addEdge(v5, v2);
    graph.addEdge(v2, v3);
    graph.addEdge(v3, v1);

    System.out.println("Find a topological order with BFS");
    //graph.topoSortBFS();

    System.out.println("Find a topological order with DFS");
    //graph.topoSortDFS();
  }
}