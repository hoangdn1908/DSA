package Week6;

public class ArrayList {
    private int[] items;
    private int maxSize=100;
    private int length;

    /**
     * Constructor for objects of class ArrayList.
     * This constructor creates an empty list.
     */
    public ArrayList() {
        items=new int[maxSize];
        length=0;
    }

    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */
    public boolean isEmpty() {
        if (length == 0)
            return true;
        else
            return false;
    }

    /**
     * This operation returns true if the list is full, otherwise it returns false
     */
    public boolean isFull() {
        if (length == maxSize)
            return true;
        else
            return false;
    }

    /**
     * This operation returns the current length of the list.
     */
    public int getLength() {
        return length;
    }

    /**
     * This operation adds a newNode right after the pos position of the list.
     */
    public void add(int pos, int item) {
        if (!isFull()){
            length++;
            for (int i=length - 1; i>=pos; i--)
                items[i]=items[i-1];
            items[pos-1]=item;
        }
    }

    /**
     * This operation delete the node at the pos postition of the list.
     */
    public void remove(int pos) { // 1 2 3 4 5
        // QUESTION 1
        // Write java code to implement this method
         if(!isEmpty())
         {
             for(int i = pos - 1; i < length - 1; i++)
             {
                 items[i] = items[i + 1];
             }
             length--;
         }
        // End of the method
    }

    /**
     * This operation remove all nodes from the list.
     */
    public void removeAll() {
        length=0;
    }

    /**
     * This operation returns the node at the pos position of the list.
     */
    public int get(int pos) {
        return items[pos-1];
    }

    public String toString() {
        if (isEmpty())
            return "[]";

        String outTxt="[" + items[0];
        for (int i=1; i<length; i++)
            outTxt = outTxt + ", " + items[i];
        outTxt+="]";
        return outTxt;
    }
}