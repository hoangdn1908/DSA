package MockTest;

import java.util.StringTokenizer;

public class ListNode {
    private Node head;
    private int length;

    public ListNode()
    {
        head = null;
        length = 0;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    private Node traverse(int pos) // 1 4 3
    {
        if (isEmpty()) return null;
        Node node = head;
        for(int i = 1; i < pos; i++)
        {
            node = node.getNext();
        }
        return node;
    }

    public void add(int pos, int val)
    {
        Node newNode = new Node(val);
        if(isEmpty())
        {
            newNode.setNext(head);
            head = newNode;
        }
        else
        {
            Node prev = traverse(pos - 1);
            Node cur = prev.getNext();
            newNode.setNext(cur);
            prev.setNext(newNode);
        }
        length++;
    }

    public void remove(int pos)
    {
        if (isEmpty()) return;
        Node prev = traverse(pos - 1);
        Node cur = prev.getNext();
        prev.setNext(cur.getNext());
        length--;
    }

    public int get(int pos)
    {
        if (isEmpty()) return -1;
        return traverse(pos).getVal();
    }

    public void set(int pos, int newVal)
    {
        if (isEmpty()) return;
        Node node = traverse(pos);
        node.setVal(newVal);
    }

    public void multipleByThreeAndFive()
    {
        if (isEmpty()) return;
        Node node = head;
        while(node != null)
        {
            if (node.getVal() % 3 == 0 && node.getVal() % 5  == 0)
            {
                node.setVal(node.getVal() * 1000);
            }
            else if(node.getVal() % 5 == 0)
            {
                node.setVal(node.getVal() * 100);
            }
            else if (node.getVal() % 3 == 0)
            {
                node.setVal(node.getVal() * 10);
            }
            node = node.getNext();
        }
    }

    public String toString()
    {
        if (isEmpty()) return "";
        Node node = head;
        String res = "[" + node.getVal();
        for (int i = 1; i < length; i++)
        {
            node = node.getNext();
            res += " --> " + node.getVal();
        }
        res += "]";
        return res;
    }
}
