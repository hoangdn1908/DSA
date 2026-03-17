package Week6;

public class PolyNode {
    private float coef;
    private int exp;
    private PolyNode next;

    // QUESTION 3
    // Write java code to implement this class
    public PolyNode(float coef, int exp)
    {
        this.coef = coef;
        this.exp = exp;
        this.next = null;
    }

    public void setNext(PolyNode node)
    {
        this.next = node;
    }

    public PolyNode getNext()
    {
        return this.next;
    }

    public float getCoef()
    {
        return this.coef;
    }

    public int getExp()
    {
        return this.exp;
    }

    public void setCoef(float coef)
    {
        this.coef = coef;
    }

    public void setExp(int exp)
    {
        this.exp = exp;
    }
    // End of the question

    public String toString() {
        if (exp > 0)
            return String.format("%.1f",coef) + "x^" + exp;
        return String.format("%.1f",coef);
    }

}