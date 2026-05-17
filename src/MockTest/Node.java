package MockTest;

public class Node {
    private int val;
    private Node next;

    public Node()
    {
        val = 0;
        next = null;
    }

    public Node(int val)
    {
        this.val = val;
        next = null;
    }

    public Node(int val, Node next)
    {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
