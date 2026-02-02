package Week2_3;

import java.util.Scanner;

public class FasterGCD {
    /**
     * Constructor for objects of class FasterGCD
     */
    public FasterGCD() {
    }

    // This recursive method implement the Euclidean algorithm
    // to find gcd of two integers
    public static int recGCD(int m, int n) {
        if(n == 0) return m;
        return recGCD(n, m% n);
    }

    // This method implement the Euclidean algorithm
    // to find gcd of two integers
    public static int loopGCD(int m, int n) {
        while(n != 0)
        {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        int m,n;

        System.out.println("Please enter the integer m:");
        Scanner scanner = new Scanner(System.in);
        m=scanner.nextInt();

        System.out.println("Please enter the integer n (n<=m):");
        n=scanner.nextInt();

        System.out.println("The gcd("+ m + "," + n + ") is: " + recGCD(m,n));
        System.out.println("The gcd("+ m + "," + n + ") using loop is: " + loopGCD(m,n));
    }
}
