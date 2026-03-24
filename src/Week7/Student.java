/**
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

package Week7;

public class Student {
  private String id;
  private String name;

  /**
   * Constructor for objects of class Student
   */
  public Student(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "(" + id + "," + name + ")";
  }
}