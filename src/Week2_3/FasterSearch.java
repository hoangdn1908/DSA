package Week2_3;

import java.util.Arrays;
import java.util.Scanner;

public class FasterSearch {
    /**
     * Constructor for objects of class FasterSearch
     */
    public FasterSearch() {
    }
    //Quest1
    public static void print_array(int [] a) {
        Arrays.sort(a);
        for(int num : a)
        {
            System.out.println(num + " ");
        }
    }

    //Quest2
    public static int Search(int [] a, int m, int left, int right) {
        while (left < right-1) {
           int mid = left + (right - left)/ 2;
           if(a[mid] == m) return mid;
           else if(a[mid] < m) left = mid;
           else right = mid;
        }
        if (a[left]==m)
            return left;
        if (a[right]==m)
            return right;
        return -1;
    }

    //Quest3
    public static int RecSearch(int []a, int m, int left, int right) {
        if (left == right-1) {
            if (a[left]==m)
                return left;
            if (a[right]==m)
                return right;
            return -1;
        }
        else {
            int mid = left + (right - left)/ 2;
            if(a[mid] == m) return mid;
            else if(a[mid] < m) return RecSearch(a,m,mid, right);
            else return RecSearch(a,m,left,mid);
        }
    }

    public static void main(String[] args) {
        int n,m;
        int [] a;

        System.out.println("Please enter the integer n:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        a=new int[n];

        for (int i=0; i<a.length; i++) {
            System.out.println("Please enter the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }

        System.out.println("The array after sort is:");
        print_array(a);

        System.out.println("Please enter the integer m for searching:");
        m=scanner.nextInt();

        System.out.println("The search result is: " + Search(a,m,0,a.length-1));
        System.out.println("The search result is (using recursive version): " + RecSearch(a,m,0,a.length-1));
    }
}
