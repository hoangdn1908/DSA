/**
 * Class InfixToPostfix implements an algorithm to convert an infix expression to a postfix expression.
 * Please refer to Topic 06 for the algorithm in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

package Week8;

class InfixToPostfix {
  String infix;

  /**
   * Constructor for objects of class InfixToPostfix.
   */
  public InfixToPostfix(String infix) {
    this.infix = infix;
  }

  public String convertToPostfix() {
    // The result string
    String postfix = "";

    // Initialize an ArrayStack of character items
    ArrayStack<Character> st = new ArrayStack<Character>();

    // Construct a for loop to process the infix from left to right
    for (int i = 0; i < infix.length(); i++) {
      // Get a symbol c from infix
      char c = infix.charAt(i);

      // QUESTION 1
      // Write java code to implement this step of the algorithm

      if (('0' <= c) && (c <= '9')) { // if c is an operand
        // QUESTION 1 p1
        // Write java code to implement this step

        // End of QUESTION 1 p1

      }
      if (c == '(') { // if c is a left parentheses
        // QUESTION 1 p2
        // Write java code to implement this step

        // End of QUESTION 1 p1
      }

      // End of QUESTION 1

      if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) { // if c is an operator

        // QUESTION 2
        // Write java code to implement this step of the algorithm

        // End of QUESTION 2
      }
      if (c == ')') { // if c is a right parentheses
        // QUESTION 3
        // Write java code to implement this step of the algorithm

        // End of QUESTION 3
      }
    }
    // When we finish processing the infix, we pop all the operators from the stack
    while (!st.isEmpty()) {
      postfix = postfix + st.pop() + " ";
    }
    return postfix;
  }

  // An utility function to return precedence of a given operator
  // Higher returned value means higher precedence
  private static int priority(char c) {
    if (c == '(')
      return 1;
    if ((c == '+') || (c == '-'))
      return 2;
    if ((c == '*') || (c == '/'))
      return 3;
    return 0;
  }
}