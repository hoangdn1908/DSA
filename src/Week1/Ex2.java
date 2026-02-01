package Week1;

import java.util.Scanner;

public class Ex2 {
    /**
     * Constructor for objects of class Exercise02
     */
    public Ex2() {

    }

    // Find out the maximum integer in the array
    public static int FindMax(int [] a) {
        int max = Integer.MIN_VALUE;
        for(int num : a)
        {
            if(num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int n;
        int [] a;

        System.out.println("Please input the integer N:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        a=new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }

        System.out.println("The list of " + n + " integers is:");
        for (int i=0; i<n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");

        System.out.println("The maximum integer of the list is: " + FindMax(a));
    }
}
