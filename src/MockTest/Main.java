package MockTest;

import com.sun.management.UnixOperatingSystemMXBean;

public class Main {
    public static void main(String[] args) {
       ListNode listNode = new ListNode();
       listNode.add(1,3);
       listNode.add(2,5);
       listNode.add(3,15);
       listNode.add(2,30);
       listNode.multipleByThreeAndFive();
        System.out.println(listNode);
    }

//    public static int lcm(int a, int b)
//    {
//        for(int i = 1; i < a * b; i++)
//        {
//            if(i % a == 0 && i % b == 0)
//                return i;
//        }
//        return a * b;
//    }
}
