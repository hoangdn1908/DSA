package Week6;

public class SLList {
    private SLNode head;
    private int length;

    /**
     * Constructor for objects of class SLList.
     * This constructor will create an empty list.
     */
    public SLList() {
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
     * This operation adds a new item into the pos position in the list
     */
    public void add(int pos, String item) {
        // Create a new node to store item data
        SLNode newNode = new SLNode(item);
        if (isEmpty() || (pos == 1)) { // Case 1&2
            length++;
            newNode.setNext(head);
            head = newNode;
        } else {  // Case 3
            SLNode prev = traverse(pos-1); // a b c d
            length++;
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }
    }
    /**
     * This is a private operation (supplementary operation).
     * It returns the node at the pos position in the list.
     */
    private SLNode traverse(int pos) {
        SLNode cur = head;
        for (int i=1; i<pos; i++)
            cur = cur.getNext();
        return cur;
    }

    /**
     * This operation deletes the node at the pos position in the list.
     */
    public void remove(int pos) {
        if (!isEmpty()) { // List is not empty
            length--;
            if (pos == 1) { // Case 1
                SLNode cur = head;
                head=cur.getNext();
            }
            else {  // Case 2
                SLNode prev = traverse(pos-1);
                SLNode cur = prev.getNext();
                prev.setNext(cur.getNext());
            }
        }
    }

    /**
     * This operation remove all nodes from the list.
     */
    public void removeAll(){
        head = null;
        length = 0;
    }

    /**
     * This operation returns the node at the pos position of the list.
     */
    public String get(int pos) {
        if (!isEmpty()) {
            SLNode node = traverse(pos);
            return node.getData();
        }
        else
            return null;
    }

    /**
     * This operation returns the current length of the list.
     */
    public int getLength() {
        return length;
    }

    /**
     * This operation search for a String in the list.
     * If found the operation returns the position of the node contain this integer, otherwise it returns -1.
     */
    public int search(String data) {
        int result = -1;
        // QUESTION 2
        // Write java code to implement this method
        if(!isEmpty())
        {
            SLNode cur = head;
            int pos = 1;
            while(cur != null)
            {
                if(cur.getData().equals(data))
                {
                    result = pos;
                    break;
                }
                cur = cur.getNext();
                pos++;
            }
        }

        // End of the method

        return result;
    }

    public String toString() {
        if (isEmpty())
            return "[]";

        SLNode current = head;
        String outTxt="[" + current.getData();
        for (int i=1; i<length; i++) {
            current = current.getNext();
            outTxt = outTxt + " --> " + current.getData();
        }
        outTxt+="]";
        return outTxt;
    }
}
