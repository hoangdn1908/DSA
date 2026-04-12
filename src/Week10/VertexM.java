/**
 * Class VertexM implements a vertex of a graph data structure using adjacency list representation. 
 * Each vertex has an id and a data that is a generic type T.
 * Please refer to Topic 08 for graph implementation in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

 package Week10;

public class VertexM<T> {
  private int id;
  private T data;
  
  /**
   * Constructor for objects of class VertexM.
   * This constructor will create a vertex with id and data.
   */  
  public VertexM(int id, T data) {
    this.id = id;
    this.data = data;
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

  public String toString() {
    return "Vertex[id=" + id + ", data=" + data + "]";
  }
}