/**
 * Class PostfixEvaluation implements an algorithm to evaluate a postfix expression.
 * Please refer to Topic 06 for the algorithm in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

package Week8;

class PostfixEvaluation {
  private String postfix;

  public PostfixEvaluation(String postfix) {
    this.postfix = postfix;
  }

  public int evaluate() {
    int result = 0;

    // Initialize an ArrayStack of integer items
    ArrayStack<Integer> st = new ArrayStack<Integer>();

    // Construct a for loop to process postfix from left to right
    for (int i = 0; i < postfix.length(); i++) {

      // Get a symbol c from exp
      char c = postfix.charAt(i);

      // QUESTION 4
      // Write java code to implement this step of the algorithm

      if (('0' <= c) && (c <= '9')) { // if c is an operand
        // QUESTION 4 p1
        // Write java code to implement this step

        // End of QUESTION 4 p1

      } else if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) { // if c is an operator
        // QUESTION 4 p2
        // Write java code to implement this step

        // End of QUESTION 4 p2
      }

      // End of QUESTION 4
    }
    result = st.pop();
    return result;
  }

}