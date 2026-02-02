package Week4;

import java.util.Scanner;

public class RearRangeArray {
    /**
     * Constructor for objects of class Exercise03
     */
    public RearRangeArray() {
    }

    public static void printArray(int[] a) {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    /**
     * This method implement an O(n) algorithm to rearrange array a so that
     * the left part is the elements that is smaller than m,
     * the right part is the elements that is bigger than m.
     */
    public static void rearrangeArray(int[] a, int m) {
       int left = 0;
       int right = a.length - 1;
       while(left < right)
       {
           while(a[left] < 0 && left < right) left++;
           while (a[right] > 0 && left < right) right--;
           if(a[left] > 0 && a[right] < 0)
           {
               int temp = a[left];
               a[left] = a[right];
               a[right] = temp;
               right--;
               left++;
           }
       }
    }

    public static void main(String[]args)
    {
        int n;
        int[] a;

        System.out.println("Please input the integer n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        a = new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("Please input the integer a["+i+"]:");
            a[i] = scanner.nextInt();
        }

        System.out.println("The input array is : ");
        printArray(a);
        rearrangeArray(a,0);
        System.out.println("The rearranged array is : ");
        printArray(a);
    }
}
