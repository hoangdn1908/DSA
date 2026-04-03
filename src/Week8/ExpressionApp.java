/**
 * Class ExpressionApp demonstrates how to use the InfixToPostfix and PostfixEvaluation classes.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

package Week8;

class ExpressionApp {
  public static void main(String[] args) {
    String infixString = "(6+2) * ((3-1)*4 +7)";
    InfixToPostfix infix = new InfixToPostfix(infixString);
    System.out.println(infixString);
    String postfixString =  infix.convertToPostfix();
    System.out.println(postfixString);
    
    PostfixEvaluation postfix = new PostfixEvaluation(postfixString);
    System.out.println(postfix.evaluate());
    
  }
}
