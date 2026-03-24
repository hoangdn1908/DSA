/**
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

package Week7;

public class Book {
  private String title;
  private String author;

  /**
   * Constructor for objects of class Book
   */
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String toString() {
    return "<" + title + " : " + author + ">";
  }
}