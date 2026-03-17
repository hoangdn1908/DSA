package Week6;

public class SLNode {
    private String item;
    private SLNode next;

    /**
     * Constructor for objects of class SLNode
     * This constructor create a node from an input item
     */
    public SLNode(String item) {
        this.item=item;
        this.next=null;
    }
    /**
     * This operation sets the next reference to the node specify in the parameter (next)
     */
    public void setNext(SLNode next) {
        this.next=next;
    }
    /**
     * This operation return the next reference
     */
    public SLNode getNext() {
        return this.next;
    }
    /**
     * This operation assigns data of the node to the input item
     */
    public void setData(String item) {
        this.item=item;
    }
    /**
     * This operation return the current data of the node
     */
    public String getData() {
        return this.item;
    }
}
