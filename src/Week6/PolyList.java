package Week6;

public class PolyList {
    private PolyNode head;
    private int length;

    /**
     * Constructor for objects of class PolyList.
     * This constructor will create an empty list.
     */
    public PolyList() {
        head = null;
        length = 0;
    }
    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */
    public boolean isEmpty(){
        if (length == 0)
            return true;
        else
            return false;
    }

    /**
     * This is a private operation (supplementary operation).
     * It returns the node before the exp in the list.
     */
    private PolyNode traverse(int exp) {
        PolyNode cur = head;
        // QUESTION 4
        // Write java code to implement this method
        while (cur != null)
        {
            if(cur.getExp() == exp) break;
            cur = cur.getNext();
        }
        // End of the question
        return cur;
    }

    /**
     * This operation adds a new term into the polynomial
     */
    public void addTerm(float coef, int exp) {
        // QUESTION 5
        // Write java code to implement this method
        PolyNode node = traverse(exp);
        if(node != null)
        {
            node.setCoef(node.getCoef() + coef);
        }
        else
        {
            PolyNode newNode = new PolyNode(coef, exp);
            PolyNode cur = head;
            PolyNode prev = null;
            if(isEmpty())
            {
                head = newNode;
            }
            else
            {
                if(cur.getExp() < newNode.getExp())
                {
                    newNode.setNext(cur);
                    head = newNode;
                }
                else
                {
                    while (cur != null && cur.getExp() > newNode.getExp())
                    {
                        prev = cur;
                        cur = cur.getNext();
                    }
                    newNode.setNext(cur);
                    if(prev != null) prev.setNext(newNode);
                }
            }
            length++;
        }

        // End of the method
    }


    public PolyNode getHead() {
        return head;
    }

    public void add(PolyList p) {
        // QUESTION 6
        // Write java code to implement this method
        PolyNode node = p.head;
        while (node != null)
        {
            addTerm(node.getCoef(), node.getExp());
            node = node.getNext();
        }

        // End of the method
    }

    public void subtract(PolyList p) {
        // QUESTION 7
        // Write java code to implement this method
        PolyNode node = p.head;
        while (node != null)
        {
            addTerm(-node.getCoef(), node.getExp());
            node = node.getNext();
        }
        // End of the method
    }

  public String toString() {
    if (isEmpty())
      return "[]";
    PolyNode current = head;
    String outTxt="[" + current.toString();
    for (int i=1; i<length; i++) {
      current = current.getNext();
      if (current.getCoef() > 0)
        outTxt = outTxt + "+" + current.toString();
      if (current.getCoef() < 0)
        outTxt = outTxt + current.toString();
    }
    outTxt+="]";
    return outTxt;
  }
}
