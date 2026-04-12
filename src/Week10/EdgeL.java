/**
 * Class EdgeL implements an edge of a graph data structure using adjacency list representation. 
 * Each edge has ids of starting and ending vertices and a weight of the edge.
 * Please refer to Topic 08 for graph implementation in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Week10;

public class EdgeL {
  private int start;
  private int end;
  private int weight;

  public EdgeL(int start, int end, int weight) {
    this.start = start;
    this.end = end;
    this.weight = weight;
  }

  public int getStart() {
    return start;
  }

  public int getEnd() {
    return end;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String toString() {
    return "(" + end + ", " + weight + ")";
  }
}